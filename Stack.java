import java.util.Scanner;
public class Stack {
    int maxsize=5;
    int []Stack= new int[maxsize];
    int top = -1;
 
    boolean isEmpty(){
       return top==-1;
    }
    boolean isFull(){
       return top==maxsize-1;
    }
    void push(int el){
        if(isFull()){
            System.out.println("Stack Overflow");
        }else{
            top++;
            Stack[top]=el;
        }
    }
    void pop(){
        if(isEmpty()){
            System.out.println("Empty Stack");
        }
        else{
            System.out.println("Popped element: "+Stack[top]);
            top--;
        }
    }
    void search(int key){
        int flag=0,pos=1;
        for(int i=top;i>=0;i--){
            if(Stack[i]==key){
                flag=1;
                break;
            }
            else{
                pos++;
            }
        }
        if(flag==1){
            System.out.println(key+" Key found at position "+pos+".");
        }
        else{
            System.out.println("Key not found");
        }
    }
    void display(){
        for(int i=top;i>=0;i--){
            System.out.println(Stack[i]);
        }
    }
    public static void main(String[] args){
        Stack s1=new Stack();
        System.out.println("Pushed Elements");
        s1.push(3);
        s1.push(7);
        s1.push(11);
        s1.push(13);
        s1.display();
        s1.pop();
        s1.display();
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the Key:");
        int key=obj.nextInt();
        s1.search(key);
    }
 }