package creational.structural;

public class HealthcareWorkerDecorator extends HealthcareWorker {
    private HealthcareWorker wrappee;

    public HealthcareWorkerDecorator(HealthcareWorker worker) {
        super(worker);
        this.wrappee = worker;
    }

    @Override
    public void service() {
        this.wrappee.service();
    }

    @Override
    public double getPrice() {
        return this.wrappee.getPrice();
    }
}
