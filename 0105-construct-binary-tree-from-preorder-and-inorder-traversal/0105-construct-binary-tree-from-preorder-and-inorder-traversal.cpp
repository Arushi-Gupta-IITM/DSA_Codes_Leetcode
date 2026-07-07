/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    
    int findRootIdx(vector<int>& preorder, vector<int>& inorder, int idx, int si, int ei) {
        int root = preorder[idx];
        for(int i=si; i<=ei; i++) {
            if(inorder[i] == root) return i;
        }
        return -1;
    }

    TreeNode* buildTreeUtil(vector<int>& preorder, vector<int>& inorder, int &idx, int si, int ei) {
        if(si > ei) return NULL;
        int rootIdx = findRootIdx(preorder, inorder, idx, si, ei);
        TreeNode* root = new TreeNode(preorder[idx]);
        idx++;

        root->left = buildTreeUtil(preorder, inorder, idx, si, rootIdx-1);
        root->right = buildTreeUtil(preorder, inorder, idx, rootIdx+1, ei);

        return root;
    }

    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
        // idx: works on preorder
        // si and ei work on inorder
        int si = 0, ei = inorder.size()-1;
        int idx = 0;

        return buildTreeUtil(preorder, inorder, idx, si, ei);
    }
};