public Map<String, Integer> wordLen(String[] strings) {
   Map<String, Integer> map = new HashMap<>();

   for(String item: strings) {
      map.put(item, item.length());
   }

   return map;
}
