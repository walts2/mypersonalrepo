// Binary Tree in Java
public class BinaryTree {

    public static void main(String[] args) {

        // Create root node CEO
        Node CEO = new Node("CEO");
        // Create node Vice President
        Node VicePresident = new Node("Vice President");
        // Create node Accountant Supervisor
        Node AccountantSupervisor = new Node("Accountant Supervisor");
        // Create node Accountant Executive
        Node AccountExec = new Node("Account Executive");
        // Create node Manager
        Node Manager = new Node("Manager");
        // Create node Accountant
        Node Accountant = new Node("Accountant");
        // Create node Personnel
        Node Personnel = new Node("Personnel");

        // Set left and right child of root node CEO
        CEO.left = VicePresident;
        CEO.right = AccountantSupervisor;

        // Set left and right child of node Vice President
        VicePresident.left = AccountExec;
        VicePresident.right = Manager;

        // Set left and right child of node Accountant Supervisor
        AccountantSupervisor.left = Accountant;
        AccountantSupervisor.right = Personnel;

        System.out.print("\nIn order Traversal: ");
        traverseInOrder(CEO);

        System.out.print("\nPre order Traversal: ");
        traversePreOrder(CEO);

        System.out.print("\nPost order Traversal: ");
        traversePostOrder(CEO);
    }

    // Traverse Inorder Method
    static void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    // Traverse Postorder method
    static void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    // Traverse Preorder method
    static void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
}
