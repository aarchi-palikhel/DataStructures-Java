public class HashTable {
    static int[] a;
    static int size;
     public HashTable(int size) {
        this.size = size;
        this.a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = -1;
        }
    }
    public static void insert(int key) {
        int index = key % size;
        if (a[index] == -1) {
            a[index] = key;
        } else {
            for (int i = 1; i < size; i++) {
                int newIndex = (index + (i*i)) % size;
                if (a[newIndex] == -1) {
                    a[newIndex] = key;
                    break;
                }
            }
        }
    }
    public static void search(int key) {
        int index = key % size;
        if (a[index] == key) {
            System.out.println("Key " + key + " is found at index " + index);
        } else {
            System.out.println("Key " + key + " is not found.");
        }
    }
    public static void delete(int key) {
    int index = key % size;
    boolean found = false;
    for (int i = 0; i < size; i++) {
        int nIndex = (index +(i*i)) % size;
        if (a[nIndex] == key) {
            a[nIndex] = -1;
            System.out.println("Key " + key + " is deleted successfully.");
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.println("Key " + key + " can't be deleted as it is not present.");
    }
}

    public static void print() {
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + ": " + a[i]);
        }
    }

    public static void main(String[] args) {
        HashTable b=new HashTable(10);
        insert(12);
        insert(13);
        insert(7);
        insert(1);
        insert(3);
        System.out.println("Inserted elements in hash table are:");
        print();
	System.out.println();
        delete(7);
        delete(3);
	System.out.println();
        print();
search(13);
    }
}
