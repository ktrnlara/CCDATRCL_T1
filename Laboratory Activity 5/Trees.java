// Group 1
// Binary Search Tree - Grp1 Given: {30, 15, 60, 7, 22, 45, 75, 17, 27}
package Activity5;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}

class Trees {
    Node root;

    public void display(int mode) {
        switch (mode) {
            case 1:
                displayDescending(root);
                break;
            case 2:
                displayAscending(root);
                break;
            case 3:
                displayInOrder(root);
                break;
            case 4:
                displayPreOrder(root);
                break;
            case 5:
                displayPostOrder(root);
                break;
            default:
                System.out.println("Invalid mode");
        }
    }

    public void displayDescending(Node node) {
        if (node != null) {
            displayDescending(node.right);
            System.out.print(node.data + " ");
            displayDescending(node.left);
        }
    }

    public void displayAscending(Node node) {
        if (node != null) {
            displayAscending(node.left);
            System.out.print(node.data + " ");
            displayAscending(node.right);
        }
    }

    public void displayInOrder(Node node) {
        if (node != null) {
            displayInOrder(node.left);
            System.out.print(node.data + " ");
            displayInOrder(node.right);
        }
    }

    public void displayPreOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            displayPreOrder(node.left);
            displayPreOrder(node.right);
        }
    }

    public void displayPostOrder(Node node) {
        if (node != null) {
            displayPostOrder(node.left);
            displayPostOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        Trees searchTree = new Trees();

        // Nodes of the tree (root: 30)
        searchTree.root = new Node(30);
        searchTree.root.left = new Node(15);
        searchTree.root.right = new Node(60);

        // Children of the left child (15)
        searchTree.root.left.left = new Node(7);
        searchTree.root.left.right = new Node(22);

        // Children of the left child's left child (22)
        searchTree.root.left.right.left = new Node(17);
        searchTree.root.left.right.right = new Node(27);

        // Children of the right child (60)
        searchTree.root.right.left = new Node(45);
        searchTree.root.right.right = new Node(75);

        System.out.println("Given: {30, 15, 60, 7, 22, 45, 75, 17, 27}");
        System.out.println("                                          ");
        
        System.out.println("Root: " + searchTree.root.data);
        System.out.println("                                          ");
        
        System.out.print("Left subtree: ");
        searchTree.displayDescending(searchTree.root.left);
        System.out.println();
        
        System.out.print("Right subtree: ");
        searchTree.displayDescending(searchTree.root.right);
        System.out.println();
        System.out.println("                                          ");
        
        System.out.print("Descending Order: ");
        searchTree.display(1);
        System.out.println();
        
        System.out.print("Ascending Order: ");
        searchTree.display(2);
        System.out.println();
        System.out.println("                                          ");
        
        System.out.print("In-Order: ");
        searchTree.display(3);
        System.out.println();
        
        System.out.print("Pre-Order: ");
        searchTree.display(4);
        System.out.println();
        
        System.out.print("Post-Order: ");
        searchTree.display(5);
    }
}



