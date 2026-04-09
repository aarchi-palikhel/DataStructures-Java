import java.util.Scanner;
public class CQueue {
    int f=-1;
    int r=-1;
    int maxsize=6;
    int []queue= new int [maxsize];
   boolean isEmpty()
    {
   return f== -1;}
    boolean isFull()
    {
       return f==(r+1)%maxsize;
    }
    void enqueue(int el)
    {if(isFull())
    {
    System.out.println("Queue is full");
    return;}
   
    else if(isEmpty())
    {
      f++;
       r++;
    }
    else{
           r=(r+1)%maxsize;
           
      }
    queue[r]=el;
    }
    void dequeue()
    {
    if(isEmpty())
    {System.out.println("The Queue is Empty");
    return;
    }
    else if(f==r){
    f=-1;
    r=-1;}
    else{
    f=(f+1)% maxsize;}
    }
void display() {
    if (isEmpty()) {
        System.out.println("The Queue is Empty");
        return;
    }

    for (int i = f; i != (r + 1) % maxsize; i = (i + 1) % maxsize) {
        System.out.println(queue[i]);
    }
}
    boolean search (int el)
    {
    for (int i=f; i<=r; i++)
    {
       if(queue[i]==el)
    {
	System.out.println("Element found in the queue");
    	return true;
	}
    }
    System.out.println("Element not found in queue");
    return false;
    }
   
 public static void main(String[] args) {
        CQueue q= new CQueue();
        q.enqueue(1);
         q.enqueue(3);
          q.enqueue(7);
           q.enqueue(13);
	q.enqueue(21);
        System.out.println("Enqueued elements in circular queue:");
        q.display();
        q.dequeue();
        q.dequeue();
         System.out.println("Dequeue elements in circular queue:");
         q.display();
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the Key:");
	int key=obj.nextInt();
	q.search(key);
	
         
       
            }
   
}