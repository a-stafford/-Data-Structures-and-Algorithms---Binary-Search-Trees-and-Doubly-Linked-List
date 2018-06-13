
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.IntStream;

public class BinaryTree {

    Node root;
    BufferedWriter bw = null;
    String path = ("Results.txt");
    int s = 0, x = 0;
    boolean appendToFile = false, newLine = false;
    BinaryTreeTest treeTest = new BinaryTreeTest();

    public void addNode(int key) {
        String write;

        //if the root is null the new node is placed there and prints this out in the file
        Node newNode = new Node(key);
        int z = treeTest.w;
        if (root == null) {
            root = newNode;
            newLine = true;
            writeToFile("");

            System.out.print(z + ": " + "T" + root);
            write = z + ": " + "T" + root;
            newLine = true;
            writeToFile(write);
            s++;

        } else {
            Node curNode = root;
            Node parentNode;

            //if the root has a node the node goes into the while loop
            while (true) {
                parentNode = curNode;

                // if the node is less than the root it goes left and this is written to the file
                if (key < curNode.key) {
                    curNode = curNode.leftNode;
                    System.out.print(" L" + key + "@" + parentNode);
                    write = " L" + key + "@" + parentNode;

                    writeToFile(write);

                    s++;
                    if (curNode == null) {
                        parentNode.leftNode = newNode;
                        System.out.print(" I" + parentNode.leftNode + "@" + parentNode);
                        write = " I" + parentNode.leftNode + "@" + parentNode;

                        writeToFile(write);
                        s++;
                        return;
                    }
                } else {

                    //else if it is mroe than the root the node goes right and this is written to the file
                    curNode = curNode.rightNode;
                    System.out.print(" R" + key + "@" + parentNode);
                    write = " R" + key + "@" + parentNode;

                    writeToFile(write);
                    s++;

                    if (curNode == null) {
                        parentNode.rightNode = newNode;
                        System.out.print(" I" + parentNode.rightNode + "@" + parentNode);
                        write = " I" + parentNode.rightNode + "@" + parentNode;

                        writeToFile(write);
                        s++;
                        return;
                    }
                }
            }
        }
    }

    //writeToFile method writes the strings to the file Results.txt in the current directory
    public void writeToFile(String textLine) {
        try {
            FileWriter writer = new FileWriter(path, true);

            bw = new BufferedWriter(writer);

            if (newLine == true) {
                bw.newLine();
                newLine = false;
            }
            bw.write(textLine);

            if (bw != null) {
                bw.flush();
            }

        } catch (IOException e) {
            System.out.println("Exception");
        }
    }

    //the method average finds the average of the steps from BinaryTreeTest.java
    public void Average(int steps, int[] Steps) {
        try {
            FileWriter writer = new FileWriter(path, true);
            bw = new BufferedWriter(writer);

            steps = IntStream.of(Steps).sum();

            bw.newLine();
            bw.write("Number of Steps: " + steps);
            System.out.println("Number of Steps: " + steps);

            steps = steps / treeTest.v;

            bw.newLine();
            bw.write("Average Steps: " + steps);
            bw.newLine();
            System.out.println("Average Steps: " + steps);

            bw.close();
        } catch (IOException e) {
            System.out.println("Exception");
        }
    }

    //the method writeUoB writes my UoB number and what ADT was chosen
    public void writeUoB() {
        try {
            FileWriter writer = new FileWriter(path, false);
            bw = new BufferedWriter(writer);

            bw.write("15010235");
            bw.newLine();
            bw.write("Binary Search Tree");

            bw.close();
        } catch (IOException e) {
            System.out.println("Exception");
        }

    }
}
