package SortingAlgorithms;
import java.util.*;
class QuickSort
{
    public int partitionPoint(int x[],int lb,int ub)
    {
        int e=lb;
        int f=ub;
        int g=0;
        while(e<f)
        {
            while(e<ub && x[e]<=x[lb])
            {
                e=e+1;
            }
            while(x[f]>x[lb])
            {
                f=f-1;
            }
            if(e<f)
            {
                g=x[e];
                x[e]=x[f];
                x[f]=g;
            }
            else
            {
                g=x[lb];
                x[lb]=x[f];
                x[f]=g;
            }
        }
        return f;
    }
    public void sort(int[] array,int lb,int ub)
    {
        if(lb<ub)
        {
            int pp=partitionPoint(array,lb,ub);
            sort(array,lb,pp-1);
            sort(array,pp+1,ub);
        }
    }
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size=sc.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter the element: ");
            array[i]=sc.nextInt();
        }
        QuickSort qs=new QuickSort();
        qs.sort(array,0,size-1);
        System.out.println("Sorted array is : ");
        for(int j=0;j<size;j++)
        {
            System.out.print(array[j]+" ");
        }
        sc.close();      
    }
}