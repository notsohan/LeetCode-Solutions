class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(edges.length==0) return true;
        Map<Integer, List<Integer>> g = new HashMap<>();
        for (int i=0; i<n; i++) {
            g.put(i, new ArrayList<Integer>());
        }
        for (int i=0; i<edges.length; i++) {
            int v1 = edges[i][0];
            int v2 = edges[i][1];
            g.get(v1).add(v2);
            g.get(v2).add(v1);
        }
        boolean vis[]=new boolean[n];
        vis[source]=true;
        Queue<Integer> q=new LinkedList<>();
        q.offer(source);
        
        while(!q.isEmpty()){
            int curr=q.poll();
            if(curr==destination) return true;
            for(int nextNode: g.get(curr)){
                if(!vis[nextNode]){
                    vis[nextNode]=true;
                    q.offer(nextNode);
                }
            }   
        }
        return false;
    }
}