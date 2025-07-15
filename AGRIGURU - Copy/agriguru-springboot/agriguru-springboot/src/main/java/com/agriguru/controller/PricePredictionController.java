package com.agriguru.controller;

import com.agriguru.model.PriceRequest;
import com.agriguru.service.PredictionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class PricePredictionController {
    @Autowired
    private PredictionService predictionService;

    @PostMapping("/predict")
    public Map<String, Object> predict(@RequestBody PriceRequest request) {
        return predictionService.predictAndNotify(request);
    }

}
