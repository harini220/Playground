import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        // Get the size of an array
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        // Get the array elements
        for(int idx = 0; idx <= arr_size - 1; idx++)
        {
            arr[idx] = in.nextInt();
        }
      int Search_elem_1 = in.nextInt();
      int Search_elem_2 = in.nextInt();
      int elem_1_idx = -1;
      int elem_2_idx = -1;
      for(int idx= 0; idx <= arr_size - 1;idx++)
      {
        if(Search_elem_1 == arr[idx])
        {
          elem_1_idx = idx;
        }
        if(Search_elem_2 == arr[idx]){
          elem_2_idx = idx;
        }
      }
      System.out.println(elem_1_idx);
      System.out.println(elem_2_idx);
    }
}