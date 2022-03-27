package arrays;
//https://www.youtube.com/watch?v=Wm84BWMLQvw
public class sortNumbers {
    public static void main(String[] args) {
        int arr[]={12,4,7,3,8,6};
int n= arr.length;
        for (int i = 0; i <n-1 ; i++) {
            for (int j = 0; j <n-i-1 ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
