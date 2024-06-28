import java.util.*;
public class Balanced_Brackets {
    public static boolean isBalanced(String str){
          Stack<Character> st = new Stack<>();
          int n = str.length();
          for(int i=0;i<n;i++){
              char ch = str.charAt(i);
              if(ch == '('){
                  st.push(ch);
              }
              else{ // ch == ')'
                  if(st.size() == 0) return false;
                  if(st.peek() == '(') st.pop();
              }
          }
          return st.size() == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bracket sequence :- ");
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
    }
}
