public class mularray {
    public static void main(String[] args) {
        int a[][]={{1,1,1},{2,2,2},{3,3,3}};
        int b[][]={{7,1,5},{2,9,2},{6,4,3}};
        int c[][]=new int[3][3];
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    c[i][j]+=a[i][j]*b[i][j];
                    System.out.println(c[i][j]+" ");
                }
                System.out.println("\n ");
            }
        }
    }
}
