function Node(val, children) {
  this.val = val;
  this.children = children;
}

var postorder = function(root) {
  const s = [root];
  const ans = [];
  while (0 < s.length) {
    const n =  s.shift();
    if (!!n) {
      ans.unshift(n.val);
      if (!!n.children) {
        for (let i=0; i<n.children.length; i++) {
          s.unshift(n.children[i]);
        }
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

console.log(postorder(root));
console.log([5,6,3,2,4,1]);

var root1 = new Node(1, [
    new Node(10, [
        new Node(5, []),
        new Node(0, [])
    ]),
    new Node(3, [
        new Node(6, [])
    ])
]);

console.log(postorder(root1));
console.log([5,0,10,6,3,1]);


let y = {
  val: 1,
  children:[
    {
      val:10,
      children:[
        {val:5,children:[]},
        {val:0,children:[]}
      ]
    },
    {
      val:3,
      children:[
        {val:6,children:[]}
      ]
    }
  ]
};
