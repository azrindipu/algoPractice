package design_pattern.naimbhai;

import design_pattern.naimbhai.Validator.*;
import design_pattern.naimbhai.concreteclasses.ClassA;
import design_pattern.naimbhai.concreteclasses.ClassAB;
import design_pattern.naimbhai.concreteclasses.ClassB;
import design_pattern.naimbhai.factory.AdapteeFactory;
import design_pattern.naimbhai.interfaces.Adaptee;
import design_pattern.naimbhai.utils.AdapteeTypeOfAB;
import design_pattern.naimbhai.utils.Commons;

public class MainClass {
    public static void main(String[] args){
        ClassA classA = new ClassA();
        classA.setField1("field01");
        classA.setField2("filed02");

        ClassB classB = new ClassB();
        classB.setField1(01);
        classB.setField2(02);

        ClassAB classAB = new ClassAB();
        classAB.setField1(classA);
        classAB.setField2(classB);

        AdapteeFactory factory = new AdapteeFactory(classA, classB, classAB);
        Adaptee adaptee= null;
        Validate validate = null;



        //===========================validate class A===============================
        //classA.setField1(null);
        //classA.setField2(null);

        adaptee = factory.createClassAAdaptee();
        validate = new Validate(adaptee);
        Commons.printErrorMessage(validate.reason());

        //===========================validate class B===============================
        //classB.setField1(0);
        //classB.setField2(0);

        adaptee = factory.createClassBAdaptee();
        validate = new Validate(adaptee);
        Commons.printErrorMessage(validate.reason());

        //===========================validate class AB===============================
        //classA.setField1(null);
        //classA.setField2(null);
        //classB.setField1(0);
        //classB.setField2(0);

        adaptee = factory.createClassABAdaptee(AdapteeTypeOfAB.CHECKAONLY.toString());
        validate = new Validate(adaptee);
        Commons.printErrorMessage(validate.reason());

        adaptee = factory.createClassABAdaptee(AdapteeTypeOfAB.CHECKBONLY.toString());
        validate = new Validate(adaptee);
        Commons.printErrorMessage(validate.reason());

        adaptee = factory.createClassABAdaptee(AdapteeTypeOfAB.CHECKAB.toString());
        validate = new Validate(adaptee);
        Commons.printErrorMessage(validate.reason());
    }
}
