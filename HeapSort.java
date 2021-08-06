package SortingAlgorithms;
import java.util.*;
class HeapSort
{
    public void sort(int x[],int lb,int ub)
    {
        // converting to max heap
        int ri,ci,lci,rci,g,swi;
        int y=lb+1;
        while(y<=ub)
        {
            ci=y;
            while(ci>lb)
            {
                ri=(ci-1)/2;
                if(x[ci]>x[ri])
                {
                    g=x[ci];
                    x[ci]=x[ri];
                    x[ri]=g;
                    ci=ri;
                }
                else break;
            }
            y++;
        }
        //implementing heap sort
        y=ub;
        while(y>lb)
        {
            g=x[lb];
            x[lb]=x[y];
            x[y]=g;
            y--;
            ri=lb;
            while(ri<y)
            {
                lci=(ri*2)+1;
                if(lci>y) break;
                rci=lci+1;
                if(rci>y) swi=lci;
                else
                {
                    if(x[lci]>x[rci]) swi=lci;
                    else swi=rci;
                }
                if(x[swi]>x[ri])
                {
                    g=x[swi];
                    x[swi]=x[ri];
                    x[ri]=g;
                    ri=swi;
                }
                else break;
            }
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
        HeapSort hs=new HeapSort();
        hs.sort(array,0,size-1);
        System.out.println("Sorted array is : ");
        for(int j=0;j<size;j++)
        {
            System.out.print(array[j]+" ");
        }
        sc.close();   
    }
}