import java.util.Arrays;
import java.util.Stack;

class Solution8 {
    //짝지어 제거하기

    public int solution(String s) {


        Stack<Character> stack=new Stack();
char[] arr=s.toCharArray();
    for(char c:arr){
        if(stack.isEmpty()){
            stack.push(c);
            continue;
        }
        if(!stack.isEmpty()){
            if(stack.peek()==c){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }


        }



        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.


        return stack.isEmpty() ? 1 : 0 ;
    }
}







public class LV2_4{
    public static void main(String[] args) {
        Solution8 so=new Solution8();
        String s="cdcd";

        System.out.println(so.solution(s));

    }
}
