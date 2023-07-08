package com.example.prodstaging;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class Entrypoint {

    @Value("${app.property1}")
    private String appProperty1;

    @Value("${app.property2}")
    private String appProperty2;

    @Value("${app.property3}")
    private String appProperty3;

    @Value("${app.property4}")
    private String appProperty4;

    private Map<String, String> envVars = System.getenv();

    @GetMapping
    @ResponseBody
    public Map<String, String> home() {
        Map<String, String> map1 = new HashMap<>();
        map1.put("appProperty1", appProperty1);
        map1.put("appProperty2", appProperty2);
        map1.put("appProperty3", appProperty3);
        map1.put("appProperty4", appProperty4);

        map1.put("environment", envVars.get("SPRING_PROFILES_ACTIVE"));

        return map1;
    }

    @GetMapping("/envars")
    @ResponseBody
    public Map<String, String> envars() {
        return envVars;
    }
}
