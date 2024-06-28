import java.util.*;
class MinStack{
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();
    public void push(int val){
        if(st.size()==0){
            st.push(val);
            min.push(val);
        }
        else{
            st.push(val);
            if(min.peek()<val) min.push(min.peek());
            else min.push(val);
        }
    }
    public void pop(){
        st.pop();
        min.pop();
    }
    public int getMin(){
        return min.peek();
    }
}
public class Min_Stack {
    public static void main(String[] args) {
        MinStack m = new MinStack();
        m.push(7);
        m.push(8);
        m.push(5);
        m.push(6);
        m.push(3);
        System.out.println(m.st);
        System.out.println("Min element : "+m.getMin());
    }
}
