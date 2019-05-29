function Node(val, children) {
  this.val = val;
  this.children = children;
}

var maxDepth = function(root) {
  var max = 0;
  if (root && root.children) {
    max = 1;
    let stack = root.children.map(c => {return {n: 2, node: c};});
    while(0 < stack.length) {
      const t = stack.shift();
      if (max < t.n) {
        max = t.n;
      }
      if (0 < t.node.children.length) {
        const s = t.node.children.map(c => {return {n: t.n + 1, node: c};});
        stack = s.concat(stack);
      }
    }
  }
  return max;
}

var root = new Node(1, [
  new Node(3, [
    new Node(5, []),
    new Node(6, [])
  ]),
  new Node(2, [
    new Node(1, [
      new Node(-1, [
        new Node(-2, []),
      ]),
    ]),
  ]),
  new Node(4, []),
]);

console.log(maxDepth(root));

var root2 = new Node(1, [
  new Node(3, [
    new Node(5, []),
    new Node(6, [])
  ]),
  new Node(2, [
    new Node(1, [
      new Node(-1, [
        new Node(-2, [
          new Node(100, [
            new Node(1000, []),
          ]),
        ]),
      ]),
    ]),
  ]),
  new Node(4, []),
]);

console.log(maxDepth(root2));
