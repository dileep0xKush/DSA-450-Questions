import javax.imageio.stream.ImageInputStream;
import java.io.*;
public class Sort_an_array_of_0s_1s_and_2s {
static void sort012(int a[],int arr_size){
    int lo =0;
    int hi =arr_size -1;
    int mid =0,temp =0;
    while (mid<=hi){
        switch (a[mid]){
            case 0:{
                temp =a[lo];
                a[lo]=a[mid];
                a[mid]=temp;
                lo++;
                mid++;
                break;
            }
            case 1:
                mid++;
                break;
            case 2:{
                temp=a[mid];
                a[mid]=a[hi];
                a[hi]=temp;
                hi--;
                break;
            }
        }
    }
}


static void printArraay(int arr[],int arr_size){
    int i;
    for (i=0;i<arr_size;i++){
        System.out.print(arr[i] + " ");
        System.out.print("");
    }


}

    public static void main(String[] args) {
        int arr[]={ 0,1,1,0,1,2,1,2,0,0,0,1};
        int arr_size = arr.length;
        sort012(arr,arr_size);
        System.out.println("Array after seggregation");
        printArraay(arr,arr_size);
    }

}
