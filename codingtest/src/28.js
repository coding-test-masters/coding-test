/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function(haystack, needle) {
  const end = haystack.length - needle.length; // 8 - 5 = 3 -> 0,1,2,3
  for (let i = 0; i <= end; i++) {
      let found = true;
      for (let j = 0; j < needle.length; j++) {
          if (haystack[i + j] !== needle[j]) {
              found = false;
              break;
          }
      }

      if (found) {
          return i;
      }
  }
  return -1;
};