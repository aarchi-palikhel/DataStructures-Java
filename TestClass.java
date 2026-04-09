import java.util.Scanner;
public class TestClass {
	public static void main(String[] args) {
		DLL d1=new DLL();
		System.out.println("DLL after Insertion:");
		d1.addFromHead(7);
		d1.addFromTail(6);
		d1.addFromHead(4);
		d1.addFromKPos(5, 2);
		d1.addFromHead(13);
		d1.addFromTail(7);
		d1.display();
		System.out.println("DLL after Deletion:");
		d1.deleteFromHead();
		d1.deleteFromKPosition(2);
		d1.deleteFromTail();
		d1.display();
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a key:");
		int k1=obj.nextInt();
		d1.search(k1);
		obj.close();
	}

}