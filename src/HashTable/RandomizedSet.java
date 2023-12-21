package HashTable;

import java.util.*;


public class RandomizedSet {
    List<Integer> nums;
    Map<Integer,Integer> idxMap;
    Random random;

    public RandomizedSet(){
        nums=new ArrayList<>();
        idxMap=new HashMap<>();
        random = new Random();
    }

    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        obj.insertVal(10);
        obj.insertVal(20);
        obj.insertVal(30);
        obj.deleteVal(20);
    }

    public boolean insertVal(int val){
        if(idxMap.containsKey(val)){
            return false;
        }
        idxMap.put(val,idxMap.size());
        nums.add(val);
        return true;
    }

    public boolean deleteVal(int val){
        if(!idxMap.containsKey(val)){
            return false;
        }

        int idx =idxMap.get(val);
        int lastIdx=nums.size()-1;
        if(idx!=lastIdx){
            int lastVal=nums.get(lastIdx);
            nums.set(idx,lastVal);
            idxMap.put(lastVal,idx);
        }
        nums.remove(lastIdx);
        idxMap.remove(val);
        return true;
    }

    public int getRandom() {
        return nums.get(random.nextInt(nums.size()));
    }

}

