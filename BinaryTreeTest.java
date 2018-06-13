
import java.util.Random;

public class BinaryTreeTest {

    /* int w keeps count of how many runs is in the outputted file 
       int v tells BinaryTree.java what to divide by for the average 
     */
    public static int w = 0, v = 1;

    /* int x is how many numbers have been added to tree
       int y is the random number generated
       int z is the count for 10, 100, 1000 runs
       int steps counts the number of steps to find the average
       int N is the highest number for the random generator 
     */
    public static void main(String[] args) {

        int x = 0, y, z = 1, steps = 0, N = 15010235;
        int[] Steps = new int[1000];
        Random random = new Random();
        BinaryTree binarySearchTree = new BinaryTree();

        //binarySearchTree.writeUoB() writes to the top of the Results.txt
        binarySearchTree.writeUoB();

//BinarySearch Tree insertion 10 times

        /* loops through the code 10 times adding 100 randomly generated numbers while counting the steps
           when done the average is found and written to the Results.txt file located in your current directory
         */
        while (z <= 10) {
            w++;
            binarySearchTree = new BinaryTree();
            while (x <= 100) {
                //sets y to equal the new random number 100 times
                y = random.nextInt(N) + 0;
                binarySearchTree.addNode(y);
                x++;
            }
            System.out.print("\n");

            //adds the steps to the array to be counted
            if (z != 10) {
                Steps[z] = binarySearchTree.s;
                x = 0;
            }
            z++;
        }
        v = 10;
        //finds the averae of the steps
        binarySearchTree.Average(steps, Steps);

//BinarySearch Tree insertion 100 times

        /* loops through the code 100 times adding 100 randomly generated numbers while counting the steps
           when done the average is found and written to the Results.txt file located in your current directory
         */
        w = 0;
        z = 0;
        while (z <= 100) {
            binarySearchTree = new BinaryTree();
            while (x <= 100) {
                //sets y to equal the new random number 100 times
                y = random.nextInt(N) + 0;
                binarySearchTree.addNode(y);
                x++;
            }
            System.out.print("\n");

            w++;

            //adds the steps to the array to be counted
            if (z != 100) {
                Steps[z] = binarySearchTree.s;
                x = 0;
            }
            z++;
        }
        v = 100;
        //finds the averae of the steps
        binarySearchTree.Average(steps, Steps);

//BinarySearch Tree insertion 1000 times

        /* loops through the code 1000 times adding 100 randomly generated numbers while counting the steps
           when done the average is found and written to the Results.txt file located in your current directory
         */
        w = 0;
        z = 0;
        while (z <= 1000) {
            binarySearchTree = new BinaryTree();

            while (x <= 100) {
                //sets y to equal the new random number 100 times
                y = random.nextInt(N) + 0;
                binarySearchTree.addNode(y);
                x++;
            }

            System.out.print("\n");

            w++;

            //adds the steps to the array to be counted
            if (z != 1000) {
                Steps[z] = binarySearchTree.s;
                x = 0;
            }
            z++;
        }
        v = 1000;
        //finds the averae of the steps
        binarySearchTree.Average(steps, Steps);
    }
}
