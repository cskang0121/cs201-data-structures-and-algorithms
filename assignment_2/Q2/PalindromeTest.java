public class PalindromeTest {
     public static void main(String[] args) {        
          String input1 = "abc";
          System.out.println(input1);
          System.out.println("Palindrome(Stack) : " + checkPalindromeStack(input1));
          System.out.println("Palindrome(Queue) : " + checkPalindromeQueue(input1));
          System.out.println("Palindrome(Stack&Queue) : " + checkPalindromeStackAndQueue(input1));
          System.out.println();

          String input2 = "refer";
          System.out.println(input2);
          System.out.println("Palindrome(Stack) : " + checkPalindromeStack(input2));
          System.out.println("Palindrome(Queue) : " + checkPalindromeQueue(input2));
          System.out.println("Palindrome(Stack&Queue) : " + checkPalindromeStackAndQueue(input2));
          System.out.println();
          
          String input3 = "Madam";
          System.out.println(input3);
          System.out.println("Palindrome(Stack) : " + checkPalindromeStack(input3));
          System.out.println("Palindrome(Queue) : " + checkPalindromeQueue(input3));
          System.out.println("Palindrome(Stack&Queue) : " + checkPalindromeStackAndQueue(input3));
          System.out.println();    
     }

     public static boolean checkPalindromeStack(String input){
         // Corner cases
         if (input.length() == 1 || input.length() == 0) return true;

         // Case insensitive
         input = input.toLowerCase();

         // Create a stack for tracking the order
         Stack<Character> stack = new ArrayStack<>(); 
         for (int i = 0; i < input.length() / 2; i++) {
             stack.push(input.charAt(i));
         }

         // Consider the case such that the length of the String is not even
         int check = input.length() / 2;
         if (input.length() % 2 != 0) check++;

         // Check each element on the stack with the input
         for(int j = check; j < input.length(); j++) {
             if (input.charAt(j) != stack.pop()) return false;
         }

         return true;

     }

     public static boolean checkPalindromeQueue(String input){
         // Corner cases
         if (input.length() == 1 || input.length() == 0) return true;

         // Case insensitive
         input = input.toLowerCase();

         // Create a queue for tracking the order
         Queue<Character> queue = new ArrayQueue<>(); 
         for (int i = 0; i < input.length() / 2; i++) {
             queue.enqueue(input.charAt(i));
         }

         int checkEnd = input.length() / 2;

         // Check each element on the queue with the input
         for(int j = input.length() - 1; j > checkEnd; j--) {
             if (input.charAt(j) != queue.dequeue()) return false;
         }

         return true;
     }

     public static boolean checkPalindromeStackAndQueue(String input){
         // Corner cases
         if (input.length() == 1 || input.length() == 0) return true;

         // Case insensitive
         input = input.toLowerCase();
         
         // Create a stack for tracking the order
         // Create a queue for tracking the order
         Queue<Character> queue = new ArrayQueue<>(); 
         Stack<Character> stack = new ArrayStack<>(); 
         for (int i = 0; i < input.length(); i++) {
             queue.enqueue(input.charAt(i));
             stack.push(input.charAt(i));
         }

         // Check each element on the stack with that of the queue
         for(int j = 0; j < input.length(); j++) {
             if (stack.pop() != queue.dequeue()) return false;
         }

         return true;
     }
}
