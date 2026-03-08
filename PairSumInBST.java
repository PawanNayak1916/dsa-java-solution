/*
class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}
*/
class Solution {
    HashSet<Integer> set = new HashSet<>();
    boolean findTarget(Node root, int target) {
        // Write your code here
        set.clear();
        return dfs(root,target); }
    private boolean dfs(Node root, int target){
      
        if(root == null) return false;
        if(set.contains(target - root.data)){
            return true;
        }
        set.add(root.data);
        return dfs(root.left,target) || dfs(root.right,target);
    }
}