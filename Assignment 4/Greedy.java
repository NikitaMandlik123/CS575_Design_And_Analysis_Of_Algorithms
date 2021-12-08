public class Greedy
{
    static void Minimum(int cost, int[] coins)
    {
        int coin[]=new int[20];
        int i, k = 0;
        int count=0;
      
        for (i = 4 - 1; i >= 0; i--)
        {
            while (cost >= coins[i])
        {
                cost -= coins[i];
                coin[k++] = coins[i];
            }
        }
        
        for (i = 0; i < k; i++)
        {
            count++;
           
        }
        System.out.println(count);
        
        for (i = 0; i < k; i++)
        {
            System.out.println(coin[i]);
        }
    }

    public static void main(String[] args)
    {
        int coins[] = { 1,5,10,25 };
        int n = 99;
          
         System.out.println("The minimal no. of changes for "+n);
 
                Minimum(n,coins);
    }
}
