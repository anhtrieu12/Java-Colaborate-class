package AllAboutOOP.polymorphism;

public class Polymorphism_Intro {
    /**
     * Dynamic biding (Method overide)
     * Static biding (Method overload)
     */
    // example of method override

    public static void main(String[] args) {
        Animal a1 = new cat();
        a1.makeNoise();

        Animal a2 = new Dog();
        a2.makeNoise();

    }
}

class Animal{
    public void makeNoise(){
        System.out.println("Some sound..");
    }
}

class Dog extends Animal{
    public void makeNoise(){
        System.out.println("Dog sound..");
    }
}

class cat extends Animal{
    public void makeNoise(){
        System.out.println("Cat sound..");
    }

}
