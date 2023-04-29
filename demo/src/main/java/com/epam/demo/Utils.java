package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
     if(args == null){
            return false;
        }
        for (String string :
                args) {
            if (!StringUtils.isPositiveNumber(string)) {
                return false;
            }
        }
        return true;
        
    }
}
