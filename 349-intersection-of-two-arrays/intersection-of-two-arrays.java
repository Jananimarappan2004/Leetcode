class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    ArrayList<Integer> list = new ArrayList<>();
    HashSet<Integer> set1 = new HashSet<>();
     HashSet<Integer> set2 = new HashSet<>();
     for(int i=0; i<nums1.length; i++){
        set1.add(nums1[i]);
     }
      for(int j=0; j<nums2.length; j++){
        set2.add(nums2[j]);
     }
     for(int num : set1){
     if(set2.contains(num)){
        list.add(num);
     }
     }
     int arr[] = new int[list.size()];
     for(int i=0; i<list.size(); i++){
        arr[i] = list.get(i);
     }
     return arr;
    }
}