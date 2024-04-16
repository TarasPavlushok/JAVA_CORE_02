package hw_1;

public class hw1 {

	public static void main(String[] args) {
	int a1 = -2147483648;
	int a2 = 2147483647;
	
	char b = 'a';
	float c1 = 1.4012984643248171E-045f;
	float c2 = 3.4028234663852886E+038f;
	double d1 = 1.7976931348623157E+308;
	double d2 = 4.9406564584124654E-324;
	byte e1 = 127;
	byte e2 = -128;
	short f1 = -32768;
	short f2 = 32767;
	long g1 = -9223372036854775808l ;
	long g2 = 9223372036854775807l ;
	boolean y = true;
			
	System.out.println("a min = " + a1 + ", max = " + a2);
	System.out.println("b = " + b);
	System.out.println("c min = " + c1 + ", max = " + c2);
	System.out.println("d min = " + d1 + ", max = " + d2);
	System.out.println("e min = " + e2 + ", max = " + e1);
	System.out.println("f min = " + f1 + ", max = " + f2);
	System.out.println("g min = " + g1 + ", max = " + g2);
	System.out.println("y = " + y );
	
	
	int arr1 [] = new int[] { 20, 98, 12, 7, 35, 15, 14, 23, 96, 78};
	for (int i = 0; i < arr1.length; i++) {
		System.out.println(arr1[i] + " ");
	}
	
	Arrays.sort(arr1);
	System.out.println(arr1[0]);
	System.out.println(arr1[9]);
	}
}
