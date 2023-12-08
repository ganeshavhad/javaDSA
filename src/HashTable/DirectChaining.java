package HashTable;

import java.util.LinkedList;

public class DirectChaining {
	LinkedList<String>[] hashTable;
	int maxChainSize = 5;
	
	DirectChaining(int size){
		hashTable =  new LinkedList[size];
	}
	
	public int modASCIIHashFunction(String word,int M) {
		char ch[];
		ch = word.toCharArray();
		int i,sum;
		for(sum=0,i=0;i<word.length();i++) {
			sum = sum + ch[i];
		}
		System.out.println(" hash value : "+ sum%M);
		return
				sum % M;
	}
	
	public void insertHashTable(String word) {
		int newIndex = modASCIIHashFunction(word,hashTable.length);
		if(hashTable[newIndex]==null) {
			hashTable[newIndex] =  new LinkedList<String>();
			hashTable[newIndex].add(word);
		}else {
			hashTable[newIndex].add(word);	
		}
	}
	
	public void displayHashTable() {
		if(hashTable == null) {
			System.out.print("\n hash table does not exists");;
			return;
		}else {
			System.out.println("\n hash table does not exists");;
			for(int i=0;i<hashTable.length;i++) {
				System.out.println("\n index "+i+" , key :"+ hashTable[i]);;
			}
		}
	}
	
	public boolean searchHashTable(String word) {
		int newIndex = modASCIIHashFunction(word,hashTable.length);
		if(hashTable[newIndex]!=null && hashTable[newIndex].contains(word))
		{
			System.out.print("\n word "+word+" : found at :"+newIndex);
			return true;
		}else {
			System.out.print("\n word "+word+" Not found at");
			return false;
		}
	}
	
	public void deleteKeyHashTable(String word) {
		int newIndex = modASCIIHashFunction(word,hashTable.length);
		boolean result = searchHashTable(word);
		if(result==true) {
			hashTable[newIndex].remove();
			System.out.print("\n word "+word+" removed"); 
		}
	}
	
}
