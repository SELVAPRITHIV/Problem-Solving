class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int arr[] = new int[size];

        arr[0] = 1;
        for(int i=1;i<size;i++){
            arr[i] = arr[i-1]*nums[i-1];
        }

        int last = 1;
        for(int i=size-1;i>=0;i--){
            arr[i] = arr[i]*last;
            last *= nums[i];
        }
        return arr;
    }
}