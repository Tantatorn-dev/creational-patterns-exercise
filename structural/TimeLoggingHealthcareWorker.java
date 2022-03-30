package creational.structural;

import java.util.Date;

public class TimeLoggingHealthcareWorker extends HealthcareWorkerDecorator {

    public TimeLoggingHealthcareWorker(HealthcareWorker worker) {
        super(worker);
    }

    @Override
    public void service() {
        System.out.print(new Date()+": ");
        super.service();
    }
}
