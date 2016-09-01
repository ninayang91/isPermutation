

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPermutation("a1bbc","cabbb"));

	}
	
	//Given two Strings, write a method to decide if one is a permutation of the other
	public static boolean isPermutation(String s1, String s2){
		if(s1.length()!=s2.length())return false;
		
		return sort(s1).equals(sort(s2));

	}
	
	public static String sort(String s){
		char[] a=s.toCharArray();
		java.util.Arrays.sort(a);
		return new String(a);
	}
}