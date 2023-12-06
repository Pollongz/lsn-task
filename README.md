# LSN - Dariusz Bożejewicz

Backend tasks

## Installation

1. Open cmd

2. Go to src directory of the project

```bash
cd src
```

3. Run
```bash
javac Main.java
```
4. then run
```bash
java Main.java
```

## Features

User have to pick number between 1 and 3 to choose which task should be run.


### Task 1. Output the list of distinct elements sorted in ascending order.

User passes list of numbers separated by spaces, then program sort the list and return:

- distinct elements in the list,

- amount of given elements, amount of elements in distinct list,

- minimum value in the list,

- maximum value in the list

Logic of the program is in class `DistinctElementsTask.java`


### Task 2. Find all the pairs (in this integer list) that sum up to 13.

User passes list of numbers separated by spaces, then program sorts the list, iterates through the list and compares elements to check if any numbers added together sum up to 13. 
Then program returns:

- pairs of numbers with a sum of 13

Logic of the program is in class `PairsTask.java`


### Task 3. Check how many separated graphs are in the input.

User passes positive number n, next n lines contains pairs of positive integers, where each pair identifies a connection between two vertices in a graph. 
Program then does depth-first search algorithm and returns:

- amount of separated graphs

Logic of the program is in class `GraphTask.java`

---
User can restart the application or close it by choosing 1 or 0 after every task.
There is also utils class `IntegerListFromInput.java` to separate converting users input into the list.
