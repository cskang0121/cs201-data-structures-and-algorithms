# CS201-data-structures-and-algorithms (Assignment Description)

## Assignment 1
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

> Problem statement for question 2 : "An implementation of a Single Linked List has been given in SinglyLinkedList.java. Study the codes and complete the following requirements in SinglyLinkedList.java to extend the functionality of the linked list. Please ensure the head and tail nodes are set accordingly if they are impacted by the methods. Compile and run SinglyLinkedListTest.java to test your implementation."

#### Tasks
- Write a method named toString to print out the elements starting from the head element
- Write a method named removeLast that removes the last element
- Write a method named reverse that reverse the sequence of all the elements


> Problem statement for question 3 : "An implementation of a Double Linked List has been given in DoublyLinkedList.java. Study the codes and complete the following requirements in DoublyLinkedList.java to extend the functionality of the linked list. Please ensure the header and trailer nodes are set accordingly if they are impacted by the method. Compile and run DoublyLinkedListTest.java to test your implementation."

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

## Assignment 2
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


#### Examples : 
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



#### Examples : 
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
## Assignment 3
- [Question_1](https://github.com/cskang0121/cs201-data-structures-and-algorithms/tree/main/assignment_3/Q1)

> Problem statement for question 1 : "Given 3 traversals, the objective is to verify if the 3 traversals are a valid combination of a binary search tree. Compile and run Q1Test.java to test your implementation."

#### Tasks :
- Write a method named verify that takes in 3 strings parameter (String traversal1, String traversal2, String traversal3) containing the traversal of a binary search tree.
- The input parameters could be of any sequence e.g. traversal1 could be Inorder, Preorder, Postorder
- The nodes in the sequence are separated by “-“ and contains integers only e.g. (1-2-3)
- The nodes are unique in a traversal. e.g. (there won’t be 1-2-2-3)
- If the 3 traversals are valid, the output prints the traversal orders of the respective strings. Otherwise, prints “Invalid traversals”
- You can include additional classes.

#### Examples :
```
Traversal 1 : 1-2
Traversal 2 : 2-1-3
Traversal 3 : 1-3-2
Expected Result : Invalid traversals
Actual Result   : Invalid traversals

Traversal 1 : 1-2-3
Traversal 2 : 2-1-3
Traversal 3 : 1-3-2
Expected Result : Traversal 1 - Inorder, Traversal 2 - Preorder, Traversal 3 - Postorder
Actual Result   : Traversal 1 - Inorder, Traversal 2 - Preorder, Traversal 3 - Postorder

Traversal 1 : 1-2-3
Traversal 2 : 3-2-1
Traversal 3 : 2-3-1
Expected Result : Invalid traversals
Actual Result   : Invalid traversals

Traversal 1 : 3-1-2-5-4
Traversal 2 : 2-1-4-5-3
Traversal 3 : 1-2-3-4-5
Expected Result : Traversal 1 - Preorder, Traversal 2 - Postorder, Traversal 3 - Inorder
Actual Result   : Traversal 1 - Preorder, Traversal 2 - Postorder, Traversal 3 - Inorder

Traversal 1 : 10-20-30-40-50
Traversal 2 : 20-10-30-40-50
Traversal 3 : 10-50-40-30-20
Expected Result : Traversal 1 - Inorder, Traversal 2 - Preorder, Traversal 3 - Postorder
Actual Result   : Traversal 1 - Inorder, Traversal 2 - Preorder, Traversal 3 - Postorder

```
