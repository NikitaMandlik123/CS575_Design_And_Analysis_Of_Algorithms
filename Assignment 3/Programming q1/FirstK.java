import java.util.Scanner;  // Import the Scanner class
public class FirstK {
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
        FirstK ob = new FirstK();
        int arr[] = {4,6,8,15,20,22,10,3,9,2};
        ob.selectionSort(arr);
        int n = arr.length;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the K :");
        int userK = myObj.nextInt();  // Read user input

        for (int i=0; i<userK; ++i)
            System.out.print(arr[i]+" ");
            System.out.println();

    }
}
