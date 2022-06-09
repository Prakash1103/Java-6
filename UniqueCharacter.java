package miss;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="babub";
		char[] charArray = input.toCharArray();
		Set<Character> name=new HashSet<Character>();
		for (Character i: charArray) {
			name.add(i);
			}
		System.out.println(name);
		String[] split = input.split("b");
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]);
			
		}

	}

}
