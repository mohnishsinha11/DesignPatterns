package org.pattern.behavioral.ObserverPattern.Observable;

import org.pattern.behavioral.ObserverPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {
    void addObserver(NotificationAlertObserver notificationAlertObserver);
    void removeObserver(NotificationAlertObserver notificationAlertObserver);
    void notifySubscribers();
    void setStockCount(int newStockAdded);
    int getStockCount();
}
