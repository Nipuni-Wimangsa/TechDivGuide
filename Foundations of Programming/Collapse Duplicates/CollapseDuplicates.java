public String collapseDuplicates(String a) {
  int i = 0;
  String result = "";
  
  while(i < a.length()) {
    char ch = a.charAt(i);
    result += ch;
    
    while(a.length()-1 > i && a.charAt(i+1) == ch) {
      i++;
    }
    
    i++;
  
  }
  
  return result;
}
