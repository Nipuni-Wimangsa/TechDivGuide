public Map<String, String> mapShare(Map<String, String> map) {
  Map<String, String> newMap = new HashMap<>(map);

  if(newMap.containsKey("a")) {
    newMap.put("b", newMap.get("a"));
  }

  newMap.remove("c");

  return newMap;
}
