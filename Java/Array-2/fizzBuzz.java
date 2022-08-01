public String[] fizzBuzz(int start, int end) {
  int len = end- start;
  String[] arr = new String[len];
  
  for (int i = 0; i < len; i++, start++)
  {
    if (start % 15 == 0)
      arr[i] = "FizzBuzz";
    else if (start % 5 == 0)
      arr[i] = "Buzz";
    else if (start % 3 == 0)
      arr[i] = "Fizz";
    else
      arr[i] = String.valueOf(start);
  }
  return arr;
}
