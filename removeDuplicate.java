class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                al.add(arr[i]);
            }
            
        }
        return al;
    }
}
