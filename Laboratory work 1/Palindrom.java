public class Palindrom{
	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++){
			String s = args[i];
			System.out.println(isPalindrome(s));
			
		}
	}

// переворачиваем слово
	public static String reverseString(String s){
		String str = "";
		int len = s.length()-1;
		for (int i = 0; i <= len; i++){
			str += s.charAt(len-i);
		}
		return str;
	}

// сравнение перевернутого слова с первоначальны словом
	public static boolean isPalindrome(String s){
		String str = reverseString(s);
		System.out.println(str);
		return str.equals(s);
	}
}