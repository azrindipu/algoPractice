package design_pattern.naimbhai.Validator;

import design_pattern.naimbhai.concreteclasses.ClassAB;
import design_pattern.naimbhai.interfaces.Adaptee;
import design_pattern.naimbhai.utils.Commons;
import design_pattern.naimbhai.utils.Constents;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidateAbChecksA implements Adaptee{
    private List<String> validationStatus;

    public ValidateAbChecksA(ClassAB classAB){
        validationStatus = Commons.checkString(classAB.getField1());
    }

    @Override
    public boolean speciifcValid() {
        return validationStatus.size()==0?true:false;
    }

    @Override
    public Map<String, List<String>> speciifcReason() {
        Map<String, List<String>> reasonMap = new HashMap<>();
        if(validationStatus.size() >0){
            reasonMap.put(Constents.CLASS_A_OF_AB, validationStatus);
        }
        return reasonMap;
    }
}
