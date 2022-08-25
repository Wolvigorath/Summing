import java.util.ArrayList;
import java.util.List;

public class Adding
{
    private static List<Integer> Temp = new ArrayList<Integer>();
    private static int count = 0;
    private static int totalSum=0;
    public static void Adder (int numMax, int  mod)
    {
        int mil=1;
        int cent=1;
        int dec=1;
        int sing=1;


        for (int number=1000; number<=numMax; number++ )
        {
            mil = (number - number%1000)/1000;
            cent= ((number - mil*1000)-(number - mil*1000)%100)/100;
            dec = ((number - mil*1000 - cent*100)-(number - mil*1000 - cent*100)%10)/10;
            sing = (number - mil*1000 - cent*100 - dec*10);

            int sum = mil+cent+dec+sing;
            if (sum<=mod)
            {
                //System.out.println(sum);
                //System.out.println("Mil: " + mil +  " Cent " + cent + " Dec: " + dec + " Sing " + sing);
                count++;
                totalSum=totalSum+number;
            }
            if (sum==mod)
            {
                Temp.add (number);
            }
        }
    }

    public int getCount()
    {
        return this.count;
    }

    public int getTotalSum()
    {
        return this.totalSum;
    }

    public int getMin()
    {
        int min=Temp.get(0);
        int n=0;

        for (n=0; n<Temp.size(); n++)
        {
            if (Temp.get(n)<min)
            {
                min=Temp.get(n);
            }
        }

        return min;
    }
}
