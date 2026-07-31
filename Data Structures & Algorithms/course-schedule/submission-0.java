class Solution {
    public boolean canFinish(int n, int[][] pre) {
        List<Integer>[] graph = new ArrayList[n];
        int[] indegree = new int[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        for (int[] p : pre) {
            graph[p[0]].add(p[1]);
            indegree[p[1]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++)
            if (indegree[i] == 0) q.offer(i);

        int count = 0;
        while (!q.isEmpty()) {
            int curr = q.poll();
            count++;
            for (int next : graph[curr])
                if (--indegree[next] == 0) q.offer(next);
        }
        return count == n;
    }
}