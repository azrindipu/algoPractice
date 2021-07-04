package design_pattern.naimbhai.Validator;

import design_pattern.naimbhai.concreteclasses.ClassB;
import design_pattern.naimbhai.interfaces.Adaptee;
import design_pattern.naimbhai.utils.Commons;
import design_pattern.naimbhai.utils.Constents;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidateBOnly implements Adaptee{
    private List<String> validationStatus;

    public ValidateBOnly(ClassB classB){
        validationStatus = Commons.checkInteger(classB);
    }
    @Override
    public boolean speciifcValid() {
        return validationStatus.size()==0?true:false;
    }

    @Override
    public Map<String, List<String>> speciifcReason() {
        Map<String, List<String>> reasonMap = new HashMap<>();
        if(validationStatus.size() >0){
            reasonMap.put(Constents.CLASS_B, validationStatus);
        }
        return reasonMap;
    }
}
