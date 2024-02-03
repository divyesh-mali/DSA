package com.divyesh;

class treenode {
    int val;
    treenode left;
    treenode right;

    public treenode(int val) {
        this.val = val;
        left = right = null;
    }
}

class BinarySearchTree {
    private treenode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int val) {
        root = insertRec(root, val);
    }

    private treenode insertRec(treenode root, int val) {
        if (root == null) {
            return new treenode(val);
        }
        if (val < root.val) {
            root.left = insertRec(root.left, val);
        } else if (val > root.val) {
            root.right = insertRec(root.right, val);
        }
        return root;
    }

    // Other methods like search, delete, traversal, etc. could be implemented similarly
}