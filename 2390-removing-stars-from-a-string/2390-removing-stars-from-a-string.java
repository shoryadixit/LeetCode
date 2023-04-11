// Using stack----

// class Solution {
//     public String removeStars(String s) {
//         Stack<Character> st = new Stack<>();
//         for (int i = 0; i < s.length(); i++) {
//             if(s.charAt(i) == '*') {
//                 st.pop();
//             } else {
//                 st.push(s.charAt(i));
//             }
//         }
//         String ans = "";
//         while (!st.isEmpty()) {
//             char ele = st.pop();
//             ans = ele + ans;
//         }
//         return ans;
//     }
// }


//Using String----

class Solution {
    public String removeStars(String s) {
        int j = 0;
        StringBuilder ans = new StringBuilder();
        for (int i  = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                ans.deleteCharAt(ans.length() - 1);
            } else {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}