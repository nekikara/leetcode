// Definition for a Node.
function Node(val,children) {
    this.val = val;
    this.children = children;
}

/**
 * @param {Node} root
 * @return {number[][]}
 */
var levelOrder = function(root) {
    var ans = [];
    traverse(root, 0, ans);
    return ans;
};

var traverse = function(node, depth, bucket) {
    if (node) {
        if (!!bucket[depth]) {
            bucket[depth].push(node.val);
        } else {
            bucket[depth] = [node.val];
        }
        for (var i = 0; i < node.children.length; i++) {
            traverse(node.children[i], depth + 1, bucket);
        }
    }
};

let i1 = new Node(1, [
    new Node(3, [
        new Node(5, []),
        new Node(6, []),
    ]),
    new Node(2, []),
    new Node(4, []),
]);

console.log(levelOrder(i1));
console.log([
    [1],
    [3,2,4],
    [5,6]
]);

let i2 = new Node(1, [
    new Node(3, [
        new Node(5, []),
        new Node(6, []),
        new Node(7, [
            new Node(8, [])
        ]),
    ]),
    new Node(2, []),
    new Node(4, [
        new Node(10, [
            new Node(11, [])
        ])
    ]),
]);

console.log(levelOrder(i2));
console.log([
    [1],
    [3,2,4],
    [5,6,7, 10],
    [8, 11],
]);

let i3 = new Node(0, []);
console.log(levelOrder(i3));
console.log([[0]]);
