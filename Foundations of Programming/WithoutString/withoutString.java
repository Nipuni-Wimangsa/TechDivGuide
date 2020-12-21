public String withoutString(String base, String remove) {
  String s = base;
  s = s.replace(remove.toLowerCase(), "");
  s = s.replace(remove.toUpperCase(), "");
  s = s.replace(remove, "");
  return s;
}
