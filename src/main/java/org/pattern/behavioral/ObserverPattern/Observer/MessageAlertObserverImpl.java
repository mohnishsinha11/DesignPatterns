package org.pattern.behavioral.ObserverPattern.Observer;

import org.pattern.behavioral.ObserverPattern.Observable.StocksObservable;

public class MessageAlertObserverImpl implements NotificationAlertObserver{
    StocksObservable stocksObservable;
    String userName;

    public MessageAlertObserverImpl(StocksObservable stocksObservable, String userName) {
        this.stocksObservable = stocksObservable;
        this.userName = userName;
    }

    @Override
    public void update() {
        sendMessageOnMobile(userName, "Hurry up product is in stock");
    }

    private void sendMessageOnMobile(String userName, String message){
        System.out.println("Message sent to "+ userName +" : " + message);
    }
}
