public class FindTheMean {
    void selectionSort(int a[])
    {
        int n = a.length;

        
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (a[j] < a[min_idx])
                    min_idx = j;

            
            int temp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;
        }
    }

    public static double findMedian(int arr[], int n)
    {
          if (n % 2 != 0)
            return (double)arr[n / 2];

        return (double)(arr[(n - 1) / 2] + arr[n / 2]) / 2.0;
    }

    // Driver code to test above
    public static void main(String args[])
    {
        FindTheMean ob = new FindTheMean();
        int arr[] = {4,6,8,15,20,22,10,3,9};
        ob.selectionSort(arr);
        System.out.println("Sorted array");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
        System.out.println("Median = " + findMedian(arr, n));
}
}
