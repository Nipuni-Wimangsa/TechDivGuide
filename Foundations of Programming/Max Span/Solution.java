public int maxSpan(int[] nums) {
  int span;
  
  if(nums.length == 0){
    span = 0;
  }
  else{
    span = 1;
  }
  
  for(int i = 0; i < nums.length; i++){
    for(int j = i; j < nums.length; j++){
      
      if(nums[i] == nums[j]){
        if(span < j-i+1){
          span = j-i+1;
        }
      }
    }
  }
  
  return span;
}
