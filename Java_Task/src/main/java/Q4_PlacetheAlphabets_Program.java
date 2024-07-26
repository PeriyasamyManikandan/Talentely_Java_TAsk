//4. Place the Alphabets
import java.util.*;
public class PlacetheAlphabets_Program4 {
  public static void main(String[] args) {

    Scanner in=new Scanner(System.in);

    int n=in.nextInt();

    int a[]=new int[n];

    char c[]=new char[n];

    for(int i=0;i<n;i++)

    {

      a[i]=in.nextInt();

    }

    int d[]=a.clone();

    for(int i=0;i<n-1;i++)

    {

      for(int j=i+1;j<n;j++)

      {

        if(a[i]>a[j])

        {

         int t=d[i];

         d[i]=d[j];

         d[j]=t;

        }

      }

    }

    int m=97;

    for(int i=0;i<n;i++)

    {

      for(int j=0;j<n;j++){

        if(d[i]==a[j])

        {

          c[j]=(char) m++;

        }

      }

    }

    System.out.print("{");

    for(int i=0;i<n-1;i++)

    {

      System.out.print(c[i]+",");

    }

     System.out.print(c[n-1]+"}");
      System.out.println();
  }

}   

