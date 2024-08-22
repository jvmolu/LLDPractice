package design.pattern.behaviorial.observer.publisher;

import design.pattern.behaviorial.observer.subscriber.NotificationAlertSubscriber;

public interface StocksPublisher {

    public void addSubscriber(NotificationAlertSubscriber subscriber);
    public void removeSubscriber(NotificationAlertSubscriber subscriber);

    public void notifySubscribers();
    public void setStockCount(int count);
    public int getStockCount();


}
