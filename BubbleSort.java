package SortingAlgorithm;
import java.util.*;
class BubbleSort
{
    public void bubbleSort(int[] x,int size)
    {
        int e,f,g;
        while(size>=0)
        {
            e=0;
            f=e+1;
            while(e<=size-2)
            {
                if(x[e]>x[f])
                {
                    g=x[e];
                    x[e]=x[f];
                    x[f]=g;
                }
                e++;
                f++;
            }
            size--;
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
        BubbleSort bs=new BubbleSort();
        bs.bubbleSort(array,size);
        System.out.println("Sorted array is : ");
        for(int j=0;j<size;j++)
        {
            System.out.print(" "+array[j]);
        }
        sc.close();
    }
}