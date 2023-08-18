class RichestCustomer{
    public static void main(String[] args){
    int accounts[][] = {{2,3,4},{3,6,7},{3,7,3}};
    long begin = System.currentTimeMillis();
      int maxAmount=0;
        for(int[] ele: accounts){
             if(sumList(ele)>maxAmount){
                 maxAmount =sumList(ele);
             }
        }
        System.out.println(maxAmount);
      long end = System.currentTimeMillis();
      //long time = end-begin ;
      System.out.println("Elapsed Time: "+(end-begin)+" milli seconds");
    }

   static int sumList(int arr[]){
    int sum=0;
    for(int i=0;i<arr.length;i++){
        sum = sum+arr[i];
    }
    return sum;
   }
}