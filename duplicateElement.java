// User function Template for Java
class Solution {

    public int findDuplicate(int arr[]) {
        // Your code goes here
        int n = arr.length;
        int ans = 0;
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++){
           if(arr[i] == arr[i+1]){
               ans = arr[i];
           } 
        }
        return ans;
    }
}    
