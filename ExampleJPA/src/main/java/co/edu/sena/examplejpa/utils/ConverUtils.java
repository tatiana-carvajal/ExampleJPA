/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejpa.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class ConverUtils {
    /**
     * convierte una fecha en string
     * @param text
     * @return date
     */
    public static String dateToString(Date date){
        DateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
        String result = dateFormat.format(date);
        return result;
        
    }
    
    /**
     * convierte un string en fecha
     * @param text
     * @return ParseException
     */
    
    public static Date stringToDate(String text) throws ParseException {
        Date date = new SimpleDateFormat("yyy-MM-dd").parse(text);
        return date;
    }
    
      /**
     * convierte una hora en string
     * @param date
     * @return 
     */
    
    
    public static String timeToString(Date date){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        String result = dateFormat.format(date);
        return result;
    }
    
      /**
     * convierte un string en una hora
     * @param text
     * @return ParseException
     */
    public static Date stringToTime(String text) throws ParseException{
        Date date = new SimpleDateFormat("HH:mm").parse(text);
        return date;
    }
    
    /**
     * convertir de LocalDate a Date
     * @param localDate
     * return 
     */
    
    public static Date localDateToDate(LocalDate localDate){
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }
    
    /**
     * convertir de LocalDate a Date
     * @param localDate
     * return 
     */
    
    public static Date localTimeToDate(LocalTime localTime){
        return Date.from(LocalDate.now().atTime(localTime).atZone(ZoneId.systemDefault()).toInstant());
    }
    
    
    
    /**
     * convierte de date a LocalDate
     * @param date
     * @return
     */
    
    public static LocalDate dateToLocalDate(Date date){
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
    
}
