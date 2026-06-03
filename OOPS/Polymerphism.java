package OOPS;

abstract class Sim {
    abstract void call();
}

class Jio extends Sim {
    @Override
    void call() {
        System.out.println("Call Connected By Jio Service Provider");
    }
}

class Airtel extends Sim {
    @Override
    void call() {
        System.out.println("Call Connected By Airtel Service Provider");
    }
}

class Phone {
    Sim s;


    Phone(Sim s) {
        this.s = s;
    }

    void executeCall() {
        if (s != null) {
            s.call();
        } else {
            System.out.println("No SIM card inserted.");
        }
    }
}

public class Polymerphism {
    public static void main(String[] args) {
        Sim s1 = new Airtel();
        Sim s2 = new Jio();

        Phone apple17WithAirtel = new Phone(s1);
        apple17WithAirtel.executeCall();

        Phone apple17WithJio = new Phone(s2);
        apple17WithJio.executeCall();
    }
}