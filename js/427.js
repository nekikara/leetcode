// Definition for a QuadTree node.
function Node(val,isLeaf,topLeft,topRight,bottomLeft,bottomRight) {
    this.val = val;
    this.isLeaf = isLeaf;
    this.topLeft = topLeft;
    this.topRight = topRight;
    this.bottomLeft = bottomLeft;
    this.bottomRight = bottomRight;
}

/**
 * @param {number[][]} grid
 * @return {Node}
 */
var construct = function(grid) {
    var N = grid.length;
    var dividing = N / 2;
    var isLeaf = true;
    var val = null;

    var topLeft = [];
    var topRight = [];
    var bottomLeft = [];
    var bottomRight = [];
    for (var i = 0; i < N; i++) {
        for (var j = 0; j < N; j++) {
            var cell = grid[i][j];

            if (val === null) {
                val = cell;
            } else {
                if (val !== cell) {
                    val = cell;
                    isLeaf = false;
                }
            }

            if (i < dividing && j < dividing) {
                if (topLeft[topLeft.length - 1] && topLeft[topLeft.length - 1].length < dividing) {
                    topLeft[topLeft.length - 1].push(cell)
                } else {
                    topLeft.push([cell])
                }
            }
            if (i < dividing && dividing <= j) {
                if (topRight[topRight.length - 1] && topRight[topRight.length - 1].length < dividing) {
                    topRight[topRight.length - 1].push(cell)
                } else {
                    topRight.push([cell])
                }
            }
            if (dividing <= i && j < dividing) {
                if (bottomLeft[bottomLeft.length - 1] && bottomLeft[bottomLeft.length - 1].length < dividing) {
                    bottomLeft[bottomLeft.length - 1].push(cell)
                } else {
                    bottomLeft.push([cell])
                }
            }
            if (dividing <= i && dividing <= j) {
                if (bottomRight[bottomRight.length - 1] && bottomRight[bottomRight.length - 1].length < dividing) {
                    bottomRight[bottomRight.length - 1].push(cell)
                } else {
                    bottomRight.push([cell])
                }
            }
        }
    }

    var tL = null;
    var tR = null;
    var bL = null;
    var bR = null;
    if (!isLeaf) {
        tL = construct(topLeft);
        tR = construct(topRight);
        bL = construct(bottomLeft);
        bR = construct(bottomRight);
    }

    return new Node(val, isLeaf, tL, tR, bL, bR);
};

var grid1 = [[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0],[1,1,1,1,1,1,1,1],[1,1,1,1,1,1,1,1],[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0]];
console.log(construct(grid1));
console.log('======= 1 end');

var grid2 = [[0,0,1,1,0,0,0,0],[0,0,1,1,0,0,0,0],[1,1,1,1,1,1,1,1],[1,1,1,1,1,1,1,1],[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0],[1,1,1,1,0,0,0,0]];
console.log(construct(grid2));
console.log('======= 2 end');

var grid3 = [[0,1,1,1],[1,0,1,1],[1,1,1,1],[1,1,1,1]];
console.log(construct(grid3));
console.log('======= 3 end');

var grid4 = [[1,1],[1,1]];
console.log(construct(grid4));
console.log('======= 4 end');
