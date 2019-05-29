/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDisappearedNumbers = function(nums) {
    const n = nums.length;
    const l = {};

    for (let i = 0; i < n; i++) {
        const x = nums[i];
        if (l[x]) {
            l[x] += 1;
        } else {
            l[x] = 1;
        }
    }
    const ans = [];
    for (let i=1; i <= n; i++) {
        if (!l[i]) {
            ans.push(i);
        }
    }

    return ans;
};

let i = [4,3,2,7,8,2,3,1];
let o = [5,6];
let actual = findDisappearedNumbers(i);
console.log(actual, o);
