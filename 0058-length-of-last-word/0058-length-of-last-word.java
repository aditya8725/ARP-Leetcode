class Solution {
    public int lengthOfLastWord(String s) 
    {
          int c=0;
          String str=s.trim();
          for(int i=str.length()-1;i>=0;i--)
          {
            if(str.charAt(i)==' ')
            {
                break;
            }        
            else
            {
                c++;
            }
           }
    return c; 
    }
}
