package hastable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashTable implements HashMethods{

    private static HashTable hashTable = null;
    private static boolean locker = false;
    private static final int maxHashArrayIndexSize = 10;
    private static final Map<Integer, List<String>> hashMap= new HashMap<>();

    private HashTable(){
    }

    private static void setLocker(){
        locker = true;
    }

    public static synchronized HashTable getInstance(){
        if(hashTable == null && locker == false){
            hashTable = new HashTable();
            setLocker();
        }
        return hashTable;
    }

    @Override
    public boolean addItem(String item) {
        int index = this.hashFunction(item);
        if(hashMap.containsKey(index)){
            List<String> preVoisList = hashMap.get(index);
            List<String> newList = new ArrayList<>(preVoisList);
            newList.add(item);
            hashMap.put(index, newList);
            return true;
        }
        else {
            List<String> list = new ArrayList<>();
            list.add(item);
            hashMap.put(index, list);
            return true;
        }
    }

    @Override
    public String getItem(String item) {
        int index = this.hashFunction(item);
        if(!hashMap.containsKey(index)) {
            return null;
        }
        else{
            List<String> list = hashMap.get(index);
            if(list.size() ==1){
                return list.get(0);
            }
            else{
                for(String str : list){
                    if(str.equals(item)){
                        return str;
                    }
                }
            }
        }
        return null;
    }

    private int hashFunction(String item) {
        int sum = 0;
        for(int i=0;i<item.length(); i++){
            sum+=(int)item.charAt(i);
        }
        return sum%maxHashArrayIndexSize;
    }
}
