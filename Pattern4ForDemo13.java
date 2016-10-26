/*    * * * * * * *
      * * * * * *
	  * * * * *
	  * * * *
	  * * *                
	  * *
	  *
	  
	      */

import java.util.Scanner;

public class Pattern4ForDemo13 // This logic starts from i=0(i.e considering the first row as zero i.e row 0)
{
 public static void main(String[] args)
 {
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter the number of rows to be entered:");
 int n=sc.nextInt();
 System.out.println("\n");
 
 for(int i=n;i>=1;i--)
 {
 for(int j=i;j>=1;j--)
 {
 System.out.print("* ");
 }
 System.out.println("\n");
 }
 }// class close
 }// main close