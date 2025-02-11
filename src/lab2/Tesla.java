package lab2;

public class Tesla extends Vehicle implements Electric, Autonomous {
    private boolean autopilotEnabled;
    private boolean charging;

    // Constructor
    public Tesla(String model, int year) {
        super("Tesla", model, year);
        this.autopilotEnabled = false;
        this.charging = false;
    }

    // Implement Vehicle methods
    @Override
    public void startEngine() {
        isRunning = true;
        System.out.println(model + " started");
    }

    @Override
    public void stopEngine() {
        isRunning = false;
        System.out.println(model + " stopped");
    }

    @Override
    public void accelerate() {
        System.out.println(model + " is accelerating...");
    }

    @Override
    public void brake() {
        System.out.println(model + " is braking...");
    }

    // Implement Electric methods
    @Override
    public void charge() {
        charging = true;
        System.out.println(model + " is now charging");
    }

    @Override
    public boolean isCharging() {
        return charging;
    }

    // Implement Autonomous methods
    @Override
    public void enableAutopilot() {
        autopilotEnabled = true;
        System.out.println("Autopilot enabled");
    }

    @Override
    public void disableAutopilot() {
        autopilotEnabled = false;
        System.out.println("Autopilot disabled");
    }

    @Override
    public boolean isAutopilotEnabled() {
        return autopilotEnabled;
    }
}

