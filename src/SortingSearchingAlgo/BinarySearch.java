package SortingSearchingAlgo;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arg = {1,2,3,4,5,6,7,8,9,11,13,24,34,45,65,76,87};
		int res = serach(arg,1);
		System.out.println("res :"+res);//+" middle :"+middle+ " end :"+end);
	}
	public static int serach(int[] arg,int target) {
		//arg = 1,2,3,4,5,6,7,8,9 targget 8
		if(arg.length<=2){
			if(arg[0]==target){
				return arg[0];
			}else	if(arg[1]==target){
				return arg[1];
			}else{
				return -1;
			}
		}
		int start = 0;
		int end = arg.length-1;
		int middle = (start+end)/2; // 1+9 / 2 =5
		//int middleValue = arg[middle];
		System.out.println("start :"+start+" middle :"+middle+ " end :"+end);
		while(arg[middle]!=target && start!=end) {
			if(target>arg[middle]) {
				start = middle + 1;
			}else {
				end = middle - 1;
			}
			middle = (start+end)/2;
			System.out.println("start :"+start+" middle :"+middle+ " end :"+end);
		}
		if(arg[middle]==target) {
			return middle;
		}else {
			return -1;
		}
		
	}
}
