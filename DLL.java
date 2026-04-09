public class DLL{
		Node head=null;
		Node tail=null;
	    void addFromHead(int el) {
	        Node nnode = new Node();
	        nnode.data=el;
	        if (head == null) {
	            head= tail = nnode;
	        } else {
	        	nnode.prev=null;
	            nnode.next = head;
	            head.prev = nnode;
	            head=nnode;
	        }
	    }
	    void addFromTail(int el) {
	    	Node nnode = new Node();
	        nnode.data=el;
	        if (head == null) {
	            head=tail = nnode;
	        } else {
	            nnode.next = null;
	            nnode.prev=tail;
	            tail.next = nnode;
	            tail = nnode;
	        }
	    }
	    void addFromKPos(int el, int k) {
	    	int size=1;
	    	Node tsize=head;
	    	while(tsize!=null) {
	    		size++;
	    		tsize=tsize.next;
	    	}
	    	if(1<=k && k<=size) {
	    		Node nnode=new Node();
	    		nnode.data=el;
	    		if (k == 1) {
		            addFromHead(el);
		        } else if (k==size) {
		            addFromTail(el);
		        }else {
		        		Node temp=head;
		        		for(int i=1;i<k-1;k++) {
		        			temp=temp.next;
		        		}
		        		nnode.prev=temp;
		        		nnode.next=temp.next;
		        		temp.next.prev=nnode;
		        		temp.next=nnode;	
		        }
	    	} else {
		            System.out.println("Invalid position !!!");
		        }  
	    }
	    void deleteFromHead() {
	        if (head == null) {
	            System.out.println("Empty Linked List");
	            return;
	        }
	        else if (head == tail) {
	            head = tail = null;
	        } else {
	            head=head.next;
	            head.prev=null;
	        }
	    }
	    void deleteFromTail() {
	        if (head == null) {
	            System.out.println("Empty Linked List.");
	            return;
	        }
	        else if (head == tail) {
	            head = tail = null;
	        } else {
	            tail=tail.prev;
	            tail.next=null;
	        }
	    }
	    void deleteFromKPosition(int k) {
	    	int size=1;
	    	Node tsize=head;
	    	while(tsize!=null) {
	    		size++;
	    		tsize=tsize.next;
	    	}
	    	if(1<=k && k<=size) {
	    		if (k == 1) {
	    			deleteFromHead();
	    		} else if(k == size) {
	    			deleteFromTail();
	            }else {
	            	Node temp = head;
		            for (int i = 1; i < k ; i++) {
		                temp = temp.next;
		            }
		            temp.prev.next=temp.next;
		            temp.next.prev=temp.prev;
	        	}
	    	}else {
	    		System.out.println("Invalid position !!!");
	    	}
	    }
	    void search(int key) {
	         int pos= 1,flag=0;
	         Node temp=head;
	         while(temp!=null){
	             if (temp.data == key) {
	                 flag=1;
	                 break;
	             }else {
	            	 pos++;
	            	 temp= temp.next;
	             }   
	         } 
	         if (flag==1) {
	             System.out.println("Key " + key + " found at position " +pos+".");
	         } else {
	             System.out.println("Key " + key + " not found in the linked list.");
	         }
	     }
	    void display() {
	        Node temp= head;
	        while(temp!= null){
	            System.out.print(temp.data);
	            temp= temp.next;
	            System.out.println();
	        }
	        System.out.println();
	    }
		public static void main(String[] args){

		}
	}
