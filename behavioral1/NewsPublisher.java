package creational.behavioral1;

import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;

public class NewsPublisher implements Publisher<News> {
	// You need to implement this class
    NewsSubscriber[] subscribers;

    @Override
    public void subscribe(Subscriber<? super News> subscriber) {

    }

    public void publish(News news){

    }

}
