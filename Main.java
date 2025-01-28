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
  for (int row = 1; row <= N; row++)
  {
    for (int curr_num = 1; curr_num <= row; curr_num++)
    {
      System.out.print(curr_num + " ");
    }
    System.out.println();
  }
}

public static void starTree()
{
  for (int row = 0; row < 9; row++)
  {
    for (int space_count = 0; space_count < row; space_count++)
    {
      System.out.print(" ");
    }

    for (int star_count = row; star_count < 9; star_count++)
    {
      System.out.print("* ");
    }
    System.out.println();
  }
}