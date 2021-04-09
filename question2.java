public class question2{
    public static void main(String args[]){
        int arr[]={0,0,1,1,0,0,0,1,0,0,1,1,1,0};
        int n=arr.length;
        int count=0,result=0;
        for(int i=0;i<n;i++){
            if (arr[i]==0){
                count = 0;

            }
            else{
                count++;
                result = Math.max(result, count);
            }
            
        }
        System.out.print(result);

    }
}
