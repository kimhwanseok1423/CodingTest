
//레벨2단계 최댓값과 최솟값
class Solution3 {



    public String solution(String s) {
        int min ,max,n;
            String[] arr=s.split(" ");
            min=max=Integer.parseInt(arr[0]);
        for(int i=0; i<arr.length;i++) {
n=Integer.parseInt(arr[i]);
if(min>n)
    min=n;
if(max<n)
    max=n;



}





                return min+" "+max;
    }


}

public class Main2 {
    public static void main(String[] args) {
        Solution3 so=new Solution3();
String s="1 2 3 4";
System.out.println(so.solution(s));
    }


}