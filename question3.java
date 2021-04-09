public class question3 {
    public static void main(String args[]){
        int arr[]={0,1,2,3,4,5,6,7,7,8,9,10};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.print(+arr[i]);
                break;
            }
            else{
                continue;
            }

        }
        
    }
}
