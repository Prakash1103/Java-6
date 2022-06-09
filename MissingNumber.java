package miss;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> num=new TreeSet<Integer>();
		int[]number= {4,6,7,2,3,1,9,10,8,8,6};
		for (Integer i : number) {
			num.add(i);
			}
		System.out.println(num);
		List<Integer> num1=new ArrayList<Integer>(num);
		for (int i = 0; i < num1.size(); i++) {
			if(num1.get(i)+1!=num1.get(i+1)) {
				System.out.println("missing number is"+num1.get(i)+1);
				break;
			}
			
		}
	}
	
}
		
		
		
		
		
		
		