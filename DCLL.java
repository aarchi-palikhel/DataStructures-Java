class DCLL {
    Node head;
    Node tail;

    void addFromHead(int el) {
        Node newNode = new Node(el);

        if (head == null) {
            head = tail = newNode;
            head.next = head.prev = head;
        } else {
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        }
    }

    void addFromTail(int el) {
        Node newNode = new Node(el);

        if (head == null) {
            head = tail = newNode;
            head.next = head.prev = head;
        } else {
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
            tail.next = newNode;
            tail = newNode;
        }
    }

    void addFromKPos(int el, int k) {
        int size = 1;
        Node tsize = head;

        while (tsize.next != head) {
            size++;
            tsize = tsize.next;
        }

        if (1 <= k && k <= size) {
            Node newNode = new Node(el);

            if (k == 1) {
                addFromHead(el);
            } else if (k == size) {
                addFromTail(el);
            } else {
               Node temp = head;

                for (int i = 1; i < k - 1; i++) {
                    temp = temp.next;
                }

                newNode.prev = temp;
                newNode.next = temp.next;
                temp.next.prev = newNode;
                temp.next = newNode;
            }
        } else {
            System.out.println("Invalid position !!!");
        }
    }

    void deleteFromHead() {
        if (head == null) {
            System.out.println("Empty Linked List");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head.next.prev = tail;
            tail.next = head.next;
            head = head.next;
        }
    }

    void deleteFromTail() {
        if (head == null) {
            System.out.println("Empty Linked List.");
        } else if (head == tail) {
            head = tail = null;
        } else {
            tail.prev.next = head;
            head.prev = tail.prev;
            tail = tail.prev;
        }
    }

    void deleteFromKPosition(int k) {
        int size = 1;
        Node tsize = head;

        while (tsize.next != head) {
            size++;
            tsize = tsize.next;
        }

        if (1 <= k && k <= size) {
            if (k == 1) {
                deleteFromHead();
            } else if (k == size) {
                deleteFromTail();
            } else {
                Node temp = head;

                for (int i = 1; i < k; i++) {
                    temp = temp.next;
                }

                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
        } else {
            System.out.println("Invalid position !!!");
        }
    }

    void search(int key) {
        int pos = 1;
        int flag = 0;
        Node temp = head;

        do {
            if (temp.data == key) {
                flag = 1;
                break;
            } else {
                pos++;
                temp = temp.next;
            }
        } while (temp != head);

        if (flag == 1) {
            System.out.println("Key " + key + " found at position " + pos + ".");
        } else {
            System.out.println("Key " + key + " not found in the linked list.");
        }
    }

    void display() {
        Node temp=head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
            System.out.println();
        } while (temp != head);

        System.out.println();
    }
	public static void main(String[] args){

	}

}