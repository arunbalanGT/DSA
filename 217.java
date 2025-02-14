class Solution {
    public boolean containsDuplicate(int[] nums) {
     Set<Integer> set=new HashSet<>();
     for(int i:nums){
        set.add(i);
     }   
     if(nums.length==set.size()){
        return false;
     }else{
        return true;
     }
    }
}
