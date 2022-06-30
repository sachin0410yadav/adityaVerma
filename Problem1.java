public class Problem1{
    

    static int minNumIndex(int[] arr){
        int l=0;
        int r=arr.length-1;

        while(l<=r){
            int mid=l+(r-l)/2;
            if(mid>0 && arr[mid]<arr[mid-1]){
                return mid;
            }
            if(arr[mid]>=arr[l] && arr[mid]>=arr[r]){

                l=mid+1;
            }else{
                r=mid-1;
            }
        }


        return 0;
    }
    static int binarySearch(int[] arr,int l,int r,int target ){
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(target>arr[mid]){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        int[] arr={11,12,15,18,2,5,6,8};

        int minNumIndex=minNumIndex(arr);
        int unsortedStart=minNumIndex;
        int sortedEnd=minNumIndex-1;

        int num1=binarySearch(arr, unsortedStart, arr.length-1, 15);
        int num2=binarySearch(arr, 0, sortedEnd, 15);


        System.out.println(num1+num2);
        
    }
}