# Software Design Document Draft

## Introduction

Grading a class is not a trivial, well definied problem. There is no simple algorithmic one-size-fits-all type solution, and professors may have to consider each exam and classroom on a case by case basis. While a spreadhsheet offers the best solution to this problem, it can be a cumbersome tool, and any false starts may prove to be time consuming.
Cowculator aims to be a simple, yet flexible tool that fits this use case. We understand that this is essentially a very limited and niche use case, however it is a role that needs to be filled. We do not aim to replace or supplant a spreadsheet or other dedicated tools, instead we aim to supplement and support them.

## Our goals are simple

* Use RPN calculator functionality
* Have a stack of arbitrary depth
* Show the last 4 values of the stack
* Store and load lists
* something something.

## Our design philosophy

* Perform one task, perform it well
* Application must be unobtrusive
* Application should be usable by muscle memory

## Curving

We offer three curving methods: root, linear, and bell.

### Root curving

The root curve is a simple but powerful way to give students a large push. If we treat a raw score as a fraction out of 100, then take the root curve of it, we can improve class scores accross the board, while 0's and 100's would remain the same. 
For example, a score of 50 would translate to .50, and then sqrt(.50)~= .71. (note, add more examples)

In Cowculator, the professor must push each score to be curved on the stack. Finally, enter the 0 < alpha < 1, and press root. The statistics will be displayed on the screen, and the list will be automatically saved. 

### Linear curving

A linear curve is simply adding a fixed value to each raw score.
For example, given raw scores of (add more)

### Bell curving

Strictly speaking, our bell curve does not actually change any raw scores. Instead, we compute the standard deviation to help the professor establish grade cutoffs. (give examples, push formula)

## Statistics

Cowculator computes and displays several statistics to help the professor in their decision making.
* `H`: the delta computed of the highest score.
* `M`: the delta computed of the mean score. Note this doesn't represent any one student, but rather the average.
* `L`: the delta computed of the lowest score.
* `Med`: the delta computed of the median score. Note this specifically represents one student, and may not represent the class average.
* `Mod`: the delta computed of the mode score. This is the most frequently occuring score. Note Cowculator displays a "-1" should no mode exist.

## UI and Keyboard

The UI has four parts (a border layout), including screen, list/statistic info, keyborad and list storage button. They are in a box layout in x axis.

### Info exhibiting

Screen:
```
T: 0.000
S: 0.000
Y: 0.000
X: 0.000
```
List/statistic info:
```
Stack Size: 0
````
List Storage: upper left coner button, user could choose any history list.

### Keyboard

Basically, A 5*5 grid layout design. For containing more buttons, we also add 1*2 little grid layout on one unit of 5*5.
* Curving operation: `root` is root curving. `lin` is linear curving. `bell` is bell curving.
* Arithmetic operation: <br/>
    logarithm: `+`, `-`, `*`, `\` , `.`, `Log` and `Ln`(natural logrithm)<br/>
    square: `x^2`<br/>
    cube:`x^3`<br/>
    square root: `SQRT`<br/>
    Euler's number: `E`<br/>
    Y^X: `Y^X` (enter a number `Y` first, click the `ENT`, and then enter the `X`)<br/>
* Enter, view and edit the history:<br/>
    `ENT` : enter the number<br/>
    `Roll` : view the history<br/>
    `POP` : pop the last one number entered<br/>
    `<-` : remove one digit when entering, remove whole number when viewing<br/>
    `X<->Y` : exchange the `X` and `Y`<br/>
    `Fix` : decimal places (one, two or three)<br/>
    `CLR` : remove all the data and reset the screen


