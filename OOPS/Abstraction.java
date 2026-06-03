package OOPS;
abstract class Sim {
    
    private final String operatorName;
    @SuppressWarnings("unused")
    private boolean isActivated;

    public Sim(String operatorName) {
        this.operatorName = operatorName;
        this.isActivated = false; // default state
    }

    public void activateSim() {
        this.isActivated = true;
        System.out.println("{operatorName} SIM card has been successfully activated.");
    }


    public String getOperatorName() {
        return operatorName;
    }


    public abstract void call();
}


class Jio extends Sim {

    public Jio() {
        super("Jio");
    }


    @Override
    public void call() {
        System.out.println("Connecting VoLTE call via Jio 5G Network...");
    }
}


class Airtel extends Sim {
    public Airtel() {
        super("Airtel");
    }

    @Override
    public void call() {
        System.out.println("Connecting high-definition voice call via Airtel Network...");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        Sim mySim = new Jio();
        mySim.activateSim();

        mySim.call();

        // Switching the SIM seamlessly
        mySim = new Airtel();
        mySim.activateSim();
        mySim.call();
    }
}