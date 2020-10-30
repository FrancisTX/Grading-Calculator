# Software Design Document Draft

![](Product%20Flyer%201.png)

# Introduction:

Grading a class is not a trivial, well-defined problem. There is no simple algorithmic one-size-fits-all type solution, and professors may have to consider each exam and classroom on a case by case basis. While a spreadsheet offers the best solution to this problem, it can be a cumbersome tool, and any false starts may prove to be time consuming.
Cowculator aims to be a simple, yet flexible tool that fits this use case. We understand that this is essentially a very limited and niche use case, however it is a role that needs to be filled. We do not aim to replace or supplant a spreadsheet or other dedicated tools, instead we aim to supplement and support them.

# User Stories

## Requirements and goals:
* Use RPN calculator functionality
* Have a stack of arbitrary depth
* Show the last 4 values of the stack
* Store and load lists
* Offer multiple choices for curving
* Manipulate stack by pushing, popping and rolling
* Be easy to use!


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

Note: should the professor enter an invalid $\alpha$, all statistics will be displayed as `-1`.

## Linear curving
A linear curve adjusts each score according to a linear formula $y=ax+b$. This may be easier to explain to students, and it offers great flexibilty. However, tweaking the `a` and `b` values can be challenging, and it can create scores greater than 100. For this reason, we offer a helper function `PARAM` to find an optimal `a` and `b`. Given the same scores as above, say we wish to curve a $50 \rightarrow 70$ and $90 \rightarrow 100$. Then we would compute $a=0.75$ and $b=32.5$ using $a = \frac{(highCurve - lowCurve)}{(highRaw - lowRaw)}$ and $b=lowCurve - (a * lowRaw)$. Then:

$$
a = 0.75, b = 32.5\\
10 \rightarrow 40\\
25 \rightarrow \approx 52\\
30 \rightarrow 55\\
50 \rightarrow 70\\
70 \rightarrow 96\\
90 \rightarrow 100\\ 
$$

## Flat curving
A flat curve is a simple adjustment is a simple adjustment where the final curve is $y=a+x$. This does not offer much flexibility, but is useful for small adjustments, such as if everyone missed an exam question. For example:

$$
a = 8\\
10 \rightarrow  18\\
25 \rightarrow  33\\
30 \rightarrow  38\\
50 \rightarrow  58\\
70 \rightarrow  78\\
90 \rightarrow  98\\ 
$$


## Bell curving
Strictly speaking, our bell curve does not actually change any raw scores. Instead, we compute the standard deviation to help the professor establish grade cutoffs. Presently, the grade cut offs are computed as following:

$$
A \geq mean + 2sd\\
B \geq mean + sd\\
C \geq mean - sd\\
D \geq mean - 2sd\\
F < mean - 2sd
$$

This, of course, can produce some *wild* results:

$$
A \geq 100\\
B \geq ~73\\
C \geq ~18\\
D \geq ~-9\\
F < -9\\
$$

# Statistics: 
Cowculator computes and displays several statistics to help the professor in their decision making.
* H: the delta computed of the highest score.
* M: the delta computed of the mean score. Note this doesn't represent any one student, but rather the average.
* L: the delta computed of the lowest score.
* Med: the delta computed of the median score. Note this specifically represents one student, and may not represent the class average.
* Mod: the delta computed of the mode score. This is the most frequently occuring score. Note Cowculator displays a "-1" should no mode exist.

# Functionality
*Note: not every key will be covered, as they are standard across nearly all calculators. If this is your first time using a calculator, please ask Randall Munroe for a helpful guide.*
## RPN
Cowculator is easy to use. It follows an RPN format rather than a traditional format. For example, one may typically expect:

$$1+1=2$$

An RPN calculator works as follows:

$$1 \space \space 1\space + = 2$$

This logic carries through for multiple operations. For example:

$$
1 \space 2 \space 3 \space 4 \space 5 \space + =\\
1 \space 2 \space 3 \space 9 + = \\
1 \space 2 \space 12 + =\\
1 \space 14 + =15
$$

## Stack
As an RPN calculator, Cowculator maintains a stack. The stack of Cowculator can be any arbitrary depth. The last 4 values of your stack will be displayed as `T, S, Y, X`, respectively. When entering a number, this number is immediately on the stack. Pressing `ENT` pushes this number on the stack, and this number will still be displayed on `X`. Press `ENT` again to push it to the stack, or start entering a new number. The stack size will always be displayed.

Prior entries can be removed from the stack by using the `POP` button.

One can scan through the stack by using the `ROLL` button. In this sense, the stack can behave as a circular stack. Be sure to `POP` the entry to be modified the erroneous entry. Keep using `ROLL` to find the *"end"* of the stack. `POP` that entry to continue editing and entering values.

## Usage

One first enters all the score they wish to curve. Then depending, on the curving method, you may need to enter additional paramters.

### Root
Enter an $0<\alpha<1$ and press root. The calculator will then display the following statistics.

$$
\Delta high \space \Delta mean \space \Delta low \space \Delta median \space \Delta mode \space 
$$

Note that mode will display as a `-1` if it does not exist.

### Linear
Enter an `a` then `b` parameter

# Design
![](P1%20UML%20-%20Class%20Diagram.png)