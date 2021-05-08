package comparable_and_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
    public static void main(String[] args){
        List<Person> persons=new ArrayList<>();
        persons.add(new Person("x",5,2));
        persons.add(new Person("y",2,1));
        persons.add(new Person("z",10,20));
        Collections.sort(persons);
        for(Person person: persons){
            System.out.println(person.toString());
        }

        Collections.sort(persons, new PersonSalaryComparator());
        for(Person person: persons){
            System.out.println(person.toString());
        }
    }
}
