public String[] fizzBuzz(int start, int end) {
  String[] arr = new String[end-start];
  for(int i=0; i<end-start; i++){
    arr[i] = (start+i) % 15 == 0 ? "FizzBuzz":
    (start+i) % 5 == 0 ? "Buzz" :
    (start+i) % 3 == 0 ? "Fizz" :
    String.valueOf(start+i);
  }
  return arr;
}
