class Solution {
    public int[] countBits(int n) {
        
        int a[]=new int[n+1];
        int f=0;
        for(int i=0;i<n+1;i++)
        {f=i;int c=0;
            while(f!=0)
            {
                f=f&(f-1);
                c++;
            }
         a[i]=c;
        }
        return a;
    }
}