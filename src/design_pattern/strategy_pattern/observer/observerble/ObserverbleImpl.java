package design_pattern.strategy_pattern.observer.observerble;

import design_pattern.strategy_pattern.observer.observers.Iobserver;
import design_pattern.strategy_pattern.observer.observers.ObserverImpl;

import java.util.ArrayList;
import java.util.List;

public class ObserverbleImpl implements Iobserverble {

    private static ObserverbleImpl observerble;
    private List<Iobserver> iobservers;
    private int data;
    private ObserverbleImpl(){
        iobservers = new ArrayList<>();
        data=0;
    }

    public static synchronized ObserverbleImpl getInstance(){
        if(observerble == null){
            observerble = new ObserverbleImpl();
        }
        return observerble;
    }

    @Override
    public synchronized void add(Iobserver iobserver) throws Exception {
        if(iobservers == null){
            throw new Exception("Observer list is null");
        }
        if(iobservers.contains(iobserver)){
            throw new Exception("Observer already exist");
        }
        iobservers.add(iobserver);
    }

    @Override
    public synchronized void remove(Iobserver iobserver) throws Exception {
        if(iobservers == null){
            throw new Exception("Observer list is null");
        }
        iobservers.remove(iobserver);
    }

    @Override
    public synchronized void notifyObservers() {
        if(iobservers != null && !iobservers.isEmpty()){
            for(Iobserver iobserver : iobservers){
                iobserver.update();
            }
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        if(this.data == data)
            return;
        this.data = data;
        this.notifyObservers();
    }
}
