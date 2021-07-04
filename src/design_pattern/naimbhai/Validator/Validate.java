package design_pattern.naimbhai.Validator;

import design_pattern.naimbhai.interfaces.Adaptee;
import design_pattern.naimbhai.interfaces.Adapter;

import java.util.List;
import java.util.Map;

public class Validate implements Adapter {
    private Adaptee adaptee;

    public Validate(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public boolean valid() {
        return adaptee.speciifcValid();
    }

    @Override
    public Map<String, List<String>> reason() {
        return adaptee.speciifcReason();
    }
}
