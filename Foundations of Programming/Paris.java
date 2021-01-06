public Map<String, String> pairs(String[] strings) {
  Map<String, String> map = new HashMap<>();
  
  for(String s: strings) {
    map.put(Character.toString(s.charAt(0)), Character.toString(s.charAt(s.length()-1)));
  }
  
  return map;
}
