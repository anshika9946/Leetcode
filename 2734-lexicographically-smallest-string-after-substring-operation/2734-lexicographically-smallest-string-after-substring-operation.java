class Solution {
    public String smallestString(String s) {
        
       char c[] = s.toCharArray();
    int start = 0, end = 0;
    
    for (int i=0; i < c.length; i++, end++)
      {  
      if (c[i] == 'a')
      {
        if (start == end)
            {
            start++;
        }
        else{ 
            break;
        }
    }
    }
    if (start == end) start--;
    
    for (int i = start; i < end; i++)
     { if (c[i] == 'a')
         {
         c[i] = 'z';
         }
      else 
          {
          c[i]--;
      }
    }
    return new String(c);
    }
}