package com.thiagov2a.exchango.modelo;

import java.util.Map;

public record MonedaAPI(String result,
                        String base_code,
                        Map<String, Double> conversion_rates) {
}
