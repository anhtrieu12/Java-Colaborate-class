package AllAboutOOP.Inheritance;

public class Inheritance_Test {

    public static void main(String[] args) {

        Mountainbike bike = new Mountainbike(2,4,8);
        bike.setSeatHeight(5);

    }
}


class Bicycle{

    int gear;
    int speed;

    public Bicycle(int gear, int speed){
        this.gear=gear;
        this.speed=speed;
    }

    public void applyBrake(int decrement){
        speed -= decrement;
    }

    public void setSpeed(int increment){
        speed += increment;
    }

    @Override
    public String toString() {
        return "Bicycle{" + "gear=" + gear + ", speed=" + speed + '}';
    }
}


class Mountainbike extends Bicycle{

    int seatHeight;

    public Mountainbike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;

        System.out.println("Gear: " + gear + "\n" + "Speed: " + speed + "\n" + "SeatHeight: " + seatHeight);
    }

    public void setSeatHeight(int value){
        this.seatHeight = value;
    }

    @Override
    public String toString() {
        return "Mountainbike{" + "seatHeight=" + seatHeight + '}';
    }
}