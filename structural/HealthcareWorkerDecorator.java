package creational.structural;

public class HealthcareWorkerDecorator extends HealthcareWorker {
    private HealthcareWorker worker;

    public HealthcareWorkerDecorator(HealthcareWorker worker) {
        super(worker);
    }

    @Override
    public void service() {
        worker.service();
    }

    @Override
    public double getPrice() {
        return worker.getPrice();
    }
}
