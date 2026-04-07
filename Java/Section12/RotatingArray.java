// RotatingArray.java
// Program to insert an element into an array by shifting elements to the right.

public class RotatingArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9};
        
        int n=15;
        int index=2;
        for(int x:a)
            System.out.print(x+",");
        System.out.println(" ");
        
        for(int i=a.length-1;i<index;i++)
            a[i]=a[i-1];
        a[index]=n;
        
        for(int x:a)
            System.out.print(x+",");
    }        
}
