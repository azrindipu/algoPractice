package design_pattern.naimbhai.factory;

import design_pattern.naimbhai.interfaces.Adaptee;

public interface AdapteeCreator {
    Adaptee createClassAAdaptee();
    Adaptee createClassBAdaptee();
    Adaptee createClassABAdaptee(String type);
}
