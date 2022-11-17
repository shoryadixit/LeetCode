class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<nums1.length && j< nums2.length)
        {
            if(nums1[i]==nums2[j] && nums1[i]!=-1 && nums2[j]!=-1){
                list.add(nums1[i]);
             nums1[i] =-1;
                nums2[j]=-1;
            }
            else if(nums1[i]> nums2[j])
                j++;
            else
                i++;
        }
        
        int[] arr=new int[list.size()];
        for(int k=0;k<list.size();k++)
        {
            arr[k]=list.get(k);
        }
        
        return arr;
    }
}