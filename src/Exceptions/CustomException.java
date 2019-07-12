package Exceptions;

public class CustomException {

    public static void main(String[] args) {

        try {
            System.out.println("Starting a block");
            throw new MyException("This is an custome Exception");
        }catch (MyException e){
            System.out.println("Catch block");
            System.out.println(e);
        }
    }
}

class MyException extends Exception{

    String strOne;

    MyException(String strTwo){
        this.strOne = strTwo;
    }

    @Override
    public String toString() {
        return "MyException{" + "strOne='" + strOne + '\'' + '}';
    }
}
