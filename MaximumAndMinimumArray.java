import java.security.KeyPair;

public class MaximumAndMinimumArray {
//    Method 1.  simple linear Search
   static class pair{
       int min;
       int max;

}
static pair getMinMax(int arr[],int n) {
    pair minmax = new pair();
    int i;
    if (n == 1) {
        minmax.max = arr[0];
        minmax.min = arr[0];
        return minmax;
    }
       if (arr[0] >arr[1]){
           minmax.max =arr[0];
           minmax.min=arr[1];

       }
       else {
           minmax.min=arr[1];
           minmax.max=arr[0];

       }
       for (i=2;i<n;i++){
           if (arr[i] > minmax.max){
               minmax.max=arr[i];
           }
           else if (arr[i] < minmax.min){
               minmax.min=arr[i];
           }

       }
       return minmax;

}

    public static void main(String[] args) {
        int arr[]={1000,11,445,1,330,3000};
        int arr_size =6;
        pair minmax =getMinMax(arr,arr_size);
        System.out.println(minmax.min);
        System.out.println(minmax.max);
   }
}




