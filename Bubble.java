public class Bubble{
    void BubbleSort(int arr[],int n){
      for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
      }
    }

    public static void main(String[] args) {
           Bubble sample = new Bubble();
           int arr[] = {64, 25, 12, 22, 11};
           sample.BubbleSort(arr, 5);
           System.out.println("Sorted array");
           for (int i : arr) {
               System.out.print(i + " ");
           }
           System.err.println("");
       }
   }