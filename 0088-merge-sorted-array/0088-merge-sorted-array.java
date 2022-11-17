class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int[] n1 = Arrays.copyOf(nums1, m);
        // int i = 0, j = 0, a = 0;
        // for(i = 0; a < m && j < n; i++)
        // {
        //     if(n1[a] < nums2[j])
        //         nums1[i] = n1[a++];
        //     else
        //         nums1[i] = nums2[j++];
        // }
        // while(a < m) 
        //     nums1[i++] = n1[a++];
        // while(j<n)
        //     nums1[i++] = nums2[j++];
        
        int p1 = m - 1; 
        int p2 = n - 1;
        int i = m + n - 1;
        while(p2 >= 0){
            if(p1 >= 0 && nums1[p1] > nums2[p2])
                nums1[i--] = nums1[p1--];
            else
                nums1[i--] = nums2[p2--];
        }
        
//         for(int i=0; i<n; i++)
//             nums1[m+i] = nums2[i];
//         Arrays.sort(nums1);

    }
}