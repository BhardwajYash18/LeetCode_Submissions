class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<Integer>[] edges = new ArrayList[n];
        for (int i = 0 ; i < n ; i++) {
            edges[i] = new ArrayList<>();
        }
        int[] incoming = new int[n];
        boolean[] isCorrupt = new boolean[n];
        isCorrupt[k] = true;
        for (int[] arr : invocations) {
            edges[arr[0]].add(arr[1]);
            incoming[arr[1]]++;
        }

        Queue<Integer> q = new ArrayDeque<>();
        q.offer(k);
        while (!q.isEmpty()) {
            int num = q.poll();
            for (int v : edges[num]) {
                incoming[v]--;

                if (!isCorrupt[v]) {
                    q.offer(v);
                    isCorrupt[v] = true;
                }
            }
        }

        boolean remAll = true;
        List<Integer> remain = new ArrayList<>();

        for (int i = 0 ; i < n ; i++) {
            if (isCorrupt[i] && incoming[i] > 0) {
                remAll = false;
                break;
            }
            else if (!isCorrupt[i]) {
                remain.add(i);
            }
        }
        if (!remAll) {
            List<Integer> all_nodes = new ArrayList<>(n);
            for (int i = 0 ; i < n ; i++) {
                all_nodes.add(i);
            }
            return all_nodes;
        }

        return remain;
    }
}