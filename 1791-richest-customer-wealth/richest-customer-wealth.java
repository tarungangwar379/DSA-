class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int m = accounts[0].length;
        int sum = 0 , max= 0 ;

        for (int i = 0 ; i<=n-1 ; i++){
            sum = 0 ;
            for (int j = 0 ; j<=m-1;j++){
                
                sum= sum + accounts[i][j];

                
                }
                if(max<sum){
                    max= sum ;

    
            }
        }
        return max;

        
    }
}