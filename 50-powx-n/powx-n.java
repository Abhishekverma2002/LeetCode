class Solution {
    public double myPow(double x, double n) {
       if(n==0) return 1.0;
       if(n<0) return 1.0/myPow(x,-1*n);
       if (n%2==1){
           return x*myPow(x*x,(n-1)/2);

       } 
       else{
           return myPow(x*x,n/2);
       }
    }
     public double myPow(double x, int n) {
        return myPow(x, (long) n);
    }
}