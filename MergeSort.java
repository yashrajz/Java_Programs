import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 44, 23, 52, 16};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right){

        int[] mix = new int[left.length + right.length];

        int i = 0;  //to track left arr elements and compare it with right's elements 
        int j = 0;  //to track right arr elements and compare it with left's elements
        int k = 0;  //to track mix pos and add smallest (left/right) element into mix arr. 

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){     //left's element is smaller that right's
                mix[k] = left[i];       //add lefts ele to mix arr.
                i++;                    //compare the next left's ele to right's
            }
            else{
                mix[k] = right[j];      //similar in right's case.
                j++;
            }

            k++;

        }
        //Add the remaining elements of left/right (one of the array may not be completed)
        while(i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }

        while(j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }

        return mix;
    }
}
