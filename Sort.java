public class Sort {
    static void bubbleSort(int []a){
        int n=a.length;
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<(n-i);j++){
                if(a[j-1]>a[j]){
                  temp=a[j-1];
                  a[j-1]=a[j];
                  a[j]=temp;
                }
            }
        }
    }
    static void insertionSort(int []a){
        int n=a.length;
        for(int i=1;i<n;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0 && key<a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
    }
    static void selectionSort(int []a){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
    }
    static void quickSort(int[]a ,int l,int r)
     {
         if(l<r){
             int k=partition(a,l,r);
             quickSort(a,l,k-1);
             quickSort(a,k+1,r);                   
         }
     }
    static int partition(int[] a,int l,int r)
    {
        int pivot=a[l];
        int x=l;
        int y=r;
        while(x<y)
        {
            while(a[x]<=pivot)
            {
                x++;
            }
            while(a[y]>pivot)
            {
                y--;
            }
            if(x<y) {
      	        int temp=a[x];
                a[x]=a[y];
                a[y]=temp;
            }
        }

        int temp=a[y];
        a[y]=a[l];
        a[l]=temp;
        return y;
    }
    public static void main(String[] args) {
       int []a={9,5,6,8,1,2,7,3};
       System.out.println("Before Sort:");
       for(int i=0;i<a.length;i++){
           System.out.print(a[i]+" ");
       }
       System.out.println();
       bubbleSort(a);
       System.out.println("After Bubble Sort:");
       for(int i=0;i<a.length;i++){
           System.out.print(a[i]+" ");
       }
       System.out.println();
       insertionSort(a);
       System.out.println("After Insertion Sort:");
       for(int i=0;i<a.length;i++){
           System.out.print(a[i]+" ");
       }
       System.out.println();
       selectionSort(a);
       System.out.println("After Selection Sort:");
       for(int i=0;i<a.length;i++){
           System.out.print(a[i]+" ");
       }
	System.out.println();
	System.out.println("After Quick Sort:");
	quickSort(a,0,a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
    }
System.out.println();
}
}