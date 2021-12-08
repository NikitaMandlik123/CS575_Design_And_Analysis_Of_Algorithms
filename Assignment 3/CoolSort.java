import java.util.Scanner;

public class CoolSort {

    void coolSort(int arr[], int p, int h[], int l){
        int i, key, j;
        for(int k=0; k<l; k++){
            for(int m=0; m<p; m++)
                for(i=m; i<p; i=i+h[k]){
                    key = arr[i];
                    j = i-h[k];
                    while(j>=0 && arr[j]>key){
                        arr[j+h[k]] = arr[j];
                        j=j-h[k];
                    }
                    arr[j+h[k]] = key;
                }
        }
    }

    public static void main(String args[]){
        int p,l;
        CoolSort ob = new CoolSort();

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter the number of array elements:");
        p = myObj.nextInt();

        int arr[] = new int[p];

        System.out.println("Enter the array elements:");

        for(int i=0; i<p; i++){
            int r= myObj.nextInt();
            arr[i]=r;
        }

        System.out.println("Enter the number of elements of H array(steps)");
        l= myObj.nextInt();


        int h[] = new int[l];

        System.out.println("Enter the array elements of h:");
        for(int i=0; i<l; i++){

            int o = myObj.nextInt();
            h[i]=o;
        }

        ob.coolSort(arr, p, h, l);
        System.out.println("Sorted array :");
        for (int i = 0; i < p; i++){
            System.out.print(arr[i]+" ");
            System.out.println();
        }

    }
}
