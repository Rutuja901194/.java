

class Shared 
{
    void table(int n)
    {
        System.out.println("Table");
        for(int i=1;i<0;i++)
        System.out.println(" "+(n*i));
    }
}
class Sync extends Thread
{
    Shared obj;
    int n;
    Sync(Shared obj,int no)
    {
        super();
        this.obj=obj;
        n=no;
        start();
    }
    public void run()
    {
        synchronized(obj)
        {
            obj.table(n);
        }
    }
}

public class Thrd3
{
    public static void main(String[] args) 
    {
        Shared s=new Shared();
        Sync a=new Sync(s,5);
        Sync b=new Sync(s,4);
        try
        {
          a.join();
          b.join();
        }
        catch(Exception e){}
    }
}