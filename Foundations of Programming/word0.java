public Map<String, Integer> word0(String[] strings) {
  Map<String, Integer> map = new HashMap<>();

  for(String item: strings) {
    map.put(item, 0);
  }

  return map;  
}
