import java.util.Scanner;
public class Test_Class {

	public static void main(String[] args) {
		DCLL d1=new DCLL();
		System.out.println("Name: Aarchi Palikhel");
		System.out.println("Roll.No: 022BIM003");
		System.out.println("DCLL after Insertion:");
		d1.addFromHead(7);
		d1.addFromTail(8);
		d1.addFromTail(6);
		d1.addFromKPos(5, 1);
		d1.addFromHead(13);
		d1.addFromHead(3);
		d1.display();
		System.out.println("DCLL after Deletion:");
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