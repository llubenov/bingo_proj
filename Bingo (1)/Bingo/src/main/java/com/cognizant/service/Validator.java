package com.cognizant.service;

import java.util.HashSet;
import java.util.Set;

public class Validator {
    private static Set<String> numbers = new HashSet<>();

    public Validator() {
    }

    Boolean validateNumber(final String number) {
        return numbers.contains(number);
    }

}
