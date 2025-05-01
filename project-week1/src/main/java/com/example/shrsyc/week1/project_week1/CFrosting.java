package com.example.shrsyc.week1.project_week1;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "Frosting", havingValue ="Chocolate")
public class CFrosting implements Frosting{
    @Override
    public String getFrostingType() {
        return "Chocolate Frosting";
    }
}
