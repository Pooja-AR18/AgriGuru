package com.agriguru.service;
import com.agriguru.model.PriceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class PredictionService {

    @Autowired
    private TwilioService twilioService;

    public Map<String, Object> predictAndNotify(PriceRequest req) {
        // Dummy values (replace with real model later)
        double predictedPrice = 2500;
        double pastPrice = 2200;

        String msg = String.format("Price Alert! %s in %s changed from ₹%.2f to ₹%.2f.",
                req.getCrop(), req.getMarket(), pastPrice, predictedPrice);
        twilioService.sendSms(req.getPhone(), msg);

        Map<String, Object> response = new HashMap<>();
        response.put("predicted_price", predictedPrice);
        response.put("previous_price", pastPrice);
        return response;
    }
}
