class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest = -1;
        int Slargest = -1;
        for(int i =0; i<arr.length; i++){
            if(arr[i]>largest){
                Slargest = largest;
                largest = arr[i];
            }
            if(arr[i]<largest && arr[i]>Slargest){
                Slargest = arr[i];
            }
            
        }
        return Slargest;
    }
}