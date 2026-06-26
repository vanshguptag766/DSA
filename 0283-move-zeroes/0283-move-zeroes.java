class Solution {
    public void moveZeroes(int[] arr) {
        int ind = 0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]!=0)   arr[ind++] = arr[i];
        
    }
    while(ind<arr.length)   arr[ind++] = 0;
    }
}