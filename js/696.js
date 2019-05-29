/**
 * @param {string} s
 * @return {number}
 */
var countBinarySubstrings = function(s) {
    const group = [];
    let now = s[0];
    let counter = 1;
    for (let i=1; i < s.length; i++) {
        const c = s[i];
        if (c === now) {
            counter += 1;
        } else {
            now = c;
            group.push(counter);
            counter = 1;
        }
    }
    group.push(counter);

    let count = 0;
    for (let i = 0; i < group.length - 1; i++) {
        let diff = Math.min(group[i], group[i + 1]);
        count += diff;
    }
    return count;
};

const i = "00110011";
const o = 6;
const actual = countBinarySubstrings(i);
console.log(actual);
console.log(o);
console.log("result", actual === o);
