public class ArrayLeftRotation {
 
    public static void rotateArrayByOne(int array[], int d, int n) {
        int i, temp;

        temp = array[0];
        for (i = 0; i < n - 1; i++)

            array[i] = array[i + 1];
        array[i] = temp;
    }

    public static void main(String args[]) {

 int array[]= {11,22,33,44,55,66};
 int r=1;
 int n =array.length;
 System.out.println("Before rotate array");
 for(int i=0;i<n;i++){
    System.out.print(array[i] + " ");
 }
 System.out.println();
 rotateArrayByOne(array, r, n);
 System.out.println("After rotate array");
  for(int i=0;i<n;i++){
    System.out.print(array[i] + " ");
 }

        }
    }
