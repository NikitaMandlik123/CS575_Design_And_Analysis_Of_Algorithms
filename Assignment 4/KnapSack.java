public class KnapSack{
  static int maximum(int a, int b)
    {
        if(a>b)
            return a;
        else return b;
    }
    static int knapSack(int M,int wt[],int value[],int n)
    {
        int i , m;
        int KS[][] = new int[n+1][M+1];
        
        
        for(i=0;i<=n;i++)
            {
                for(m=0;m<=M;m++)
                    {
                        if(i==0||m==0)
                            KS[i][m]=0;
                        else if(wt[i-1]<=m)
                            KS[i][m]= maximum(value[i-1]+KS[i-1][m-wt[i-1]],KS[i-1][m]);
                        else
                            KS[i][m]=KS[i-1][m];
                        
                    }
            }
        return KS[n][M];
    }

    public static void main(String args[])
    {
        int value[] = new int[] { 60,100,120 };
        int wt[]= new int[] { 10,20,30 };
        int M=50;
        int n=value.length;
        
        System.out.println(knapSack(M,wt,value,n));
    }
}
