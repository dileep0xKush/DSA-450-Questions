public class Move_all_the_negative_elements_to_one_side_of_the_array {
    static void reaarrang(int arr[],int n){
        int j=0;
        int temp;
        for (int i=0;i<n;i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
    static void printArray(int arr[], int n){
        for (int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] ={ -1, 2, -3, 4, 5, 6, -7, 8, 9};
    int n =arr.length;
    reaarrang(arr,n);
    printArray(arr,n);
    }
}
