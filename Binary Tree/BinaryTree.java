// Binary Tree in Java
public class BinaryTree {

    public static void main(String[] args) {

        // Create root node A
        Node CEO = new Node("CEO");
        // Create node B
        Node VicePresident = new Node("Vice President");
        // Create node C
        Node AccountantSupervisor = new Node("Accountant Supervisor");
        // Create node D
        Node AccountExec = new Node("Account Executive");
        // Create node E
        Node Manager = new Node("Manager");
        // Create node F
        Node Accountant = new Node("Accountant");
        // Create node G
        Node Personnel = new Node("Personnel");

        // Set left and right child of root node A
        CEO.left = VicePresident;
        CEO.right = AccountantSupervisor;

        // Set left and right child of node B
        VicePresident.left = AccountExec;
        VicePresident.right = Manager;

        // Set left and right child of node C
        AccountantSupervisor.left = Accountant;
        AccountantSupervisor.right = Personnel;

        System.out.print("\nPre order Traversal: ");
        traversePreOrder(CEO);
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
