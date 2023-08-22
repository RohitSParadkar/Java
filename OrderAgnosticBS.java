/* 
   where we donnt know is array is sorted increasing of decreasing order

*/ 

class OrderAgnosticBS{
     public static void main(String[] args){
        int arr[]={9,8,7,6,5,4,3,2};
        int target = 3;
        System.out.println(search(arr,target));
    }
    static int search(int arr[],int target){
        int start = 0;
        int end = arr.length -1;
        boolean order = arr[start]<arr[end];
        while(start<=end){
            int mid =start+(end-start)/2;  //or start+end/2 is also fine
            if(arr[mid]==target){
                return mid;
            }
            if(order){
              if(target>arr[mid]){
                 start=mid+1;
            }else if(target<arr[mid]){
                end =mid-1;
            }
            }else{
                  if(target<arr[mid]){
                 start=mid+1;
            }else if(target>arr[mid]){
                end =mid-1;
            }
            }
            
        }
        return -1;
    }
}