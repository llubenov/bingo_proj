package com.cognizant;

import com.cognizant.service.EightNumberGenerator;
import com.cognizant.service.SixNumberGenerator;
import com.cognizant.service.TenNumberGenerator;
import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean(name = "EightNumberGenerator")
    public EightNumberGenerator genEight(){
        EightNumberGenerator genEight = new EightNumberGenerator();
        return genEight;
    }

    @Bean(name = "SixNumberGenerator")
    public SixNumberGenerator genSix(){
        SixNumberGenerator genSix = new SixNumberGenerator();
        return genSix;
    }

    @Bean(name = "TenNumberGenerator")
    public TenNumberGenerator genTen(){
        TenNumberGenerator genTen = new TenNumberGenerator();
        return genTen;
    }
}
