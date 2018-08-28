class ArraySort
{
    public static void main(String[] args)
    {
        int holder,i,j;
        int[] A=new int[]{1,1,1,1,0,0,1,0};
        for(i=0;i<A.length;i++)
        {
            for(j=i;j<A.length;j++)
            {
                if(A[i]>A[j])
                {
                    holder=A[j];
                    A[j]=A[i];
                    A[i]=holder;
                }
            }
        }
        for(i=0;i<A.length;i++)
        {
            System.out.println(A[i]);
        }
    }
}