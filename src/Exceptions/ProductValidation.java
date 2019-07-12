package Exceptions;

public class ProductValidation {

    public void productCheck(int weight)throws InvalidProductException{

        if (weight < 100){
            throw new InvalidProductException("Product Invalid since weight is less than 100");
        }
    }

    public static void main(String[] args) {
        ProductValidation validation = new ProductValidation();

        try {
            validation.productCheck(60);
            System.out.println("Valid Product");
        }catch (InvalidProductException e){
            System.out.println("Catch the exception");
            System.out.println(e.getMessage());
        }
    }
}

class InvalidProductException extends Exception{

    public InvalidProductException(String str){

        //Calling constructor from parent/super class
        super(str);
    }
}
