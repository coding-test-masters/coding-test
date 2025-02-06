/**
 * @param {string} s
 * @return {boolean}
 */

const code0 = '0'.charCodeAt(0);
const code9 = '9'.charCodeAt(0);
const codeA = 'A'.charCodeAt(0);
const codeZ = 'Z'.charCodeAt(0);
const codea = 'a'.charCodeAt(0);
const codez = 'z'.charCodeAt(0);
const diff = codea - codeA;

var isPalindrome = function(s) {
    
    //'A' -> 'a'
    //'a' ~ 'z' ~ '0' ~ '9' -> if not, splice
    
    let arr = [];
    
    for (let i = 0; i < s.length; i++) {
        let code = s.charCodeAt(i);
        if (isAlphaNumeric(code)) {
            if (code >= codeA && code <= codeZ) {
                code = code + diff;
            }
            arr.push(code);
        }
    }

    for (let j = 0; j < arr.length / 2; j++) {
        if (arr[j] !== arr[arr.length - 1 - j]) {
            return false;
        }
    }

    return true;
};

var isAlphaNumeric = function(c) {
    
    if (c >= code0 && c <= code9) {
        return true;
    }
    if (c >= codeA && c <= codeZ) {
        return true;
    }
    if (c >= codea && c <= codez) {
        return true;
    }
    return false;
}