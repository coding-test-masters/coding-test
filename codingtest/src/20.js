/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function (s) {
  const arr = [];
  for (let i = 0; i < s.length; i++) {
    const p = s.charAt(i);
    if (p === '(' || p === '{' || p === '[') {
      arr.push(s.charAt(i));
    } else if (p === ')') {
      if (arr[arr.length - 1] === '(') {
        arr.pop();
      } else {
        arr.push(p);
      }
    } else if (p === '}') {
      if (arr[arr.length - 1] === '{') {
        arr.pop();
      } else {
        arr.push(p);
      }
    } else if (p === ']') {
      if (arr[arr.length - 1] === '[') {
        arr.pop();
      } else {
        arr.push(p);
      }
    }
  }

  if (arr.length === 0) {
    return true;
  } else {
    return false;
  }
};
