import java.util.Scanner;

/**
 * This program will use a FOR loop to create a table convering
 * KPH to MPH. It will format the output using printf
 */

public class ForKPHtoMPH
{
  public static void main(String[] args)
  {
    
    int count; // The counter variable.
    double MPH; // Miles per hour.
    int KPH; // Kilometers per hour.
    final int MIN_KPH = 60; // Minimum speed for KPH.
    final int MAX_KPH = 130; // Maximum speed for KPH.
    int interval = 10; // Use an interval of 10 KPH.
    Scanner keyboard = new Scanner(System.in);
    
    // Prepare the table header.    
    System.out.println("KPH   \t\t   MPH");
    System.out.println("------------------------");
      
    // Begin the loop
    for (KPH = MIN_KPH; KPH <= MAX_KPH; KPH += interval)
    {
      MPH = KPH * 0.6214;
      System.out.printf("%d\t\t%.1f\n", KPH, MPH);
    }
   
    
  }
}
