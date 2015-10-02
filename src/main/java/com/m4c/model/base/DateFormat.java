package com.m4c.model.base;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 * Date: 31/08/2007
 *
 * @author Elvira Aranda
 * @version 1.1
 */
public class DateFormat {
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");   

    public Date parseDate(String sDate){
        Date date = null;
        try {
            date = df.parse(sDate);
        } catch (ParseException e) {
        }
        return date;
    }

     public Date parseDate(String sDate, String pattern){
          SimpleDateFormat dfPat = new SimpleDateFormat(pattern);
         Date date = null;
         try {
             date = dfPat.parse(sDate);
         } catch (ParseException e) {
         }
         return date;
    }
}
