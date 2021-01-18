package leetcode.heap;

public class _692_TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> count = new HashMap<>();
        PriorityQueue<String> pq = new PriorityQueue<String>(
                (w1, w2) -> count.get(w1).equals(count.get(w2)) ?
                w2.compareTo(w1) : count.get(w1) - count.get(w2) );
        List<String> result = new LinkedList<>();
        for(String s : words) {
            count.put(s, count.getOrDefault(s,0) + 1);
        }
        for(String s: count.keySet()) {
            pq.offer(s);
            if(pq.size()>k) {
                pq.poll();
            }
        }
        while(!pq.isEmpty()) {
            result.add(pq.poll());
        }
        Collections.reverse(result);
        return result;
    }
}
