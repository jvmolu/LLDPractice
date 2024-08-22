package design.pattern.behaviorial.observer.subscriber;

import design.pattern.behaviorial.observer.publisher.StocksPublisher;

public class EmailAlertSubscriber implements NotificationAlertSubscriber {

    String email;

    public EmailAlertSubscriber(String email, StocksPublisher publisher){
        this.email = email;
    }

    @Override
    public void update() {
        System.out.println("Email Alert: Notification has been received by "+email);
    }

    public void sendEmail(){
        System.out.println("Email sent to "+email);
    }
}
