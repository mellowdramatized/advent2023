// import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
// import java.io.File;
import java.io.FileNotFoundException;

class App {
public static int getSum(String s){
    int sum = 0;
    String digits = "";
    //make a string of just the numbers
    for (int i = 0; i < s.length(); i++){

      if (Character.isDigit(s.charAt(i))){
        digits += s.charAt(i);
      }
    }
    //if there is only one number they want us to count it twice I think
    if (digits.length() == 1){
      sum = Integer.valueOf(digits) * 11;
    }

    //take the first and last number and covert to Integer value
    else {
      // int first = Integer.parseInt(digits.substring(0,1));
      // int last = Integer.parseInt(digits.substring(digits.length()-1));
      String firstlet = digits.substring(0,1);
      String lastlet = (digits.substring(digits.length()-1));
      String letter = firstlet+lastlet;
      // sum = first + last;
      sum = Integer.parseInt(letter);
      System.out.println(sum);
    }
    return sum;
   
  }
  public static void main(String[] args) throws FileNotFoundException {
    Scanner scan = new Scanner(new BufferedReader(new FileReader("day1advent.txt")));
    int finaltot = 0;
    while (scan.hasNextLine()) {
      String line = scan.nextLine();
      System.out.println(line);
      
      finaltot = finaltot+getSum(line);
      System.out.println("Final " + finaltot);
      
}
}
}