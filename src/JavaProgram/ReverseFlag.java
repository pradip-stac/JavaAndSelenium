package JavaProgram;

public class ReverseFlag {

	//   *
	//  **
	// ***
	//  **
	//   *
	//  **
	// ***
	//  **
	//   *
	public static void main(String[] args) {
		for(int a = 1;a<=3;a++) {
			for(int b=2;b>=a;b--) {
				System.out.print(" ");
			}
			for(int c= 1;c<=a;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int d =1;d<=2;d++) {
			for(int e = 1;e<=d;e++) {
				System.out.print(" ");
			}
			for(int f = 2;f>=d;f--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int g = 1;g<=3;g++) {
			for(int h = 2;h>=g;h--) {
				System.out.print(" ");
			}
			for(int i = 1;i<=g;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int j = 1;j<=2;j++) {
			for(int k = 1;k<=j;k++) {
				System.out.print(" ");
			}
			for(int l = 2;l>=j;l--) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		
	}
}
