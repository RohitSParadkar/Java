package BinaraySearch;
/**
 * InfiniteArr
 */
public class InfiniteArr {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
         int target = 8;
 
         int start =0;
         int end = 1;
         while(target>arr[end-1]){
             int newStart = end+1;
             end = end+((end-start+1)*2);
             start = newStart;
         }
         int result = search(arr, target, start, end);
         System.out.println(result);
 
     }
  static int search(int arr[],int target,int start,int end){
    while(start<=end){
        int mid =start+(end-start)/2;  //or start+end/2 is also fine
        if(target>arr[mid]){
             start=mid+1;
        }else if(target<arr[mid]){
            end =mid-1;
        }else{
            return mid;
        }
    }
    return -1;
}
}