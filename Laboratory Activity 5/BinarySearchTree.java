/* Laboratory Activity #5: Trees
* Date Submitted: October 26, 2023
* Binary Search Tree - Group 1 Given: {30, 15, 60, 7, 22, 45, 75, 17, 27}
*/

package Activity5;

class Node {
	int data;
	Node left;
	Node right;
	
	public Node (int data) {
		this.data = data;
	}
}
class BinarySearchTree {
	Node root;
	
	public void display(int mode) {
		switch(mode) {
		case 1:
			descendingOrder(root);
			break;
		case 2:
			ascendingOrder(root);
			break;
		case 3:
			inOrderTree(root);
			break;
		case 4:
			postOrderTree(root);
			break;
		case 5:
			preOrderTree(root);
			break;
		}
	}
	
	private void descendingOrder(Node root) {
		if (root != null) {
			descendingOrder(root.right);
			System.out.print(root.data + " ");
			descendingOrder(root.left);
		}
	}
	
	private void ascendingOrder(Node root) {
		
		if (root != null) {
			ascendingOrder(root.left);
			System.out.print(root.data + " ");
			ascendingOrder(root.right);
		}
	}
	
	private void inOrderTree(Node root) {
		if (root != null) {
			inOrderTree(root.left);
			System.out.print(root.data + " ");
			inOrderTree(root.right);
		}
	}
	
	private void postOrderTree(Node root) {
		if (root != null) {
			inOrderTree(root.left);
			inOrderTree(root.right);
			System.out.print(root.data + " ");
		}
	}
	
	private void preOrderTree(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			inOrderTree(root.left);
			inOrderTree(root.right);
		}
	}
	
	public static void main (String[] args) {
		
		BinarySearchTree searchTree = new BinarySearchTree();
		
		//nodes of tree (root: 30)
		searchTree.root = new Node(30);
		searchTree.root.left = new Node(15);
		searchTree.root.right = new Node(60);
		
		//children of left child (15)
		searchTree.root.left.left = new Node(7);
		searchTree.root.left.right = new Node(22);
		
		//children of left child's left child (22)
		searchTree.root.left.right.left = new Node(17);
		searchTree.root.left.right.right = new Node(27);
		
		//children of right child (60)
		searchTree.root.right.left = new Node(45);
		searchTree.root.right.right = new Node(75);
		
		System.out.println("Given: {30, 15, 60, 7, 22, 45, 75, 17, 27}");
		
		System.out.println("------------------OUTPUT------------------");
		
		System.out.print("Root: " + searchTree.root.data);
		System.out.println();
		
		System.out.print("Left subtree: ");
		searchTree.ascendingOrder(searchTree.root.left);
		System.out.println();
		
		System.out.print("Right subtree: ");
		searchTree.ascendingOrder(searchTree.root.right);
		System.out.println();
		
		
		System.out.print("Descending Order: ");
		searchTree.display(1);
		System.out.println();
		
		System.out.print("Ascending Order: ");
		searchTree.display(2);
		System.out.println();
		
		System.out.print("In-Order: ");
		searchTree.display(3);
		System.out.println();
		
		System.out.print("Post-Order: ");
		searchTree.display(4);
		System.out.println();
		
		System.out.print("Pre-Order: ");
		searchTree.display(5);
		System.out.println();
	}
}

