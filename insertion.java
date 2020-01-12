import java.util.*;
class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    //System.out.println("enter how many elements:-");
    int n = 6;
    int a[] = { 2, 4, 3, 6, 8, 7 };
    int temp;

    for (int i = 1; i < n; i++)
      {
	temp = a[i];
	int j = i - 1;
	while (j >= 0 && a[j] > temp)
	  {
	    a[j + 1] = a[j];
	    j--;

	  }
	a[j + 1] = temp;

      }

    System.out.println ("Sorted array is:-");

    for (int i = 0; i < a.length; i++)
      {


	System.out.println (a[i] + " ");
      }

  }

}
