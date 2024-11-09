class Solution {
    // Return the Kth smallest element in the given BST
    public int KthSmallestElement(Node root, int K) {
        Node curr = root;
        int count = 0;
        
        while(curr!=null){
            if(curr.left == null){
                count++;
                if(count==K){
                    return curr.data;
                }
                curr= curr.right;
            }
            else{
                Node prev = curr.left;
                while(prev.right!=null && prev.right!=curr){
                    prev=prev.right;
                }
                if(prev.right==null){
                    prev.right=curr;
                    curr=curr.left;
                }
                else{
                    prev.right=null;
                    count++;
                    if(count==K){
                        return curr.data;
                    }
                    curr=curr.right;
                }
            }
        }
        return -1;
    }
}

/**
 * This uses Morris Tree Traversal where the time complexity is O(n)
 * Approach:
 *  -The algorithm leverages the structure of BSTs where inorder traversal yields nodes in sorted order.
 *  -For each node, if it has a left child, find its inorder predecessor in the left subtree, which is the rightmost node of the left subtree.
 *  -Create a temporary "thread" (a link) from this predecessor to the current node, allowing us to traverse back to the current node after visiting the left subtree.
 *  -Remove the thread when done with the subtree to restore the tree structure.
 */