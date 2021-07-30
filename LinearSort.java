package SortingAlgorithms;

import java.util.*;
class LinearSort
{
    public void linearSort(int[] x,int size)
    {
        int e,f,g;
        e=0;
        while(e<=size-2)
        {
            f=e+1;
            while(f<=size-1)
            {
                if(x[e]>x[f])
                {
                    g=x[e];
                    x[e]=x[f];
                    x[f]=g;
                }
                f++;
            }
            e++;
        }
    }
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter the number : ");
            array[i]=sc.nextInt();
        }
        LinearSort ls=new LinearSort();
        ls.linearSort(array,size);
        System.out.println("Sorted array is : ");
        for(int i=0;i<size;i++)
        {
            System.out.print(array[i]+" ");
        }
        sc.close();
    }
}