//5. Find sum of all prime numbers in the array, except the smallest prime number:Madhav has assigned the task of finding the sum of all prime number in the array, except the smallest prime number in the array. Madhav approaches you to help him do this by writing a program.
import java.util.*;

public class findsumofp_program5 {

  public static void main(String[] args) {

    Scanner in=new Scanner(System.in);

    int n=in.nextInt(),m;


    ArrayList<Integer> a=new ArrayList<Integer>();

    for(int i=0;i<n;i++)

    {

      m=in.nextInt();

      int f=0;

      for(int j=2;j<m;j++){

        if(m%j==0)

        {

          f=1;

          break;

        }

      }

      if(f==0)

        a.add(m);

    }

    Collections.sort(a);

    int sum=0;

    for(int i=1;i<a.size();i++){

    sum+=a.get(i);

    }

    System.out.println(sum);

  }

}

