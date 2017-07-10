package epam.com.task1pilipenka.differentchecks;

public class RefString {
	public static void changeStr(String s){
	s=s.concat("Certified");
	}
	public static void main(String[] args) {
	String str = new String("Java");
	changeStr(str);
	System.out.println(str.length());

	}

}
