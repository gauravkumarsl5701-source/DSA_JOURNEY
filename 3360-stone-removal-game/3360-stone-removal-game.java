class Solution {
    public boolean canAliceWin(int n) {
        int alice=n;
        int bob=n;
        int i=10;
            while(i>0){
                alice=n-i;
                if(alice<0) return false;
                n=alice;
                i--;
                bob=n-i;
                if(bob<0) return true;
                n=bob;
                i--;
            }
            
        
        return false;
    }
}