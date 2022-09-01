package program;

public class BuffferAndBuild {

	public static void main(String[] args) {
		String a = "velocity";
		String ab = a.concat(" katraj");
		System.out.println(ab);
		
		StringBuffer pd = new  StringBuffer ("pradip");
		pd.append(" dhakne");
		System.out.println(pd);
		System.out.println(pd.reverse());
		
		StringBuilder bd = new StringBuilder ("good");
		bd.append(" morning");
		System.out.println(bd);
		
		System.out.println(bd.reverse());
				
	}
}
