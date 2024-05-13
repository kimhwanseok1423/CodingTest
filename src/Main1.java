
//핸드폰번호 가리기
class Solution2 {
    String answer;
    public String solution(String phone_number) {

      String answer="";
      for(int i=0;i<phone_number.length()-4;i++){
          answer+="*";
      }
      answer+=phone_number.substring(phone_number.length()-4);
      System.out.println(answer);
        return answer;
    }


}

public class Main1 {
    public static void main(String[] args) {
        Solution2 so=new Solution2();
        so.solution("01033334444");

    }


}