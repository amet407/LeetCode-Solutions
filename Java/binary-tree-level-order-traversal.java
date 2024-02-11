
import java.util.Vector;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
/* 
  //Definition for a binary tree node.
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
  */
 
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root)
    {
        List<List<Integer>> level_order = new Vector<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null)
        {
            return level_order;
        }
        else
        {
            q.add(root);
            while(!q.isEmpty())
            {
                int level_size=q.size();
                Vector<Integer> level = new Vector<>();
                for(int i=0; i<level_size; i++)
                {
                    level.add(q.peek().val);
                    if(q.peek().left!=null)
                    {
                        q.add(q.peek().left);
                    }
                    if(q.peek().right!=null)
                    {
                        q.add(q.peek().right);
                    }
                    q.remove();
                }
                level_order.add(level);
            }
        }
        return level_order;
    }
}