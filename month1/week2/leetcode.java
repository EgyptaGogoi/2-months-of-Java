import java.util.Arrays;

public class leetcode {
    public static void main(String [] args){

        String s = "Aabb";

        char a[]= s.toCharArray();
        Arrays.sort(a);
        int k=a.length,count=1,mov=0,i;
        int n=1;
        for(i=0;i<k-1;i++)
        {
             if(a[i]!=a[i+1])
                n++;
        }
        //System.out.println(n);
        int fr[]=new int[n];
        char ch[]=new char[n];
        mov=0;
        for(i=0;i<k-1;i++){
            if(a[i]==a[i+1]){
                fr[mov]=++count;
                ch[mov]=a[i];
            } 
            else
            {
                mov++;
                fr[mov]=1;
                ch[mov] = a[i+1]; // added
                count=1;
            }
                
        }

        // for( int w = 0 ; w < 3; w ++){
        //     System.out.println(ch[w]);
        // }
        int j;
        for(i=0; i<n-1; i++)
        {
            for(j=0; j< n - i -1; j++)
            {
                if(fr[j]<fr[j+1]){
                    int t=fr[j+1];
                    fr[j+1]=fr[j];
                    fr[j]=t;
                    char temp=ch[j+1];
                    ch[j+1]=ch[j];
                    ch[j]=temp;
                }
            }
        }

        int v = 0;
        for( i = 0 ; i < ch.length; i++){
            for( j = 0; j < fr[i]; j++)
                a[v++] = ch[i];
        }

        s = new String(ch);

        System.out.println(s);

        // for( int w = 0 ; w < 3; w ++){
        //     System.out.println(ch[w]);
        // }

        // for(int w = 0; w < )
        // int c=0;
        // i=0;
        // while(c<n){
        //     for(j=1;j<=fr[c];j++){
        //             a[i]=ch[c];
        //             i++;
        //     }
        //     c++;
        // }

        // s = new String(a);
        // return s;
        // System.out.println(s);

        // /////////////

        // String s = "Aabb";

        // char []ch = s.toCharArray();
        // Arrays.sort(ch);

        // int size = 1;
        // for( int i = 0; i < ch.length-1; i++)
        //     if(ch[i] != ch[i+1])
        //         ++size;

        // int [] frequency = new int[size];
        // char [] distChar = new char[size];
        
        // frequency[0] = 1;
        // distChar[0] = ch[0];

        // for( int i = 0, j = 0; i < ch.length-1 ; i++){
        //     if(ch[i] == ch[i+1]){
        //         frequency[j] += 1;
        //         continue;
        //     }
        //     frequency[++j] += 1;
        //     distChar[j] = ch[i+1];
        // }

        // for(int i = 0; i < size; i++){
        //     System.out.print(distChar[i] + " " + frequency[i] + "\n");
        // }
        // System.out.println();

        // int tempVar;
        // char tempChar;
        // for( int i = 0; i < size-1; i++){
        //     for( int j = 0; j < size - i - 1; j++ ){
        //         if(frequency[j] < frequency[j+1]){

        //             // swap for frequency
        //             tempVar = frequency[j];
        //             frequency[j] = frequency[j+1];
        //             frequency[j+1] = tempVar;
                    
        //             // swap for chachr
        //             tempChar = distChar[j];
        //             distChar[j] = distChar[j+1];
        //             distChar[j+1] = tempChar;
        //         }
        //     }
        // }

        // for(int i = 0; i < size; i++){
        //     System.out.print(distChar[i] + " " + frequency[i] + "\n");
        // }

        // int k = 0;
        // for( int i = 0 ; i < size; i++){
        //     for( int j = 0; j < frequency[i]; j++)
        //         ch[k++] = distChar[i];
        // }

        // s = new String(ch);

        // System.out.println(s);


    }
}
