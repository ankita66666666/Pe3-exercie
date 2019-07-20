package com.stackroute.pe3;

import java.util.*;

public class VowelChecker {
    //remove vowel from character
    public String[] removeVow(String s[]) {
        // check condition
        for (int k = 0; k < s.length; k++)
            s[k] = s[k].replaceAll("[aeiouAEIOU]", "");
        return s;
    }

}

