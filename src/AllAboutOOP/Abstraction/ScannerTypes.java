package AllAboutOOP.Abstraction;

public class ScannerTypes implements wifi, Color, Fax, Scan {

    @Override
    public void connectWifi() {
        System.out.println("Wifi connection");

    }

    @Override
    public void printColor() {
        System.out.println("Printing Documents");

    }

    @Override
    public void sendFax() {
        System.out.println("Sending Fax");

    }

    @Override
    public void scanDocument() {
        System.out.println("Scanning Documents");

    }

    public static void main(String[] args) {

        ScannerTypes scanOne = new ScannerTypes();
        System.out.println("Scanner One");
        scanOne.connectWifi();
        scanOne.printColor();

        ScannerTypes scanTwo= new ScannerTypes();
        System.out.println("\n" + "Scanner Two");
        scanTwo.connectWifi();
        scanTwo.printColor();
        scanTwo.sendFax();

        ScannerTypes scanFour= new ScannerTypes();
        System.out.println("\n" + "Scanner Four");
        scanFour.connectWifi();
        scanFour.printColor();
        scanFour.sendFax();
        scanFour.scanDocument();

    }

}

interface wifi {
    abstract void connectWifi();
}

interface Color {
    abstract void printColor();
}

interface Fax {
    abstract void sendFax();
}

interface Scan {
    abstract void scanDocument();
}
