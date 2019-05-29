function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}

/**
 * @param {TreeNode} root
 * @param {number} L
 * @param {number} R
 * @return {number}
 */
var rangeSumBST = function(root, L, R) {
    if (!root) {
        return 0;
    }
    let ans = L <= root.val && root.val <= R ? root.val : 0;
    ans += rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
    return ans
};

const root = new TreeNode(10);
root.left = new TreeNode(5);
root.left.left = new TreeNode(3);
root.left.right = new TreeNode(7);
root.right = new TreeNode(15);
root.right.right = new TreeNode(18);

console.log(rangeSumBST(root, 7, 15));
console.log(32);

const root1 = new TreeNode(10);
root.left = new TreeNode(5);
root.left.left = new TreeNode(3);
root.left.right = new TreeNode(7);
root.left.left.left = new TreeNode(1);
root.left.right.left = new TreeNode(6);
root.right = new TreeNode(15);
root.right.left = new TreeNode(13);
root.right.right = new TreeNode(18);

console.log(rangeSumBST(root1, 6, 10));
console.log(23);

