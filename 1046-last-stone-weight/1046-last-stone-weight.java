class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < stones.length; i++) {
            maxHeap.add(stones[i]);
        }
        int x;
        int y;
        while (maxHeap.size() > 1) {
            y = maxHeap.poll();
            
            x = maxHeap.poll();            
            if (y > x) {
                maxHeap.add(y - x);
            }
        }
        
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}