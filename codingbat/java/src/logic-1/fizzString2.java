public String fizzString2(int n) {
  String str = "";
  boolean check = false;
  if(n%3 == 0){
    check = true;
    str+= "Fizz";
  }
  if(n%5 == 0){
    check = true;
    str+= "Buzz";
  }
  return check ? str +"!" : n+"!";
}
