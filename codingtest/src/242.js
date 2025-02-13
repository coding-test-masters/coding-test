/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
  const sArr = [];
  const tArr = [];
  for (const c of s) {
      sArr.push(c);
  }
  for (const c of t) {
      tArr.push(c);
  }

  if (sArr.length !== tArr.length) {
      return false;
  }

  sArr.sort();
  tArr.sort();

  for (let i = 0; i < sArr.length; i++) {
      if (sArr[i] !== tArr[i]) {
          return false;
      }
  }
  return true;
};