package com.example.shrsyc.week1.project_week1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "Syrup",havingValue = "Strawberry")
public class SSyrup implements Syrup {
    @Override
    public String getSyrupType() {
        return "Strawberry Syrup";
    }
}
