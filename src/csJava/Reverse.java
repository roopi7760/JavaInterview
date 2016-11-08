/*
 * 
 * 
 * 
 * 
 */
package csJava;

import java.util.Scanner;
import java.lang.Math;
class Reverse
{
   //A method for reverse
   public int reverseMethod(int[] numList) {
	   int num = 0, count=1;
       for(int i = 0; i< numList.length; i++)
       {
    	   num += numList[i]*count;
    	   count*=10;
       }
       
       return num;
   }
   public static void main(String args[])
   {
	Reverse rev = new Reverse();
	int num=0;
	int size=0;
	System.out.println("Input your number and press enter: ");
	Scanner in = new Scanner(System.in);
	num = in.nextInt();
	size = (int)(Math.log10(num)+1);
	int[] array = new int[size];
  
  //System.out.println(num.length);

	while(num > 0 && size>=0)
	{
	  array[size-1] = num%10;
	  num=num/10;
	  size--;
	}

	System.out.println("Contents of the array is :");
	for(int i=0; i< array.length;i++)
	{
		System.out.println(array[i]);
	}
	
	System.out.print("Reverse of the input number is:" + rev.reverseMethod(array));
	System.out.println();
   }
}
