# Software Design Document Draft

# Introduction:

Grading a class is not a trivial, well definied problem. There is no simple algorithmic one-size-fits-all type solution, and professors may have to consider each exam and classroom on a case by case basis. While a spreadhsheet offers the best solution to this problem, it can be a cumbersome tool, and any false starts may prove to be time consuming.
Cowculator aims to be a simple, yet flexible tool that fits this use case. We understand that this is essentially a very limited and niche use case, however it is a role that needs to be filled. We do not aim to replace or supplant a spreadsheet or other dedicated tools, instead we aim to supplement and support them.

## Our goals are simple: 
* Use RPN calculator functionality
* Have a stack of arbitrary depth
* Show the last 4 values of the stack
* Store and load lists
* something something.

## Our design philosophy:
* Perform one task, perform it well
* Application must be unobtrusive
* Application should be usable by muscle memory

# Curving:

We offer three curving methods: root, linear, and bell.

## Root curving
The root curve is a simple but powerful way to give students a large push. If we treat a raw score as a fraction out of 100, then take the root curve of it, we can improve class scores accross the board, while 0's and 100's would remain the same. 
For example, a score of 50 would translate to .50, and then sqrt(.50)~= .71. (note, add more examples)

In Cowculator, the professor must push each score to be curved on the stack. Finally, enter the 0 < alpha < 1, and press root. The statistics will be displayed on the screen, and the list will be automatically saved. 

## Linear curving
A linear curve is simply adding a fixed value to each raw score.
For example, given raw scores of (add more)

## Bell curving
Strictly speaking, our bell curve does not actually change any raw scores. Instead, we compute the standard deviation to help the professor establish grade cutoffs. (give examples, push formula)

# Statistics: 
Cowculator computes and displays several statistics to help the professor in their decision making.
* H: the delta computed of the highest score.
* M: the delta computed of the mean score. Note this doesn't represent any one student, but rather the average.
* L: the delta computed of the lowest score.
* Med: the delta computed of the median score. Note this specifically represents one student, and may not represent the class average.
* Mod: the delta computed of the mode score. This is the most frequently occuring score. Note Cowculator displays a "-1" should no mode exist.

#User stories
As a class instructor or professor, I want to have functions like what regular RPN calcualtor has 
so that I can do some basic arithmetic quickly and manipulate the stack easily. I also want the calculator to be able to 
do some curve operations so that I can quickly enter a list and do some roughly view on statistic datas with different 
curve functions. I hope I can save lists into the calcualtor so that I don't have to rentry a list every times when I 
want to apply different curve functions to it.

#Design
The general design of the calcualtor is to statisfy three major requirement:


###use case
###sequence diagram
###class diagram
###CalculatorForm Class
###List Class
###NormlAlgorithm Class
###Curve Class
###Stack Class

