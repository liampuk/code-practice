public boolean nestParen(String str) {
  if(str.length() >= 2 && str.charAt(0) == '(' && str.charAt(str.length()-1) == ')'){
    return nestParen(str.substring(1, str.length()-1));
  }
  if(str.length() == 0) return true;
  return false;
}
