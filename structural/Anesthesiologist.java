package creational.structural;

public class Anesthesiologist extends HealthcareWorker {
    public Anesthesiologist(String name, double price) {
        super(name, price);
    }

    @Override
    public void service() {
        System.out.println(this.getName() + " takes care of patients before, during and after surgery. It encompasses anesthesia, intensive care medicine, critical emergency medicine, and pain medicine.");
    }
}
