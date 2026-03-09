/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/
class Solution {
    
    int getCount(Node root, int low, int high) {
        if(root == null) return 0;
        
        if(root.data >= low && root.data <= high) {
            return 1 + getCount(root.left, low, high) + getCount(root.right, low, high);
        }
        
        if(root.data < low) {
            return getCount(root.right, low, high);
        }
        
        return getCount(root.left, low, high);
    }
}