/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
  const sp = s.split(" ");
  for (let i = sp.length - 1; i >= 0; i--) {
      if (sp[i]) {
          return sp[i].length;
      }
  }
  throw new Error();
};