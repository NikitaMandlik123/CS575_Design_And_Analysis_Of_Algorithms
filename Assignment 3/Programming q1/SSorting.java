public class SSorting
{
    void selectionSort(int a[])
    {
        int n = a.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min = i;
            for (int j = i+1; j < n; j++)
                if (a[j] < a[min])
                    min = j;

            // Swap the found minimum element with the first
            // element
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }


    
    public static void main(String args[])
    {
        SSorting ob = new SSorting();
        int arr[] = {4,6,8,15,20,22,10,3,9,2};
        ob.selectionSort(arr);
        System.out.println("Sorted array");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
