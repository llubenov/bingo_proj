package com.cognizant.service;

import java.util.Random;

public class EightNumberGenerator implements IAccountGenerator {
    @Override
    public String generator(Validator validator) {
        StringBuilder sb = new StringBuilder();
        Integer random = 100000 + new Random().nextInt(999999);

        do {
            int letter = new Random().nextInt(3);
            switch (letter) {
                case 0:
                    sb.append("A");
                    break;
                case 1:
                    sb.append("B");
                    break;
                case 2:
                    sb.append("C");
                    break;
            }
            sb.append(String.valueOf(random));
        } while (validator.validateNumber(sb.toString()));

        return sb.toString();
    }
}
