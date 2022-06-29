## CS201-data-structures-and-algorithms (Assignment Description)

#### Assignment 1
- [Question_1](https://github.com/cskang0121/cs201-data-structures-and-algorithms/tree/main/assignment_1/Q1)
- [Question_2](https://github.com/cskang0121/cs201-data-structures-and-algorithms/tree/main/assignment_1/Q2)
- [Question_3](https://github.com/cskang0121/cs201-data-structures-and-algorithms/tree/main/assignment_1/Q3)

> Problem statement for question 1 : Given a non-empty Integer array and the values of the elements in the array are greater than 0. Complete the following requirements in NumbersArray.java.

#### Tasks
- Write a method named findMax that returns the maximum value in the array
- Write a method named findDuplicates that returns an array containing the duplicate values in
the array
- Write a method named findUnique that returns an array containing the unique values in the
array

> Problem statement for question 2 : An implementation of a Single Linked List has been given in SinglyLinkedList.java. Study the codes and complete the following requirements in SinglyLinkedList.java to extend the functionality of the linked list. Please ensure the head and tail nodes are set accordingly if they are impacted by the methods. Compile and run SinglyLinkedListTest.java to test your implementation.

#### Tasks
- Write a method named toString to print out the elements starting from the head element
- Write a method named removeLast that removes the last element
- Write a method named reverse that reverse the sequence of all the elements


> Problem statement for question 3 : An implementation of a Double Linked List has been given in DoublyLinkedList.java. Study the codes and complete the following requirements in DoublyLinkedList.java to extend the functionality of the linked list. Please ensure the header and trailer nodes are set accordingly if they are impacted by the method. Compile and run DoublyLinkedListTest.java to test your implementation.

#### Examples : 
```
Before Group : 

Linked List   : 1 null 2 
First Element : 1 
Last Element  : 2

After Group : 

Linked List   : null 1 2 
First Element : null 
Last Element  : 2

------------------------

Before Group :

Linked List   : 4 null 1 null 3 
First Element : 4
Last Element  : 3

After Group :

Linked List   : null null 4 1 3 
First Element : null
Last Element  : 3
```

#### Assignment 2
- [Question_1](https://github.com/cskang0121/cs201-data-structures-and-algorithms/tree/main/assignment_2/Q1)
- [Question_2](https://github.com/cskang0121/cs201-data-structures-and-algorithms/tree/main/assignment_2/Q2)

> Problem statement for question 1 : "An implementation of a Single Linked List has been given in SinglyLinkedList.java. Study the codes and complete the following requirements in SinglyLinkedList.java to extend the functionality of the linked list. Please ensure the head and tail nodes are set accordingly if they are impacted by the method. Compile and run SinglyLinkedListTest.java to test your implementation."

#### Task : 
- Write a method named swap that swap the sequence of all the elements whereby the biggest value will be swapped with the lowest value, the second biggest value will be swapped with the second lowest value....
- You can assume all the values are unique.
- You should not be making changes (e.g. adding new getter methods) to the Node class within
SinglyLinkedList or to update the values of the element object within Node class directly.
- You should try to include more test cases (e.g. using a sequence of (1 to 1000) or (1 to 10000)
to see how your code will respond to a bigger input size

```
Before Swap : 

Linked List   : 3 2 1 
First Element : 3 
Last Element  : 1

After Swap    : 

Linked List   : 1 2 3 
First Element : 1 
Last Element  : 3

------------------------ 

Before Swap   : 

LinkedList    : 5 1 2 3 
First Element : 5 
Last Element  : 3

After Swap    : 

LinkedList    : 1 5 3 2 
First Element : 1 
Last Element  : 2

------------------------ 

Before Swap   : 

LinkedList    : 5 3 4 1 2 
First Element : 5
Last Element  : 2

After Swap    : 

LinkedList    : 1 3 2 5 4 
First Element : 1
Last Element  : 4
  
```

> Problem statement for Question 2 : "Palindrome are words that follow the same sequence in both directions e.g. civic, madam, refer... Do note that it’s not case sensitive thus Civic and civic are both considered as palindrome. Explore the use of the different structures (stacks and queues) to check for Palindrome words. Compile and run PalindromeTest.java to test your implementation."

#### Tasks :
- Write a method named checkPalindromeStack in PalindromeTest.java to implement this with the use of stack
- Write a method named checkPalindromeQueue in PalindromeTest.java to implement this with the use of queue
- Write a method named checkPalindromeStackAndQueue in PalindromeTest.java to implement this with the combined use of stack and queue.

```
abc

Palindrome(Stack)       : false 
Palindrome(Queue)       : false 
Palindrome(Stack&Queue) : false

refer
Palindrome(Stack)       : true 
Palindrome(Queue)       : true 
Palindrome(Stack&Queue) : true

Madam
Palindrome(Stack)       : true 
Palindrome(Queue)       : true 
Palindrome(Stack&Queue) : true
```
#### Assignment 3
- [Question_1](https://github.com/cskang0121/cs201-data-structures-and-algorithms/tree/main/assignment_3/Q1)
