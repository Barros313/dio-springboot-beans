package com.barros.first_steps.dio;

import com.google.gson.Gson;
import org.springframework.stereotype.Component;

@Component
public class ConversorJson {
    private Gson gson = new Gson();

    public ViaCepResponse converter(String json) {
        return gson.fromJson(json, ViaCepResponse.class);
    }
}
