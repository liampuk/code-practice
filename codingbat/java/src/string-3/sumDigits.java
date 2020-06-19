public int sumDigits(String str) {
   int n = 0;
   for(int i=0; i<str.length(); i++){
     if(Character.isDigit(str.charAt(i))){
       n += Integer.parseInt(str.charAt(i)+"");
     }
   }
   return n;
}
