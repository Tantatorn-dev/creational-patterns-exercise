package creational.structural;

public class TimeLoggingHealthcareWorker extends HealthcareWorkerDecorator {

    public TimeLoggingHealthcareWorker(HealthcareWorker worker) {
        super(worker);
    }

    @Override
    public void service() {
        super.service();
    }
}
