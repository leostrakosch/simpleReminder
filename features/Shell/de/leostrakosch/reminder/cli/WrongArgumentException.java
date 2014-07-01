package de.leostrakosch.reminder.cli;

/**
 * Created by leo on 14.05.14.
 */
public class WrongArgumentException extends Exception {


    public WrongArgumentException() {
    }

    public WrongArgumentException(Throwable e) {
    }

    public WrongArgumentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


    public WrongArgumentException(String message) {
        super(message);
    }

    public WrongArgumentException(String message, Throwable cause) {
        super(message, cause);
    }
}