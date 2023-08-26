// publish + subscribe = Observer Pattern
package org.pattern.behavioral.ObserverPattern;

import org.pattern.behavioral.ObserverPattern.Observable.IphoneObservableImpl;
import org.pattern.behavioral.ObserverPattern.Observable.StocksObservable;
import org.pattern.behavioral.ObserverPattern.Observer.EmailAlertObserverImpl;
import org.pattern.behavioral.ObserverPattern.Observer.MessageAlertObserverImpl;
import org.pattern.behavioral.ObserverPattern.Observer.NotificationAlertObserver;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        StocksObservable iphoneStocksObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new MessageAlertObserverImpl(iphoneStocksObservable, "mohnish11");
        NotificationAlertObserver observer2 = new MessageAlertObserverImpl(iphoneStocksObservable, "mohnish21");
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl(iphoneStocksObservable, "moh@ish.com");

        iphoneStocksObservable.addObserver(observer1);
        iphoneStocksObservable.addObserver(observer2);
        iphoneStocksObservable.addObserver(observer3);

        iphoneStocksObservable.setStockCount(10);
    }
}
