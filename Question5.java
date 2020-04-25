import java.util.Scanner;
import java.util.Arrays;
public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter Number: ");
    int number = in.nextInt();
    int[] InputNumbers = new int[number];
    int positionnumber = 0;

    while (number > 0 ) {

      System.out.println("Enter next Number: ");
      int inputnumber = in.nextInt();
      InputNumbers[positionnumber] = inputnumber;
      number = number - 1;
      positionnumber = positionnumber + 1;
    }
    
 
    int count = 0;
    int modenumber = 0;
    for(int i : InputNumbers) {
      int icount = 0;
      for(int x : InputNumbers){
        if (i == x){
          icount = icount + 1;
        }
      }
      if (icount > count){
        count = icount;
        modenumber = i;
      }
    }
    System.out.println("The mode number is : " + modenumber);
    
  }
}
