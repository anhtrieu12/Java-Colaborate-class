package AllAboutOOP.Inheritance;

public class Mainclass {

    public static void main(String[] args) {

        Three three = new Three();
        three.print_name();
        three.print_num();
        three.print_message();
    }

}

class one{

    public void print_name(){
        System.out.println("Java");
    }
}

class Two extends one{

    public void print_num(){
        System.out.println("Java + 12");
    }
}

class Three extends Two{
    public void print_message(){
        System.out.println("Text message");
    }
}