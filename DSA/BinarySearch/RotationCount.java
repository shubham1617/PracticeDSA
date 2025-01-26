package BinarySearch;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
                //{3,4,5,6,7,9,11,0,1,2};
        int result = countRotation(arr);
        System.out.println(result);
    }

    static int countRotation(int[] arr){
        int pivot = findRotation(arr);
        return pivot+1;
    }



    static int findRotation(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(start<mid && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[start] >= arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
