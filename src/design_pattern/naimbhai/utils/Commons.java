package design_pattern.naimbhai.utils;

import design_pattern.naimbhai.concreteclasses.ClassA;
import design_pattern.naimbhai.concreteclasses.ClassB;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Commons {
    public static List<String> checkString(ClassA classA){
        List<String> validationStatus = new ArrayList<>();
        if(classA.getField1() == null){
            validationStatus.add(Constents.CLASS_A_FILED_1_CAN_NOT_BE_NULL);
        }
        if(classA.getField2() == null){
            validationStatus.add(Constents.CLASS_A_FILED_2_CAN_NOT_BE_NULL);
        }
        return validationStatus;
    }

    public static List<String> checkInteger(ClassB classB){
        List<String> validationStatus = new ArrayList<>();
        if(classB.getField1() == 0){
            validationStatus.add(Constents.CLASS_B_FILED_1_CAN_NOT_BE_ZERO);
        }
        if(classB.getField2() == 0){
            validationStatus.add(Constents.CLASS_B_FILED_2_CAN_NOT_BE_ZERO);
        }
        return validationStatus;
    }

    public static void printErrorMessage(Map<String, List<String>> errorMessage){
        Set<String> keys = errorMessage.keySet();
        if(keys == null || keys.size() == 0){
            System.out.println("There is no error message");
        }
        for(String key : keys){
            System.out.print(key+"=======>"+errorMessage.get(key).toString());
        }
        System.out.println();
    }
}
