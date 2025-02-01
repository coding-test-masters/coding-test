/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
  let count = strs[0].length;
  let prefix = strs[0];

  for (let i = 1; i < strs.length; i++) {
      let str = strs[i];
      let newCount = 0;

      for (let j = 0; j < str.length; j++) {
          if (j >= prefix.length) {
              break;
          }

          if (prefix[j] === str[j]) {
              newCount++;
          } else {
              break;
          }
      }
      count = Math.min(newCount, count);
  }
  
  prefix = prefix.substring(0, count);
  return prefix;
};