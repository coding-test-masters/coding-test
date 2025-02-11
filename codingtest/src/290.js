/**
 * @param {string} pattern
 * @param {string} s
 * @return {boolean}
 */
var wordPattern = function(pattern, s) {
    const words = s.split(' ');
    const o = {};
    const or = {};

    for (let i = 0; i < pattern.length; i++) {
        o[pattern[i]] = words[i];
        or[words[i]] = pattern[i];
    }

    const arr = [];
    for (let i = 0; i < pattern.length; i++) {
        arr.push(o[pattern[i]]);
    }
    const combined = arr.join(' ');
    
    if (Object.keys(o).length !== Object.keys(or).length) {
        return false;
    }

    if (s === combined) {
        return true;
    } else {
        return false;
    }
};