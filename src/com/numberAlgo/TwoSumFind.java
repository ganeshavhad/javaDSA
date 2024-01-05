package com.numberAlgo;

import java.util.HashMap;
import java.util.Map;

public class TwoSumFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
		int target = 8;
		int[] res = twoSum(intArray,target);
		for(int i =0;res.length>i;i++)
		System.out.println(res[i]);
	}
	
	 public static int[] twoSum(int[] nums, int target) {
	        int n=nums.length;
	        Map<Integer,Integer> map=new HashMap<>();
	        int[] result=new int[2];
	        for(int i=0;i<n;i++){
	            if(map.containsKey(target-nums[i])){
	                result[1]=i;
	                result[0]=map.get(target-nums[i]);
	                return result;
	            }
	            map.put(nums[i],i);
	        }
	        return result;
	    }

}
