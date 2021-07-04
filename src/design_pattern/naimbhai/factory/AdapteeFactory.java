package design_pattern.naimbhai.factory;

import design_pattern.naimbhai.Validator.*;
import design_pattern.naimbhai.concreteclasses.ClassA;
import design_pattern.naimbhai.concreteclasses.ClassAB;
import design_pattern.naimbhai.concreteclasses.ClassB;
import design_pattern.naimbhai.interfaces.Adaptee;
import design_pattern.naimbhai.utils.AdapteeTypeOfAB;

public class AdapteeFactory implements AdapteeCreator{
    private ClassA classA;
    private ClassB classB;
    private ClassAB classAB;

    public AdapteeFactory(ClassA classA, ClassB classB, ClassAB classAB){
        this.classA = classA;
        this.classB = classB;
        this.classAB = classAB;
    }

    @Override
    public Adaptee createClassAAdaptee() {
        return new ValidateAOnly(this.classA);
    }

    @Override
    public Adaptee createClassBAdaptee() {
        return new ValidateBOnly(this.classB);
    }

    @Override
    public Adaptee createClassABAdaptee(String type) {
        if(type.equalsIgnoreCase(AdapteeTypeOfAB.CHECKAONLY.toString())){
            return new ValidateAbChecksA(this.classAB);
        }
        if(type.equalsIgnoreCase(AdapteeTypeOfAB.CHECKBONLY.toString())){
            return new ValidateabChecksB(this.classAB);
        }
        if(type.equalsIgnoreCase(AdapteeTypeOfAB.CHECKAB.toString())){
            return new ValidateabChecksAB(this.classAB);
        }
        return null;
    }

}
