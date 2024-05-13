
//레벨2 올바른괄호
class Solution4{
    boolean solution(String s) {

        int count=0;
        boolean answer = true;
for(int i=0;i<s.length();i++){
    if(s.charAt(i) == '('){
        count++;

    }
if(s.charAt(i)==')'){
    count--;
}
if(count<0){
    break;
}

}
if(count==0)
    answer=true;
else{
    answer=false;
}


        return answer;
    }
}












public class Lv2 {
    public static void main(String[] args) {
        Solution4 so=new Solution4();
        String s="()()";

        System.out.println(so.solution(s));

    }
}
