/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isBST(Node root) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        dfs(root,list);
        for(int i=0; i<list.size()-1; i++){
                if(list.get(i)>list.get(i+1)){
                    return false;
                }
            }
            return true;
        
        
    }
    private void dfs(Node root, ArrayList<Integer> list){
            if(root == null) return;
            dfs(root.left,list);
            list.add(root.data);
            dfs(root.right,list);
            
            
        }
}