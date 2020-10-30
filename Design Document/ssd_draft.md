# Software Design Document Draft

![](Product%20Flyer%201.png)

# Introduction:

Grading a class is not a trivial, well-defined problem. There is no simple algorithmic one-size-fits-all type solution, and professors may have to consider each exam and classroom on a case by case basis. While a spreadsheet offers the best solution to this problem, it can be a cumbersome tool, and any false starts may prove to be time consuming.
Cowculator aims to be a simple, yet flexible tool that fits this use case. We understand that this is essentially a very limited and niche use case, however it is a role that needs to be filled. We do not aim to replace or supplant a spreadsheet or other dedicated tools, instead we aim to supplement and support them.

# User Stories

## Our goals are simple: 
* Use RPN calculator functionality
* Have a stack of arbitrary depth
* Show the last 4 values of the stack
* Store and load lists
* Be easy to use!

## Requirements:
* something something


## Our design philosophy:
* Perform one task, perform it well
* Application must be unobtrusive
* Application should be usable by muscle memory

# Curving:

We offer three curving methods: root, linear, and bell.

## Root curving
The root curve is a simple but powerful way to give students a large push. If we treat a raw score as a fraction out of 100, then take the root curve of it for some $\alpha$, we can improve class scores across the board, whilst `0`'s and `100`'s would remain untouched. We specifically use the formula $100^{1-\alpha}*x^\alpha$ 
For example, given scores of 10, 25, 30, 50, 70, and 90:

$$
\alpha = 0.3\\
10 \rightarrow \approx 50\\
25 \rightarrow \approx 66\\
30 \rightarrow \approx 70\\
50 \rightarrow \approx 81\\
70 \rightarrow \approx 90\\
90 \rightarrow \approx 97\\
\alpha = 0.5\\
10 \rightarrow \approx 32\\
25 \rightarrow \approx 50\\
30 \rightarrow \approx 55\\
50 \rightarrow \approx 71\\
70 \rightarrow \approx 84\\
90 \rightarrow \approx 95\\
\alpha = 0.7\\
10 \rightarrow \approx 20\\
25 \rightarrow \approx 38\\
30 \rightarrow \approx 43\\
50 \rightarrow \approx 62\\
70 \rightarrow \approx 78\\
90 \rightarrow \approx 93\\ 
$$


In Cowculator, the professor must push each score to be curved on the stack. Finally, enter the $0 < \alpha < 1$, and press root. The statistics will be displayed on the screen, and the list will be automatically saved. 

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

# Functionality

# Design
![](P1%20UML%20-%20Class%20Diagram.png)