package SortingAlgorithms;
import java.util.*;
class MergeSort
{
    public void merge(long[] arr,int lb,int mid,int ub)
    {
        int size=(ub-lb)+1;
        long temp[]=new long[size];
        int lb1,ub1,lb2,ub2,lb3,ub3,i1,i2,i3;
        lb1=lb;
        ub1=mid;
        lb2=mid+1;
        ub2=ub;
        lb3=0;
        ub3=size-1;
        i1=lb1;
        i2=lb2;
        i3=lb3;
        while(i1<=ub1 && i2<=ub2)
        {
            if(arr[i1]<arr[i2] && i3<=ub3)
            {
                temp[i3]=arr[i1];
                i1++;
                i3++;
            }
            else
            {
                temp[i3]=arr[i2];
                i2++;
                i3++;
            }
        }
        while(i1<=ub1 && i3<=ub3)
        {
            temp[i3]=arr[i1];
            i1++;
            i3++;
        }
        while(i2<=ub2 && i3<=ub3)
        {
            temp[i3]=arr[i2];
            i2++;
            i3++;
        }
        i1=lb1;
        i3=0;
        while(i1<=ub)
        {
            arr[i1]=temp[i3];
            i1++;
            i3++;
        }

    }
    public void sort(long[] arr,int lb,int ub)
    {
        int mid;
        if(lb<ub)
        {
            mid=(lb+ub)/2;
            sort(arr,lb,mid);
            sort(arr,mid+1,ub);
            merge(arr,lb,mid,ub);
        }
    }
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=sc.nextInt();
        long array[]=new long[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter the element : ");
            array[i]=sc.nextLong();
        }
        int lb=0;
        int ub=size-1;
        MergeSort ms=new MergeSort();
        ms.sort(array,lb,ub);
        System.out.println("Sorted array : ");
        for(int i=0;i<size;i++)
        {
            System.out.print(array[i]+" ");
        }
        sc.close();
    }
}