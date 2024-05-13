//자릿수 더하기
     class Solution {
//자릿수 더하기
        public int solution(int n) {
            int answer=0;

            while (true) {
                answer += n % 10;
                if (n < 10) {
                    break;
                }
                n = n / 10;
            }

    System.out.println(answer);
            return answer;
        }
    }

    public class Main {
    public static void main(String[] args) {
      Solution so=new Solution();
      int n=123;
      so.solution(n);

        }


}