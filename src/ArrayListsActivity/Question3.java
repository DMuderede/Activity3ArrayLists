package ArrayListsActivity;

import java.util.ArrayList;

public class Question3 {

    public static void main(String[] args) {
    ArrayList<Integer> a=new ArrayList<>();
  for(int n=1; n<=100; n++){
        int c = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                c++;
        if (c == 2)
            a.add(n);
        else
            continue;
    }
  System.out.println(a);

        //a.removeRange(0,2);

}}
