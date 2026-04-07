public class SecondLargest {
    public static void main(String[] args) {
        
        int A[] = {1,5,6,3,26,4,7};
        int max1, max2;
        max1 = max2 = a[0];

        for (int i=0;i<a.length;i++) {
            if (a[i]>max1) {
                max1=max2;
            } else if (a[i]<max2) {
                max2=max1;
            }
        }

        System.out.println(max1);
    }
}
