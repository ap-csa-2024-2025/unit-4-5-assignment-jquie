import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    printNTimes("word", 7);
    System.out.pritnln();
    printNums();
  }

  public static void printNTimes(String word, int N)
  {
    for (int curr_index = 0; curr_index < word.length(); curr_index++)
    {
      for (int curr_print = 0; curr_print < N; curr_print++)
      {
        String letter = word.substring(curr_index, curr_index+1);
        System.out.print(letter);
      }
    }
  }

  public static void printNums()
  {
   for (int i = 10; i > 0; i--)
   {
    for (int j = 0; j < i; j++)
    {
      System.out.print(i + " ");
    }
    System.out.println();
   }
  }

  public static void uprightNumberTriangle(int N)
  {
    // code solution here
  }

  public static void starTree()
  {
    // code solution here
  }

  public static void multTable()
  {
    // code solution here
  }
}
