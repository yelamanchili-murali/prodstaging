package com.example.prodstaging;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class Entrypoint {

    @Value("${app.property1}")
    private String appProperty1;

    @Value("${app.property1}")
    private String appProperty2;

    @GetMapping
    @ResponseBody
    public Map<String, String> home() {
        Map<String, String> map = new HashMap<>();
        map.put("appProperty1", appProperty1);
        map.put("appProperty2", appProperty2);
        return map;
    }
}
