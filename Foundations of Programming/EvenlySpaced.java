public boolean evenlySpaced(int a, int b, int c) {
  int[] numbers = {a, b, c};
  
  for(int i = 0; i < 2; i++) {
    for(int j = i+1; j < 3; j++) {
      
      if(numbers[i] > numbers[j]) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
      }
      
    }
  }
  
  if(numbers[1] - numbers[0] == numbers[2] - numbers[1])
    return true;
  else
    return false;
    
}
