class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        boolean vis[] = new boolean[adj.size()];
        
        for(int i = 0; i < adj.size(); i++){
            if(!vis[i]){
                dfs(list, vis, adj, i);
            }
        }
        return list;
        
    }
    private void dfs(ArrayList<Integer> list,boolean[] vis, ArrayList<ArrayList<Integer>> adj,int src){
        vis[src] = true;
        list.add(src);
        for(int nei : adj.get(src)){
            if(!vis[nei]){
                dfs(list, vis,adj,nei);
            }
        }
    }
}