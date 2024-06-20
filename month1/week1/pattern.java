public class pattern{
    public static void display(int i, int ii, int j, int jj,  char p){
        //pattern 1
        for(int a=i; a<=ii; a++)
        {
            for(int b=j; b<=jj; b++)
                System.out.print(p);
            System.out.println();
        }
    }
    public static void display(int i, int ii, int j, char p){
        //pattern 2
        for(int a=i; a<=ii; a++)
        {
            for(int b=j; b<=a; b++)
                System.out.print(p);
            System.out.println();
        }    
    }
     public static void display(int i, int ii, int j){
        //pattern 3
        for(int a=i; a<=ii; a++)
        {
            for(int b=j; b<=a; b++)
                System.out.print(b);
            System.out.println();
        }    
    }
       public static void display(int i, int ii){
        //pattern 4
        for(int a=i; a<=ii; a++)
        {
            for(int b=1; b<=a; b++)
                System.out.print(a);
            System.out.println();
        }   
    }
    public static void display(char p)
    {
        for(int a=5; a>=1; a--)
        {
            for(int b=a; b>=1; b--)
                System.out.print(p);
            System.out.println();
        }   
    } 
    public static void display(int p)
    {
        for(int a=p; a>=1; a--)
        {
            for(int b=1; b<=a; b++)
                System.out.print(b);
            System.out.println();
        }   
    }
    
    public static void main(String args[]){
        display(1,5,1,5,'*');
        int x=1;
        display(x,5,1,'*');
        display(x,5,1);
        display(x,5);
        display('*');
        display(5);

    }
}