class Solution {
    public String reverseWords(String s) {
        String[] result = (s.trim()).split(" ");
        StringBuilder str = new StringBuilder();
        
        for(int i=result.length-1;i>=0;i--) {
            if(!result[i].isBlank())
            {
               str.append(result[i]+" "); 
            }
        }
        return str.toString().trim();
    }
}