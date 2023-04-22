class Solution {
    public int minInsertions(String s) 
    {
        int n = s.length();
        int[] d = new int[n+1];
        int p = 0;
        for (int i = 1; i <= n; i++) 
        {
            p = 0;
            for (int j = 1; j <= n; j++) 
            {
                int temp = d[j];
                if (s.charAt(i - 1) == s.charAt(n - j)) 
                {
                    d[j] = p + 1;
                } 
                else 
                {
                    d[j] = Math.max(d[j],d[j - 1]);
                }
                p = temp;
            }
        }
        return n - d[n];
    }
}