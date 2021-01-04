public boolean canBalance(int[] nums) {
  for(int i = 0; i < nums.length; i++) {
    if(sum(nums,0,i) == sum(nums,i+1, nums.length - 1))
      return true;
  }
  
  return false;
}

private int sum(int[] nums, int beginIndex, int endIndex) {
  int sum = 0;
  
  for(int i = beginIndex; i <= endIndex; i++) {
    sum += nums[i];
  }
  
  return sum;
}
