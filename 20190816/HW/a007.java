package text;

import java.util.Scanner;
import java.lang.Math.*;
 
public class text
{      
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);
    while(scanner.hasNext())
    {
      int a = scanner.nextInt();
      int b = (int)Math.sqrt(a);
      boolean prime = true;
      
      for(int i = 2;i <= b;++i)
      {
        if(a % i == 0)
        {prime = false;break;}
      }
      
      System.out.println(prime ? "質數" : "非質數");
      
    }
  }
}
