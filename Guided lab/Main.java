public class Main {
    public static void main(String[] args) {

        // STEP 1: Create the manager object for our tree.
        BinaryTree animalTree = new BinaryTree();

        // STEP 2: Create all the individual node objects.
        // Right now, they are not connected to anything.
        Node rootNode = new Node("Does it live on land?");
        Node seaNode = new Node("Is it a mammal?");
        Node landNode = new Node("Is it a pet?");
        Node crustaceanNode = new Node("Is it a Crab?");
        Node fishNode = new Node("Is it a Dolphin?");
        Node wildNode = new Node("Is it a Lion?");
        Node petNode = new Node("Is it a Dog?");

        // STEP 3: Manually connect the nodes to build the tree structure.
        // This is the most important part!

        // First, set the root of the tree.
        animalTree.root = rootNode;

        // Now, connect the children of the root.
        rootNode.left = seaNode;   // "No" to "lives on land?"
        rootNode.right = landNode; // "Yes" to "lives on land?"

        // Connect the children of the "sea" branch.
        seaNode.left = crustaceanNode; // "No" to "is it a mammal?"
        seaNode.right = fishNode;    // "Yes" to "is it a mammal?"

        // Connect the children of the "land" branch.
        landNode.left = wildNode; // "No" to "is it a pet?"
        landNode.right = petNode; // "Yes" to "is it a pet?"

        System.out.println("Tree construction complete!");
        System.out.println("Let's see how a computer would read this tree...");

        // STEP 4: Call the traversal methods to print the nodes.
        animalTree.traversePreOrder();
        animalTree.traverseInOrder();
        animalTree.traversePostOrder();
    }
}