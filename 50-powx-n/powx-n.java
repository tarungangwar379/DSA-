class Solution {
    public double myPow(double x, int n) {
        
        if(n == 0){
            return 1;
        }
        if(n<0){
            return 1/(x*myPow(x,-(n+1)));
        }
       
        double halfPower = myPow(x,n/2); 
        double ans = halfPower*halfPower;
        // for odd
        if(n % 2 != 0){
            ans = x * ans ;
 
        }
        
        return ans;
    
    }
}