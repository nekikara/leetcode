function Node(val, children) {
  this.val = val;
  this.children = children;
}

var preorder = function(root) {
  let s = [root];
  const ans = [];
  while (0 < s.length) {
    const n =  s.shift();
    if (!!n) {
      ans.push(n.val);
      if (!!n.children) {
        s = n.children.concat(s);
      }
    }
  }
  return ans;
};

var root = new Node(1, [
  new Node(3, [
    new Node(5, []),
    new Node(6, [])
  ]),
  new Node(2, []),
  new Node(4, []),
]);

console.log(preorder(root));
console.log([1,3,5,6,2,4]);

var root1 = new Node(1, [
    new Node(10, [
        new Node(5, []),
        new Node(0, [])
    ]),
    new Node(3, [
        new Node(6, [])
    ])
]);

console.log(preorder(root1));
console.log([1,10,5,0,3,6]);
