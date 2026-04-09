import java.util.Scanner;
public class Queue {
    int maxsize=5;
    int []Queue= new int[maxsize];
    int front = 0;
    int rear = -1;
    boolean isEmpty(){
        return rear<front;
    }
    boolean isFull(){
        return rear==maxsize-1;
    }
    void enqueue(int el){
        if(isFull()){
        System.out.println("Queue Overflow");
        } else{
            rear++;
            Queue[rear]=el;
        }
    }
     void dequeue(){
        if(isEmpty()){
        System.out.println("Empty Queue");
        } else{
             System.out.println("Dequeued element is "+Queue[front]);
             front++;
        }
    }
     void search(int key){
         int flag=0, position=1;
         for(int i=front;i<rear;i++){
             if(Queue[i]==key){
                 flag=1;
                 break;
             }else{
                 position++;
             }
         }
         if(flag==1){
             System.out.println("Key "+key+ " is found at "+position+" position");
            }else{
            System.out.println("Key is not found.");
            }
     }
     void display(){
        for (int i=front;i<maxsize;i++){
            System.out.println(Queue[i]);
        }
    }
    public static void main(String[] args) {
       Queue q1=new Queue();
       q1.enqueue(7);
       q1.enqueue(5);
       q1.enqueue(3);
       q1.enqueue(1);
       q1.enqueue(13);
	System.out.println("The enqueued elements in the Queue are:");
       q1.display();
       q1.dequeue();
	System.out.println("Elements of Queue are:");
       q1.display();

       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the key to be searched:");
       int key=obj.nextInt();
       q1.search(key);
    }
}
