class SumSq {
    public static boolean judgeSquareSum(int c) {
        int[] s= new int[(int)Math.sqrt(c)+1];
        int l=0, r=s.length-1;
        for(int i=0; i<s.length; i++){
            s[i]=(i)*(i);
            System.out.print(s[i]+" ");
        }
        while(l<=r){
            if((s[l]+s[r])==c)
                return true;
            else if((s[l]+s[r])>c)
                r-=1;
            else
                l+=1;
        }
        return false;
    }
      public static void main(String args[]){
        // int[] s= new int[5];
        //  System.out.print(s.length);
      System.out.print(judgeSquareSum(2147483600));

    }
}