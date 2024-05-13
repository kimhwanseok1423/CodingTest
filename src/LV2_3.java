class Solution7 {
    public int solution(int n) {
//피보나치 수
        int arr[]=new int[n+1];
arr[0]=0;
arr[1]=1;
        for(int i=2;i<=n;i++){

            arr[i]=(arr[i-1]+arr[i-2])%1234567;
        }
        return arr[n]%1234567;
    }
}









public class LV2_3{
    public static void main(String[] args) {
        Solution7 so=new Solution7();
        int n=5;

        System.out.println(so.solution(n));

    }
}
