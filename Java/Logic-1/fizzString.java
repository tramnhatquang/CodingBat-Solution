public String fizzString(String str) {
  if (str.startsWith("f") && str.endsWith("b"))
    return "FizzBuzz";
  else if (str.startsWith("f"))
    return "Fizz";
  else if (str.endsWith("b"))
    return "Buzz";
  return str;
}
