
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> root1Leaves = new ArrayList<>();
        List<Integer> root2Leaves = new ArrayList<>();

        traverseTree(root1, root1Leaves);
        traverseTree(root2, root2Leaves);

        return root1Leaves.equals(root2Leaves);

    }

    public void traverseTree(TreeNode node, List<Integer> leaves){
        if(node ==  null){
            return;
        }

        int i = 0;

        if(node.left == null && node.right == null){
            leaves.add(node.val);
        }

        traverseTree(node.left, leaves);
        traverseTree(node.right, leaves);
    }


}
