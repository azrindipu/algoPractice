package design_pattern.naimbhai.Validator;

import design_pattern.naimbhai.concreteclasses.ClassA;
import design_pattern.naimbhai.interfaces.Adaptee;
import design_pattern.naimbhai.utils.Commons;
import design_pattern.naimbhai.utils.Constents;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidateAOnly implements Adaptee{
    private List<String> validationStatus;

    public ValidateAOnly(ClassA classA){
        validationStatus = Commons.checkString(classA);
    }
    @Override
    public boolean speciifcValid() {
        return validationStatus.size()==0?true:false;
    }

    @Override
    public Map<String, List<String>> speciifcReason() {
        Map<String, List<String>> reasonMap = new HashMap<>();
        if(validationStatus.size() >0){
            reasonMap.put(Constents.CLASS_A, validationStatus);
        }
        return reasonMap;
    }
}
