import java.util.Stack;
public class BalanceParanthesis{
    public static void main(String[] a){
        String str = "()(()){[]}";

        if(isbalanced(str))
            System.out.println("Balanced Paranthesis");
        else
            System.out.println("Not Balanced Paranthesis");
    }

    public static boolean isbalanced(String str){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char x = str.charAt(i);
            if(x == '(' || x == '[' || x == '{'){
                stack.push(x);
                continue;
            }
             
            if(stack.isEmpty())
                return false;
            char check;
            switch(x) {
                case ')' :
                    check = stack.pop();
                    if(check == ']' || check == '}'){
                        return false;
                    }
                     break;
                        
                case ']' :
                    check = stack.pop();
                    if(check == ')' || check == '}'){
                        return false;
                    }
                    break;
                case '}' :
                    check = stack.pop();
                    if(check == ']' || check == ')'){
                        return false;
                    } 
                    break;
            }
        }
        return stack.isEmpty();
    }
}