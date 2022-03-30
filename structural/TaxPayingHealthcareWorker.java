package creational.structural;

public class TaxPayingHealthcareWorker extends HealthcareWorkerDecorator {

    public TaxPayingHealthcareWorker(HealthcareWorker worker) {
        super(worker);
    }

    @Override
    public double getPrice() {
        return 1.1 * super.getPrice();
    }
}
