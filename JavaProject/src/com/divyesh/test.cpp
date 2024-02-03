class TreeNode {
public:
    int val;
    TreeNode* left;
    TreeNode* right;

    TreeNode(int val) : val(val), left(nullptr), right(nullptr) {}
};

class BinarySearchTree {
private:
    TreeNode* root;

public:
    BinarySearchTree() : root(nullptr) {}

    void insert(int val) {
        root = insertRec(root, val);
    }

private:
    TreeNode* insertRec(TreeNode* root, int val) {
        if (root == nullptr) {
            return new TreeNode(val);
        }
        if (val < root->val) {
            root->left = insertRec(root->left, val);
        } else if (val > root->val) {
            root->right = insertRec(root->right, val);
        }
        return root;
    }

    // Other methods like search, delete, traversal, etc. could be implemented similarly
};