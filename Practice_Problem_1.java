package Stack_Interview_Questions;
import java.util.*;
public class Practice_Problem_1 {
    static int countForBalance(String str){
        Stack<Character> st = new Stack<>();
        int n = str.length();
        int count = 0;
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch == '(') st.push(ch);
            else{
                if(st.size() == 0) count++;
                else if(st.peek()=='(') st.pop();
            }
        }
        return count+st.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bracket sequence :- ");
        String str = sc.next();
        System.out.println("Number of brackets to be removed to get a balanced String :- "+countForBalance(str));
    }
}