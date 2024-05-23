package Stack;

import java.util.Scanner;
import java.util.Stack;

public class validParenthisis {
    public static boolean isValid(String str){
        char[] chars = str.toCharArray();

        Stack<Character> stack1 = new Stack<>();
        for(char element:chars){
            //If the element contains open bracket we pushed in the stack
            if(element == '(' || element == '[' || element == '{'){
                stack1.push(element);
                continue;
            }
            
            else if(stack1.empty()){
                return false;
            }
            char top =stack1.pop();

            if(top == '(' && element != ')'){
                return false;
            }
            else if(top == '[' && element != ']'){
                return false;
            }
            else if(top == '{' && element != '}'){
                return false;
            }
        }

        return (stack1.empty() == true);
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        System.out.println("Is the given String is valid? "+isValid(str));
        sc.close();
    }
}
