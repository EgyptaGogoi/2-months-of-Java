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
    public static void ddisplay(int n){
        int k=n-1;
        for (int a=n; a<=(2*n-1); a++, k--){
            for(int b=1; b<=a; b++){
                if(b>k)
                    System.out.print('*');
                else    
                    System.out.print(' ');
            }
            //k+=2;
            System.out.println();
        }   
    }
     public static void d8display(int n){
        int k=1;
        for (int a=(2*n-1); a>=n; a--,k++){
            for(int b=1; b<=a; b++){
                if(b<k)
                    System.out.print(' ');
                else    
                    System.out.print('*');
            }
            System.out.println();
        }   
    }
    public static void d10display(int a){
        display(1,a,1,'*');
        display('*');
    }
    public static void d11isplay(int n){
        //int c=1;
        for(int i=1; i<=n; i++){
            for(int j=1,c=i; j<=i; j++, c++)
                System.out.printf("%d ",c%2);
            System.out.println();    
        }
    }
    public static void d12isplay(int n){
        int k=2*n,c=1;
        for(int i=1; i<=n; i++,k--){
            for(int j=1; j<=2*n; j++){
                if(j<=i){
                System.out.print(c++);
                }
                else{       
                    if(j<k)
                        System.out.print(' ');
                    else
                        System.out.print(--c);
                }
            }
            System.out.println();
        }
    }
    public static void d21isplay(int n){
        for(int i=1; i<2*n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==(2*n-1))
                    System.out.print('*');
                else if(i%2==0)
                    System.out.print(' ');
                else{
                    if(j==1 || j==n)
                        System.out.print('*');
                    else 
                        System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
    public static void d22isplay(int n){
        for(int i=1; i<2*n; i++)
            System.out.print(n+" ");
        System.out.println();
        for(int i=2,k=2*n-2; i<(2*n-1); i++,k--){
            for(int j=1,c=n; j<2*n; j++){
                
                System.out.print(c+" ");
                if(j<i)    
                    c--;
                if(j>=k){
                    c++;
                }
            }
            System.out.println();
        }
        for(int i=1; i<2*n; i++)
            System.out.print(n+" ");
        System.out.println();
    }
    public static void main(String args[]){
        display(1,5,1,5,'*');
        int x=1;
        display(x,5,1,'*');
        display(x,5,1);
        display(x,5);
        display('*');
        display(5);
        ddisplay(9);
        d8display(9);
        d10display(5);
        d11isplay(5);
        d12isplay(4);
        d21isplay(4);
        d22isplay(4);
    }
}