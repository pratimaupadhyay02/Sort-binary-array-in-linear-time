class SortBinaryArray
{
    // Function to sort binary array in linear time
    public static void Sort(int A[], int n)
    {
        // count number of 0's
        int zeros = 0;
        for (int i = 0; i < n; i++)
            if (A[i] == 0)
                zeros++;
     
        // put 0's in the beginning
        int k = 0;
        while (zeros-- != 0)
            A[k++] = 0;
     
        // fill all remaining elements by 1
        while (k < n)
            A[k++] = 1;
    }
 
    // main function
    public static void main (String[] args)
    {
        int A[] = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };
        int n = A.length;
 
        Sort(A, n);
 
        // print the rearranged array
        for (int i = 0 ; i < n; i++)
            System.out.print(A[i] + " ");
    }
}

Download   Run Code



