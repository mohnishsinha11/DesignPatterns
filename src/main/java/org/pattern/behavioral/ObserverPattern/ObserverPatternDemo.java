package org.pattern.behavioral.ObserverPattern;

import org.pattern.behavioral.ObserverPattern.Observable.IphoneObservableImpl;
import org.pattern.behavioral.ObserverPattern.Observable.StocksObservable;
import org.pattern.behavioral.ObserverPattern.Observer.EmailAlertObserverImpl;
import org.pattern.behavioral.ObserverPattern.Observer.MessageAlertObserverImpl;
import org.pattern.behavioral.ObserverPattern.Observer.NotificationAlertObserver;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        StocksObservable iphoneStockObserver = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new MessageAlertObserverImpl(iphoneStockObserver, "mohnish11");
        NotificationAlertObserver observer2 = new MessageAlertObserverImpl(iphoneStockObserver, "mohnish21");
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl(iphoneStockObserver, "moh@ish.com");

        iphoneStockObserver.addObserver(observer1);
        iphoneStockObserver.addObserver(observer2);
        iphoneStockObserver.addObserver(observer3);

        iphoneStockObserver.setStockCount(10);
    }
}
