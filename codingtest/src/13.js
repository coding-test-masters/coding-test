/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function (s) {
  let sum = 0;

  const m = {
    I: 1,
    V: 5,
    X: 10,
    L: 50,
    C: 100,
    D: 500,
    M: 1000,
  };

  for (let i = 0; i < s.length; i++) {
    if (s[i] === 'I') {
      if (s[i + 1] === 'V') {
        i++;
        sum += 4;
        continue;
      } else if (s[i + 1] === 'X') {
        i++;
        sum += 9;
        continue;
      }
    }
    if (s[i] === 'X') {
      if (s[i + 1] === 'L') {
        i++;
        sum += 40;
        continue;
      } else if (s[i + 1] === 'C') {
        i++;
        sum += 90;
        continue;
      }
    }
    if (s[i] === 'C') {
      if (s[i + 1] === 'D') {
        i++;
        sum += 400;
        continue;
      } else if (s[i + 1] === 'M') {
        i++;
        sum += 900;
        continue;
      }
    }

    sum += m[s[i]];
  }

  return sum;
};
