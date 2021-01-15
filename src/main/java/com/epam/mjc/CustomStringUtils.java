/*Assemble custom jar utils-1.3.5.jar. It should be compatible with java 8.
 The manifest file should contain the name and version of your jar.
 The jar should contain class StringUtils with method boolean isPositiveNumber(String str).
 Use Apache Commons Lang 3.10 library to implement this method.
 Write one any unit test for your StringUtils.isPositiveNumber(String str) using JUnit 5.+.
 */
package com.epam.mjc;

import org.apache.commons.lang3.StringUtils;

public class CustomStringUtils {

    public boolean isPositiveNumber(String str) {
        boolean result = false;
        if (str != null) {
            String newStr = StringUtils.trim(str);
            result = StringUtils.startsWith(newStr, "-");
            if (!result) {
                result = StringUtils.startsWith(newStr, "+");
                if (result) {
                    String stringWithoutSign = newStr.substring(1);
                    result = StringUtils.isNumericSpace(stringWithoutSign);
                } else {
                    result = StringUtils.isNumericSpace(newStr);
                }
            } else {
                result = false;
            }
        }
        return result;
    }
}
