class Solution {
    public int trap(int[] a) {
        int l =0;
        int r =a.length-1;
        int lm=0;
        int rm=0;
        int ans=0;
        while(l<r){
            if(lm<a[l])lm=a[l];
            if(rm<a[r])rm=a[r];
            if(rm>lm){
                ans+=Math.max(0,lm-a[l]);
                l++;
            }
            else{
                ans+=Math.max(0,rm-a[r]);
                r--;
            }
        }
        return ans;
        
    }
}