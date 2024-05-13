import java.util.Locale;

//JadenCase 문자열 만들기
class Solution5 {
    public String solution(String s) {
        String answer = "";

        String arr[] = s.split(" ");
        for (int i = 0; i < arr.length; i++) {

            String now = arr[i];
            if (arr[i].length() == 0)
                answer += " ";
            else {
                answer += now.substring(0, 1).toUpperCase();
                answer += now.substring(1, now.length()).toLowerCase();
                answer += " ";
            }
        }

if(s.substring(s.length()-1,s.length()).equals(" ")){
    return answer;
}



        return answer.substring(0,answer.length()-1);
    }
}











public class LV2_1{
    public static void main(String[] args) {
        Solution5 so=new Solution5();
        String s="for the last week";

        System.out.println(so.solution(s));

    }
}
