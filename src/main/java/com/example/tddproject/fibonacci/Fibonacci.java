package com.example.tddproject.fibonacci;

public class Fibonacci {


  public static int fib(int n) {
    //return 0;
    /*
    if(n == 0 ) return 0;
    return 1;
     */
    if (n == 0) {
      return 0;
    }
    /*
    if (n <= 2) {
      return 1;
    }
     */
    if (n == 1) {
      return 1;
    }
    //return 2;
    //return 1 + 1; //첫번쨰 1은 fib(n-1)
    //return fib(n-1) + 1;//두번쨰 1은 fib(n-2)
    return fib(n - 1) + fib(n - 2); //동일한 구조가 fib(2)에서도 적용이 되기 떄문에 n이 2일때 == fib(2) = 0 + 1 = 1 => n == 1 로 변경 가능
  }
}
