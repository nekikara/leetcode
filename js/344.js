var reverseString = function(s) {
    const len = s.length;
    if (0 < len) {
        for (let i = 0; i < (len / 2); i++ ) {
            let tmp = s[i];
            s[i] = s[len - 1 - i];
            s[len -1 - i] = tmp;
        }
    }

    return s

};

console.log(reverseString(["h","e","l","l","o"]));
console.log(["o","l","l","e","h"]);
