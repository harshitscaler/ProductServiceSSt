package dev.harshit.productservicesst.exceptions;
// if you extends exception it will checked excepion and if you do extend runtime exception it will be not checked exception.
public class CategoryNotFoundException extends RuntimeException {
    public  CategoryNotFoundException(String message){
        super(message);
    }
}
