package BinarySearch;

public class RBSWithDuplicate {
    public static void main(String[] args) {
        int[] arr= {2,5,6,0,0,1,2};
        int target = 7;

        boolean result = search(arr,target);
        System.out.println(result);
    }

    public static boolean search(int[] arr, int target) {
        int pivot = findPivot(arr);
        if(arr[pivot] == target){
            return true;
        }
        if(pivot==-1){
            return binarySearch(arr,target,0,arr.length-1);
        }
        if(arr[0] <= target){
            return binarySearch(arr,target,0,pivot-1);
        }
        return binarySearch(arr,target,pivot+1,arr.length-1);

    }

    static int findPivot(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(start<mid && arr[mid] < arr[mid-1]){
                return mid-1;
            }

            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start = start+1;

                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end = end-1;
            }
            //left side if sorted and pivot should be on right side
            else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start= mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return -1;
    }

    static boolean binarySearch(int[] arr, int target,int start,int end) {
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }
}