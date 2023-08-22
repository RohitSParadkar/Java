/* 
Binnary search is for sorted arrays
step1: take middle element
step2: compare target>elememt=>search for right or target<element=>left or middle element=target (answer)
step3: 

*/
public class BinarySearch{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8};
        int target = 3;
        System.out.println(search(arr,target));
    }

    static int search(int arr[],int target){
        int start = 0;
        int end = arr.length -1;
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