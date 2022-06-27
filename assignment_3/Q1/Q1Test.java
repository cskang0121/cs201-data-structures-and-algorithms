public class Q1Test {
     public static void main(String[] args) {

          String result, traversal1, traversal2, traversal3;

          traversal1 = "1-2";
          traversal2 = "2-1-3";
          traversal3 = "1-3-2";
          result = verify(traversal1, traversal2, traversal3);
          System.out.println("Traversal 1 : " + traversal1);
          System.out.println("Traversal 2 : " + traversal2);
          System.out.println("Traversal 3 : " + traversal3);
          System.out.println("Expected Result : Invalid traversals");
          System.out.println("  Actual Result : " + result);
          System.out.println();

          traversal1 = "1-2-3";
          traversal2 = "2-1-3";
          traversal3 = "1-3-2";
          result = verify(traversal1, traversal2, traversal3);
          System.out.println("Traversal 1 : " + traversal1);
          System.out.println("Traversal 2 : " + traversal2);
          System.out.println("Traversal 3 : " + traversal3);
          System.out.println(
                    "Expected Result : Traversal 1 - Inorder, Traversal 2 - Preorder, Traversal 3 - Postorder");
          System.out.println("  Actual Result : " + result);
          System.out.println();

          traversal1 = "1-2-3";
          traversal2 = "3-2-1";
          traversal3 = "2-3-1";
          result = verify(traversal1, traversal2, traversal3);
          System.out.println("Traversal 1 : " + traversal1);
          System.out.println("Traversal 2 : " + traversal2);
          System.out.println("Traversal 3 : " + traversal3);
          System.out.println("Expected Result : Invalid traversals");
          System.out.println("  Actual Result : " + result);
          System.out.println();

          traversal1 = "3-1-2-5-4";
          traversal2 = "2-1-4-5-3";
          traversal3 = "1-2-3-4-5";
          result = verify(traversal1, traversal2, traversal3);
          System.out.println("Traversal 1 : " + traversal1);
          System.out.println("Traversal 2 : " + traversal2);
          System.out.println("Traversal 3 : " + traversal3);
          System.out.println(
                    "Expected Result : Traversal 1 - Preorder, Traversal 2 - Postorder, Traversal 3 - Inorder");
          System.out.println("  Actual Result : " + result);
          System.out.println();

          traversal1 = "10-20-30-40-50";
          traversal2 = "20-10-30-40-50";
          traversal3 = "10-50-40-30-20";
          result = verify(traversal1, traversal2, traversal3);
          System.out.println("Traversal 1 : " + traversal1);
          System.out.println("Traversal 2 : " + traversal2);
          System.out.println("Traversal 3 : " + traversal3);
          System.out.println(
                    "Expected Result : Traversal 1 - Inorder, Traversal 2 - Preorder, Traversal 3 - Postorder");
          System.out.println("  Actual Result : " + result);
          System.out.println();
     } 

      // write your codes here

      // Convert string into corresponding integer array
     public static int[] StringToIntegerArray(String traversal) {
          String[] tempArr = traversal.split("-");
          int[] result = new int[tempArr.length];
          for(int i = 0; i < result.length; i++) 
               result[i] = Integer.parseInt(tempArr[i]);
          return result;
     }

     // Check inorder sequence
     public static boolean isInorder(int[] traversal) {
          int prev = traversal[0];
          for (int n = 1; n < traversal.length; n++) {
               if (traversal[n] <= prev) {
                    return false;
               }
               prev = traversal[n];
          }
          return true;
     }

     public static String verify(String traversal1, String traversal2, String traversal3){
          if(!(traversal1.length() == traversal2.length() && traversal2.length() == traversal3.length())) 
               return "Invalid traversals";
          
          int[][] traversals = new int[3][];
          traversals[0] = StringToIntegerArray(traversal1);
          traversals[1] = StringToIntegerArray(traversal2);
          traversals[2] = StringToIntegerArray(traversal3);

          //Check existence of postorder and preorder
          if(!(
               traversals[0][0] == traversals[1][traversals[1].length-1] || traversals[0][traversals[0].length-1] == traversals[1][0] ||
               traversals[1][0] == traversals[2][traversals[2].length-1] || traversals[1][traversals[1].length-1] == traversals[2][0] ||
               traversals[2][0] == traversals[0][traversals[0].length-1] || traversals[2][traversals[2].length-1] == traversals[0][0] 
               )) 
               return "Invalid traversals";

          int inorderIndex = -1;
          int preorderIndex = -1;
          int postorderIndex = -1;

          // Check inOrder
          for(int i = 0; i < 3; i++) {
               if(isInorder(traversals[i]))
                    inorderIndex = i;
          }

          // Invalid if inorderIndex is -1
          if(inorderIndex == -1) return "Invalid traversals";
          
          // Check preorder and inorder
          if(inorderIndex == 0) {
               if(traversals[1][0] == traversals[2][traversals[2].length-1]) {
                    preorderIndex = 1;
                    postorderIndex = 2;
               } else if(traversals[1][traversals[1].length-1] == traversals[2][0]) {
                    preorderIndex = 2;
                    postorderIndex = 1;
               }
          } else if(inorderIndex == 1) {
               if(traversals[0][0] == traversals[2][traversals[2].length-1]) {
                    preorderIndex = 0;
                    postorderIndex = 2;
               } else if(traversals[0][traversals[0].length-1] == traversals[2][0]) {
                    preorderIndex = 2;
                    postorderIndex = 0;
               }
          } else {
               if(traversals[0][0] == traversals[1][traversals[1].length-1]) {
                    preorderIndex = 0;
                    postorderIndex = 1;
               } else if(traversals[0][traversals[0].length-1] == traversals[1][0]) {
                    preorderIndex = 1;
                    postorderIndex = 0;
               }
          }
          
          // Invalid if the preorderIndex and postorderIndex are -1
          if(preorderIndex==-1 || postorderIndex==-1)
               return "Invalid traversals";

          // Format the returned string
          String[] possibleVals = new String[3];
          possibleVals[inorderIndex] = "Inorder";
          possibleVals[preorderIndex] = "Preorder";
          possibleVals[postorderIndex] = "Postorder";
          String returnedString = String.format("Traversal 1 - %s, Traversal 2 - %s, Traversal 3 - %s", possibleVals[0], possibleVals[1], possibleVals[2]);
          
          return returnedString;
     }
}