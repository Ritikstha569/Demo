import java.util.Scanner;
class ArrayDeclaration {
    public static void main(String... args){
        int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Element of size: " +a.length);
		for (int i=0; i<a.length;i++){
			a[i]=sc.nextInt();
		}
		sc.nextInt();
		a[0]=10;
		a[1]=20;
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a);      // Prints hashcode
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println(a.getClass().getName()); // Correct method
    }
}
