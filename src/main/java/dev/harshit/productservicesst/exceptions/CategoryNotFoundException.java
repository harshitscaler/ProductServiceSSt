package dev.harshit.productservicesst.exceptions;

public class CategoryNotFoundException extends RuntimeException {
    public  CategoryNotFoundException(String message){
        super(message);
    }
}
