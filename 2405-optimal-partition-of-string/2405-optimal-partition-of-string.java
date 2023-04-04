// class Solution {
//     public int partitionString(String s) {
//         int[] lastSeen = new int[26];
//         Arrays.fill(lastSeen, -1);
//         int count = 1, substringStart = 0;

//         for (int i = 0; i < s.length(); i++) {
//             if (lastSeen[s.charAt(i) - 'a'] >= substringStart) {
//                 count++;
//                 substringStart = i;
//             }
//             lastSeen[s.charAt(i) - 'a'] = i;
//         }

//         return count;
//     }
// }


class Solution {
  public int partitionString(String s) {
    int ans = 1;
    int usedMask = 0;

    for (final char c : s.toCharArray()) {
      final int i = c - 'a';
      if ((usedMask >> i & 1) == 1) {
        usedMask = 1 << i;
        ++ans;
      } else {
        usedMask |= 1 << i;
      }
    }

    return ans;
  }
}
