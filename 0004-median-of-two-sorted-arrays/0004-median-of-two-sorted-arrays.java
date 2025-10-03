class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> lst = new ArrayList<>();

        for(int i:nums1){
            lst.add(i);
        }
        for(int i:nums2){
            lst.add(i);
        }
        Collections.sort(lst);

        double a = 0.00000;
        if(lst.size()%2==0){
            a = lst.get(lst.size()/2) + lst.get(lst.size()/2-1); 
            a/=2;
        }
        else{
            a = lst.get(lst.size()/2);
        }
        return a;
    }
}