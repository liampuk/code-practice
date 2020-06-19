public String fizzString(String str) {
  String str2 = "";
  boolean check = false;
  if(str.charAt(0) == 'f'){
    str2+= "Fizz";
    check = true;;
  }
  if(str.charAt(str.length()-1) == 'b'){
    str2+= "Buzz";
    check = true;
  }
  return check ? str2 : str;
}
