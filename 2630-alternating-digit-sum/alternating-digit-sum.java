class Solution {
    public int alternateDigitSum(int n) {
        int digits = String.valueOf(n).length();

        int sum = 0;
        while(n>0){
        int digit = n % 10;
        if(digits % 2 == 0){
            sum -= digit;
        }else{
            sum +=digit;
        }
        digits--;
        n/=10;
        }
        return sum;

    }
}