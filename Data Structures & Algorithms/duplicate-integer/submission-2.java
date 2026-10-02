class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> ans = new TreeSet<>();
        for(int num:nums){
            ans.add(num);
        }
        int k = ans.size();
        if(k!=n)return true;
        else return false;
        
    }
}