package OOPS;

class Sim {
    void connect() {
        System.out.println("Connecting to network...");
    }
}

class Jio extends Sim {
    void activate5G() {
        System.out.println("Jio 5G features activated.");
    }
}

public class Inheritance_sim  {
    public static void main(String[] args) {
        Jio myJio = new Jio();

        myJio.connect();      
        myJio.activate5G();   
    }
}