package Exceptions;

import java.io.IOException;

public class ClassForThrows {

    public static void main(String[] args) {
        ThrowExampleDemo demo = new ThrowExampleDemo();
        try {
            demo.myMethod(4);
        }catch (IOException e){
            System.out.println("This is an IOException");
        }catch (ClassNotFoundException e){
            System.out.println("Class not found Exception");
        }
    }


}

class ThrowExampleDemo{

    public void myMethod(int num) throws IOException, ClassNotFoundException{

        if (num == 1){
            throw new IOException("This is an IOException");
        }else {
            throw new ClassNotFoundException("Class not found exception");
        }
    }
}
