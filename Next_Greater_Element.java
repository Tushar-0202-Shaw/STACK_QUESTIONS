package Stack_Interview_Questions;
import java.util.Stack;
public class Next_Greater_Element {
    static int[] nextGreaterElement(int[]arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] res = new int[n];
        st.push(arr[n-1]);
        res[n-1] = -1;
        for(int i=n-2;i>=0;i--){
            while(st.size() != 0 && st.peek()<arr[i]){
                st.pop();
            }
            if(st.size() == 0) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,8,6,3,4};
        int[] result = nextGreaterElement(arr);
        for(int element : result){
            System.out.print(element+" ");
        }
    }
}