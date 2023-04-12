public class setB {
    public static void main(String []ags)
    {
        int arr[]={1,2,3,4,5,6,7};
        int k=7,l=4;
        int n=k-l;
        for(int i=0;i<n;i++)
        {  
            int temp=arr[6];
            for(int j=6;j>0;j--)
            {
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        for(int i=0;i<7;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
