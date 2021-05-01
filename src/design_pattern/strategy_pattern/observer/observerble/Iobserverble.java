package design_pattern.strategy_pattern.observer.observerble;

import design_pattern.strategy_pattern.observer.observers.Iobserver;

public interface Iobserverble {
    void add(Iobserver iobserver) throws Exception;
    void remove(Iobserver iobserver) throws Exception;
    void notifyObservers();
}
