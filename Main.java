

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPermutation2("a1bbc","ca1bb"));

	}
	
	//Given two Strings, write a method to decide if one is a permutation of the other
	
	//Solution 1, sort the String, check if they are equal to each other
	//if their length is not same, return false
	public static boolean isPermutation(String s1, String s2){
		if(s1.length()!=s2.length())return false;
		
		return sort(s1).equals(sort(s2));

	}
	
	public static String sort(String s){
		char[] a=s.toCharArray();
		java.util.Arrays.sort(a);
		return new String(a);
	}
	
	//Solution 2, count the char in each string, then compare
	//count the char in the first String, then check the second String, --a[c]<0, return false
	public static boolean isPermutation2(String s1, String s2){
		if(s1.length()!=s2.length())return false;
		int[] a=new int[256];//ASCII code's corresponding int value is 0-255
		for(int i=0;i<s1.length();i++){
			char ch=s1.charAt(i);
			a[(int)ch]++;
		}
		
		for(int i=0;i<s2.length();i++){
			char ch=s2.charAt(i);//int c=(int)s2.charAt(i);
			a[(int)ch]--;
			if(a[(int)ch]<0){//if(--a[c]<0)
				return false;
			}
		}
		return true;
		
	}
}