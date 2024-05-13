import java.util.Locale;

//숫자의표현
class Solution6 {
    public int solution(int n) {
        int answer = 0;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=i;
            if(sum==n){
                answer++;
                break;
            }

            for(int j=i+1;j<n;j++){
                sum+=j;
                if(sum==n){
                    answer++;
                    break;
                }
            }



        }
        return answer;
    }
}










public class LV2_2{
    public static void main(String[] args) {
        Solution6 so=new Solution6();
        int n=15;

        System.out.println(so.solution(n));

    }
}
