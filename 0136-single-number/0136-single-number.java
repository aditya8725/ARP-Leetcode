class Solution 
{
    public int singleNumber(int[] n) 
    {
        int ans=0;
        for(int i=0; i<n.length; i++)
        {
            ans =ans^n[i];
        }
        return ans;    
    }
}