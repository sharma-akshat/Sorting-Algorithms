package SortingAlgorithms;

import java.util.*;
class SelectionSort
{
    public void selectionSort(int[] x,int size)
    {
        int e,f,g,si;
        e=0;
        while(e<=size-2)
        {
            si=e;
            f=e+1;
            while(f<=size-1)
            {
                if(x[si]>x[f]) si=f;
                f++;
            }
            g=x[si];
            x[si]=x[e];
            x[e]=g;
            e++;
        }
    }
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size=sc.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter the element: ");
            array[i]=sc.nextInt();
        }
        SelectionSort ss=new SelectionSort();
        ss.selectionSort(array,size);
        System.out.println("Sorted array is : ");
        for(int j=0;j<size;j++)
        {
            System.out.print(" "+array[j]);
        }
        sc.close();
    }
}