import java.util.Arrays;
import java.util.Collection;
public class kth_smallestlargest_element_unsorted_Array {
    public static int kthSmallest(int [] arr,int k){
        Arrays.sort(arr);
        return arr[k-1];
    }

    public static void main(String[] args) {
        int arr[] =new int[] {12,3,5,6,7,19};
        int k=2;
        System.out.println("kth smallest element is = " + kthSmallest(arr,k));
    }
}
