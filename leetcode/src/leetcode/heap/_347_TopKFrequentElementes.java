package leetcode.heap;

public class _347_TopKFrequentElementes {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, (a,b)->{ return map.get(a) - map.get(b); });
        for(int i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int n: map.keySet()) {
          pq.add(n);
          if (pq.size() > k) pq.poll();    
        }
        int[] top = new int[k];
        for(int i = k - 1; i >= 0; --i) {
            top[i] = pq.poll();
        }
        return top;
    }
}
