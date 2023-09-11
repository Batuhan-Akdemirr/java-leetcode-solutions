import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(FizzBuzz.fizzBuzz(30));
    }

    public  static List<String> fizzBuzz(int n) {
        List<String> fizzList = new ArrayList<>();
        int counter = n;
        while (counter>0){
            if(counter % 15 == 0)  fizzList.add("FizzBuzz");
            else if(counter%5 ==0 ) fizzList.add("Buzz");
            else if(counter%3==0) fizzList.add("Fizz");
            else  fizzList.add(String.valueOf(counter));
            counter--;
        }

        Collections.reverse(fizzList);
        return fizzList;
    }
}


/*
Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.

Example 1:

Input: n = 3
Output: ["1","2","Fizz"]
Example 2:

Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]
Example 3:

Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 */