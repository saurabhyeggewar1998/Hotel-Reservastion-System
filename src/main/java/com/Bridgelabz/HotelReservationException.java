package com.Bridgelabz;
public class HotelReservationException extends RuntimeException{

   public enum ExceptionType{
         ENTERED_EMPTY
    }

    ExceptionType type;

    public HotelReservationException(ExceptionType type, String message) {

        super(message);
        this.type = type;

    }
}
