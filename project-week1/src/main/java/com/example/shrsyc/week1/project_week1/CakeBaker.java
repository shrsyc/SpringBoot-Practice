package com.example.shrsyc.week1.project_week1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;

@Service
public class CakeBaker {

    @Autowired
    Frosting f;

    @Autowired
    Syrup s;

    String bakeCake(){
        return f.getFrostingType()+" & "+s.getSyrupType();
    }
}
