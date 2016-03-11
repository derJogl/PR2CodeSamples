package sorting.lv.basic;

import java.util.Arrays;

public class PrimitivesDemo {

	public static void main(String[] args) {
		
		//demo of natural sort ordering of primitves in arrays
		
		char[] seq = {'x','a','?','C','M','A','Y','€','Ü','ö'};
		//sorts ascending based on numeric Unicode of respective chars
		Arrays.sort(seq);
		
		for(char c : seq) {
			System.out.println(c);
		}
		
		int[] numbers = {4,10,0,1,100,-1000};
		//sorts ascending based numeric value of ints
		Arrays.sort(numbers);
		
		for(int i : numbers) {
			System.out.println(i);
		}
		
	}
	
}
