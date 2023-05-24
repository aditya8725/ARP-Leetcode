public class Solution {
    public String convert(String s, int numRows) 
    {
        if (numRows == 1) 
        {
            return s;
        }
        StringBuilder result = new StringBuilder();
        int n = s.length();
        int cLen = 2 * numRows - 2;
        for (int i = 0; i < numRows; i++) 
        {
            for (int j = 0; j + i < n; j += cLen) 
            {
                result.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cLen - i < n) 
                {
                    result.append(s.charAt(j + cLen - i));
                }
            }
        }
        return result.toString();
    }
}