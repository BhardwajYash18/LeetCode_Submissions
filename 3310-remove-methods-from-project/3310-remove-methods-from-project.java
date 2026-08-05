class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<Integer>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : invocations) {
            graph[edge[0]].add(edge[1]);
        }

        boolean[] bugged = new boolean[n];

        Queue<Integer> q = new ArrayDeque<>();
        q.offer(k);
        bugged[k] = true;

        while (!q.isEmpty()) {
            int u = q.poll();

            for (int v : graph[u]) {
                if (!bugged[v]) {
                    bugged[v] = true;
                    q.offer(v);
                }
            }
        }

        for (int[] edge : invocations) {
            int u = edge[0];
            int v = edge[1];

            if (!bugged[u] && bugged[v]) {
                List<Integer> ans = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    ans.add(i);
                }
                return ans;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!bugged[i]) {
                ans.add(i);
            }
        }

        return ans;
    }
}