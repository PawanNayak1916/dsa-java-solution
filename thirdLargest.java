class Solution {
    int thirdLargest(int arr[]) {
        // code here
        int largest = -1;
        int Slargest = -1;
        int Tlargest = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                Tlargest = Slargest;
                Slargest = largest;
                largest = arr[i];
            }
            else if(arr[i]>Slargest){
                Tlargest = Slargest;
                Slargest = arr[i];
            }
            else if(arr[i]>Tlargest){
                Tlargest = arr[i];
            }
        }
        
        return Tlargest;
    }
}