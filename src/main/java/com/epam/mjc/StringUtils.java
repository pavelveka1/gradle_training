package com.epam.mjc;

public class StringUtils {

    public boolean isPositiveNumber(String str) {
        boolean result = false;
        if (str != null) {
            String newStr = org.apache.commons.lang3.StringUtils.trim(str);
            result = org.apache.commons.lang3.StringUtils.startsWith(newStr, "-");
            if (!result) {
                result = org.apache.commons.lang3.StringUtils.startsWith(newStr, "+");
                if (result) {
                    String stringWithoutSign = newStr.substring(1);
                    result = org.apache.commons.lang3.StringUtils.isNumericSpace(stringWithoutSign);
                } else {
                    result = org.apache.commons.lang3.StringUtils.isNumericSpace(newStr);
                }
            } else {
                result = false;
            }
        }
        return result;
    }
}
