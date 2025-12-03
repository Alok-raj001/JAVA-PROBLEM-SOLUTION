import java.util.StringTokenizer;

public class StringEx8 {
	public static void main(String[] args) {
		String s="I love my INDIA";
		StringTokenizer st = new StringTokenizer(s," ");
		int c=st.countTokens();
		System.out.println(c);
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		
		//for(int x=1;x<=c;x++) {
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
//		}
		
		//split method
		//String s1[]=s.split(" ");
		//String s1[]=s.split("my");
		String s1[]=s.split("");
		for(String x:s1) {
			System.out.println(x);
		}
	}
}
