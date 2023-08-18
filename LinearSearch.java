
//Time complexity =O(n) 
// str.length(); ls.length   different methods for lsay and string
// not function nextChar() instead can use next().charAt(0)
// 
import java.util.*;
public class LinearSearch{
    public static void main(String[] args){
         String ls ="list is empty";
         Scanner sc = new Scanner(System.in);
         char target = sc.next().charAt(0);
         System.out.println(search(ls,target));
          

         int arr2D[][] = {{12,3,4},{11,13,9},{4,5,6}};
         int target2 =5;
         System.out.println(Arrays.toString(search(arr2D,target2)));


         int number[]={22,13,24,5,6};
         System.out.println(minNumber(number));
    }

 //linear search in character
    static String search(String str, char target){
        if(str.length()==0){
            return "list is empty";
        }else{
            // for(int i=0;i<str.length();i++){
            //     if(str.charAt(i)==target){
            //         return "item found";
            //     }
            // }
            for(char ele:str.toCharArray()){
                if(ele==target){
                     return "item found";
                }
            }
        }
        return "item not found";
    }
 
 // search in 2D array
    static int[] search(int arr[][],int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col}; //new  object needed to create
                }
            }
        }
        return new int[]{-1};
    }

  //minimum number
    static int minNumber(int arr[]){
        if(arr.length==0){
            return -1;
        }else{
            int minnum = arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]<minnum){
                    minnum = arr[i];
                }
            }
            return minnum;
        }
    }

// count number of digit //log10(num)+1
    static int digitCount(int num){
        int count =0;
        while(num>0){
            num=num/10;
            count+=1;
        }
        return count;
    }

    // min 2D array
}