public boolean makeBricks(int small, int big, int goal) {
  int bigBricksNeeded = goal/5;
  
  if(bigBricksNeeded > big)
    bigBricksNeeded = big;
            
  int smallBricksNeeded = goal - bigBricksNeeded*5;
        
        
        if(big >= bigBricksNeeded && smallBricksNeeded <= small)
            return true;
        else
            return false;
}
