
class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
    }
}

public class SCLL1{
    Node head = null;
    Node tail = null;

    void addH(int el) {
        Node nnode = new Node(el);
        if (head == null) {
            nnode.next = nnode;
            head = tail = nnode;
        } else {
            nnode.next = head;
            head = nnode;
            tail.next = head;
        }
    }

    void addT(int el) {
        Node nnode = new Node(el);
        if (head == null) {
            nnode.next = nnode;
            head = tail = nnode;
        } else {
            nnode.next = head;
            tail.next = nnode;
            tail = nnode;
        }
    }

    void addK(int el, int k) {
        int size = 1;
        Node tsize = head;
        if (head != null) {
            do {
                size++;
                tsize = tsize.next;
            } while (tsize != head);
        }
        
        if (1 <= k && k <= size) {
            Node nnode = new Node(el);
            if (k == 1) {
                addH(el);
            } else if (k == size) {
                addT(el);
            } else {
                Node temp = head;
                for (int i = 1; i < k - 1; i++) {
                    temp = temp.next;
                }
                nnode.next = temp.next;
                temp.next = nnode;
            }
        } else {
            System.out.println("Invalid");
        }
    }

    void display() {
        if (head == null) {
            System.out.println("Empty");
        } else {
            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        }
    }

    void remT() {
        if (head == null) {
            System.out.println("Empty");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = head;
            tail = temp;
        }
    }

    void remH() {
        if (head == null) {
            System.out.println("Empty");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
    }

    void remP(int k) {
        int size = 1;
        Node tsize = head;
        if (head != null) {
            do {
                size++;
                tsize = tsize.next;
            } while (tsize != head);
        }
        
        if (1 <= k && k <= size) {
            if (k == 1) {
                remH();
            } else if (k == size) {
                remT();
            } else {
                Node temp = head;
                for (int i = 1; i < k - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }
        } else {
            System.out.println("Invalid");
        }
    }

    void search(int key) {
        Node temp = head;
        int flag = 0, pos = 1;
        if (head != null) {
            do {
                if (temp.data == key) {
                    flag = 1;
                    break;
                } else {
                    pos++;
                    temp = temp.next;
                }
            } while (temp != head);
        }

        if (flag == 1) {
            System.out.println("Key found at pos " + pos);
        } else {
            System.out.println("Key not found");
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SCLL1 s = new SCLL1();
        s.addH(1);
        s.addH(2);
        s.addT(5);
        s.addK(7, 2);
        s.search(7);
        s.display();
        System.out.println();
        s.remP(2);
        s.remH();
        s.remT();
        s.display();
    }
}
