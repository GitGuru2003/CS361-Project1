# Project #1: DFA

* Author: Jake Lammers, Munib Ahmed
* Class: CS361 Section # //FIXME
* Semester: Fall 2023

## Overview

This program instantiates and builds a simulation of deterministic finite automata. This includes a String 
representation of the DFA in the form of the five-tuple. The program is tested for functionality using the Junit testing 
framework

## Reflection

This project certainly had its ups and downs. Once I figured out how to implement the set structure correctly
and wrap my head around what the Hashmap does, it became a lot easier to see the project come together. 
The rest of the methods were written easily because they are all mostly getters and setters.

At this point I had some trouble developing the addTransition and swap methods. I had an issue with the addtransition 
method where the return statements were in the wrong spot that took a couple of days to fix, and the swap method still 
feels a bit clunky and unoptimized. toString also gave me a bit of grief with whitespace to pass the tests, but eventually 
that was all ironed out.

I would have started this project earlier ideally. Being the first project of the year I was a bit rusty with my java
programming skills, but with a little effort and luck I quickly resharpened them. This was a good introduction 
back into java for the year, and I'm looking forward to expanding on this project for the NFA project.

## Compiling and Using
To compile Junit on onyx use the following command:

    //COMMAND HERE

To compile program on Onyx use the following command:

    //COMMAND HERE

To run the tests to check functionality use this command:

    //COMMAND HERE

## Sources used

I found an old version of the project on github, this source really helped me figure out how to implement the set and 
hashmap structure.

https://github.com/maddieross/TheoryOfComp-CS361
