class Solution {
    public boolean check(int[] n) {
        int c=0;
        for(int i=0 ; i<n.length ; i++){
            if(n[i]>n[(i+1)%n.length])
            c++;
        }
return c<=1;
    }
    
}
