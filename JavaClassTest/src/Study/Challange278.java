package Study;

public class Challange278 {
	
public static void main(String[] args) {
		    // 트리 생성
		    MyTree[] trees = new MyTree[7];
		    for (int i = 0; i < trees.length; i++) {
		      trees[i] = new MyTree(i * 10, null, null);
		    }

		    // 트리 조합
		    trees[0].setLeftSubtree(trees[1]);
		    trees[0].setRightSubtree(trees[2]);

		    /* (1) 나머지 트리를 조합하여 트리를 완성하시오. */
		    trees[1].setLeftSubtree(trees[3]);
		    trees[1].setRightSubtree(trees[4]);

		    trees[2].setLeftSubtree(trees[5]);
		    trees[2].setRightSubtree(trees[6]);
		  }
		}

		class MyTree {
		  // 최상위 노드
		  private TreeNode root;

		  // 생성자
		  public MyTree(int data, MyTree leftSubtree, MyTree rightSubtree) {
		    // 루트 노드 생성
		    this.root = new TreeNode(data, null, null);

		    // 서브 트리 연결
		    root.leftChild = (leftSubtree == null) ? null : leftSubtree.root;
		    root.rightChild = (rightSubtree == null) ? null : rightSubtree.root;
		  }

		  public void setLeftSubtree(MyTree subtree) {
		    root.leftChild = subtree.root;
		  }

		  public void setRightSubtree(MyTree subtree) {
		    root.rightChild = subtree.root;
		  }
		}

		class TreeNode {
		  int data; // 데이터
		  TreeNode leftChild; // 왼쪽 자식 노드
		  TreeNode rightChild; // 오른쪽 자식 노드

		  public TreeNode(int data, TreeNode leftChild, TreeNode rightChild) {
		    this.data = data;
		    this.leftChild = leftChild;
		    this.rightChild = rightChild;
		  }
		}

