class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
     for(int i:nums){
        if(map.containsKey(i)){
            int count=map.get(i);
            map.put(i,count+1);
        }else{
        map.put(i,1);
     }
     }
     List<Integer>duplicates=new ArrayList<>();
     for(int i:map.keySet()){
        if(map.get(i)==2){
            duplicates.add(i);
        }
     }
     return duplicates;

    }
}
