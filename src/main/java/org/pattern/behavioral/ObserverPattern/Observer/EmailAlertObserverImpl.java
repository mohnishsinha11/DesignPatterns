package org.pattern.behavioral.ObserverPattern.Observer;

import org.pattern.behavioral.ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    StocksObservable stocksObservable;
    String emailId;

    public EmailAlertObserverImpl(StocksObservable stocksObservable, String emailId) {
        this.stocksObservable = stocksObservable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendEmail(emailId, "Hurry up! Product is available now");
    }

    private void sendEmail(String emailId, String message) {
        System.out.println("Email sent to "+ emailId +" : " + message);
    }
}
