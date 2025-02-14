class Solution {
    public int firstMissingPositive(int[] nums) {
     Set<Integer>set=new HashSet<>();
     for(int i:nums){
        set.add(i);
     }
     int var=1;
    //  if(set.containskey)
     while(set.contains(var)){
        var++;

     }   return var;
    }
}
