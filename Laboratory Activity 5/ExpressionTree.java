/* Laboratory Activity #5: Trees
 * Date Submitted: October 26, 2023
 * Expression Tree - Group 1 Given: 3 + ((5 + 9)* 2)
 */

package Activity5;

class Nodes {
	String data;
	Nodes left;
	Nodes right;
	
	public Nodes (String data) {
		this.data = data;
		left = null;
		right = null;
	}
}

class ExpressionTree {
	Nodes root;
	
	public static int evaluateTree(Nodes root) {
		
		if (root != null) {
			
			int left = evaluateTree(root.left);
			int right = evaluateTree(root.right);
			
			switch (root.data) {
			case "+": 
				return left + right;
			case "-":
				return left - right;
			case "/":
				return left / right;
			case "*":
				return left * right;
			default:
				return Integer.valueOf(root.data);
			}	
		}
		return 0;
	}
	
	public static void main (String[] args) {
		ExpressionTree expressionTree = new ExpressionTree();
		
		expressionTree.root = new Nodes("+");
		expressionTree.root.left = new Nodes("3");
		expressionTree.root.right = new Nodes("*");
		
		expressionTree.root.right.left = new Nodes("+");
		expressionTree.root.right.right = new Nodes("2");
		
		expressionTree.root.right.left.left = new Nodes("5");
		expressionTree.root.right.left.right = new Nodes("9");
		
		System.out.println("Given: 3 + ((5 + 9)* 2)");
		System.out.println("Output: " + evaluateTree(expressionTree.root));
	}
}

