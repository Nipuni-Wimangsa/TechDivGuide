public String[] encoder(String[] raw, String[] code_words) {
  Map<String, String> map = new HashMap<>();
  String[] s = new String[raw.length];
  
  for(int i = 0; i < raw.length; i++) {
    if(!map.containsKey(raw[i]))
      map.put(raw[i], code_words[i]);
      
    s[i] = map.get(raw[i]);
  }
  
  return s;
}
