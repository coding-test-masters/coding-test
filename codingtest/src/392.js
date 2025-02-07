/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isSubsequence = function(s, t) {
  let sCur = 0;

  for (let i = 0; i < t.length; i++) {
      if (t[i] === s[sCur]) {
          sCur++;
      }

      if (sCur >= s.length) {
          break;
      }
  }

  if (sCur >= s.length) {
      return true;
  } else {
      return false;
  }
};