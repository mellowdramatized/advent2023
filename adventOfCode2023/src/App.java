
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

import java.io.FileNotFoundException;

class App {

  public static void main(String[] args) throws FileNotFoundException {
    Scanner scan = new Scanner(new BufferedReader(new FileReader("filename.txt")));
    
    while (scan.hasNextLine()) {
      String line = scan.nextLine();
      System.out.println(line);

}
}
}
