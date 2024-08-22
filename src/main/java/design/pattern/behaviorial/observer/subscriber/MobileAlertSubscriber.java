package design.pattern.behaviorial.observer.subscriber;

import design.pattern.behaviorial.observer.publisher.StocksPublisher;

public class MobileAlertSubscriber implements NotificationAlertSubscriber{

    String userNumber;

    public MobileAlertSubscriber(String userNumber, StocksPublisher publisher){
        this.userNumber = userNumber;
    }

    @Override
    public void update() {
        System.out.println("Mobile Alert: Notification has been received");
    }

    public void sendMobileAlert(){
        System.out.println("Mobile alert sent to "+userNumber);
    }
}
