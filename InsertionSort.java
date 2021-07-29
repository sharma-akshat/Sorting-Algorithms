package SortingAlgorithms;


import java.util.*;
class InsertionSort
{
    public void insertionSort(int[] x)
    {
        int y,z,num;
        y=1;
        while(y<x.length)
        {
            num=x[y];
            z=y-1;
            while(z>=0 && x[z]>num)
            {
                x[z+1]=x[z];
                z--;
            }
            x[z+1]=num;
            y++;
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
            System.out.print("Enter the element : ");
            array[i]=sc.nextInt();
        }
        InsertionSort is=new InsertionSort();
        is.insertionSort(array);
        System.out.println("Sorted array is : ");
        for(int j=0;j<size;j++)
        {
            System.out.print(array[j]+" ");
        }
        sc.close();
    }
}