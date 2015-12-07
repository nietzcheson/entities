package com.m4c.model.base;

/**
 * Created by Usuario on 03/12/2015.
 */
public class StringTools {
    public static String generaToken(int length) {
        String token = "";
        String letras = "A1B2C3D4E5F6G7H8J9K1L2M3N4O5P6Q7R8S9T0U5V4W3X4Y3Z";
        Long i = 0l;
        int size = letras.length();
        int rangoi = 0;
        int rangof = letras.length();

        while (token.length() < length) {
            i = Math.round((Math.random() * (rangof - rangoi)));
            if ((i >= 0) && (i < size)) {
                token += letras.charAt(Integer.valueOf(String.valueOf(i)));
            }
        }

        return token;
    }

}
