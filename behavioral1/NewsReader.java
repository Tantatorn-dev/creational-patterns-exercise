package creational.behavioral1;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class NewsReader implements Subscriber<News> {

    public NewsPublisher publisher;
    private String name;

    public NewsReader(String name) {
        this.name = name;
        publisher = new NewsPublisher();
    }

    public void update(News news) {
        System.out.println(this.name + " " + news.getTopic() + " " + news.getContent());
    }

    @Override
    public void onSubscribe(Subscription subscription) {

    }

    @Override
    public void onNext(News item) {

    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {

    }

    // You need to implement this class

}
