package main;

/**
 * Created by Александр on 20.11.2015.
 */
public class MyException extends Exception {
    String message = "Значения переменных должны быть больше нуля!";
    public String getMessage(){
        System.err.println(message);
        return message;
    }
}
