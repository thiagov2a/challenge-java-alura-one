package com.thiagov2a.exchango.servicio;

import com.google.gson.Gson;
import com.thiagov2a.exchango.modelo.MonedaAPI;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public MonedaAPI obtenerMoneda(String divisa) {
        URI url = URI.create("https://v6.exchangerate-api.com/v6/a7582c18e5ba9288995cb5c1/latest/" + divisa.toLowerCase().replace(" ", ""));

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(url).build();
        HttpResponse<String> response = null;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            throw new RuntimeException("No se encontró la divisa.");
        }

        return new Gson().fromJson(response.body(), MonedaAPI.class);
    }
}
