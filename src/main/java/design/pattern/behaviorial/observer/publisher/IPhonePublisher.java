package design.pattern.behaviorial.observer.publisher;

import design.pattern.behaviorial.observer.subscriber.NotificationAlertSubscriber;

import java.util.HashSet;
import java.util.Set;

public class IPhonePublisher implements StocksPublisher{

    private int stockCount = 0;

    // user set of subscribers
    private Set<NotificationAlertSubscriber> subscribers = new HashSet<>();

    public IPhonePublisher(){
        this.subscribers = new HashSet<>();
    }

    @Override
    public void addSubscriber(NotificationAlertSubscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(NotificationAlertSubscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertSubscriber subscriber : this.subscribers){
            subscriber.update();
        }
    }

    @Override
    public void setStockCount(int count) {
        this.stockCount = count;
        this.notifySubscribers();
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }
}
