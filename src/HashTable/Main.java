package HashTable;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DirectChaining hashObj = new DirectChaining(5);
		hashObj.insertHashTable("avhad");
		hashObj.insertHashTable("love");
		hashObj.insertHashTable("ganesh");
		hashObj.insertHashTable("savita");
		hashObj.insertHashTable("yug");
		hashObj.insertHashTable("hello");
		hashObj.deleteKeyHashTable("love");
		hashObj.insertHashTable("test");
		hashObj.insertHashTable("vishal");
		hashObj.insertHashTable("yug");
		hashObj.insertHashTable("snehal");
		
		hashObj.displayHashTable();
		
		hashObj.searchHashTable("yug");
	}
}
