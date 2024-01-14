#! /usr/bin/env python
#A miniPython example

def fib():    # write Fibonacci series up to n
               a = 0
               b = 1
               while a < 13:
                        print a
                        a = b
                        b = a + b
