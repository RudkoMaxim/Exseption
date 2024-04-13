package org.example;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionClass {
    static class MyException extends Exception{
        MyException()
        {
            super("Very bad error");
        }
    }
    public static void main (String[] args){
        try {
            FileReader fileReader = new FileReader("test100.txt");
            throw new MyException();
        }
        catch (MyException e) {
            System.out.println(e.getMessage());;
        }
        catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
