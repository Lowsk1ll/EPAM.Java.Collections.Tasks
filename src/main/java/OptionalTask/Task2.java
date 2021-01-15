package OptionalTask;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        Integer number = in.nextInt();
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0;i<number.toString().length();i++){
            stack.push(number.toString().charAt(i));
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
