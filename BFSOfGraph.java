class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        
        ArrayList<Integer> list = new ArrayList<>();
        boolean vis[] = new boolean[adj.size()];
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0);
        vis[0] = true;
        
        while(!q.isEmpty()){
            int node = q.poll();
            list.add(node);
            
            for(int nei : adj.get(node)){
                if(!vis[nei]){
                    vis[nei] = true;
                    q.add(nei);
                }
            }
        }
        
        return list;
    }
}