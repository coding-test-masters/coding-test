/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function(s, t) {
  const map = new Map();

  for (let i = 0; i < s.length; i++) {
      const getS = map.get(s[i]);
      if (getS) {
          if (getS === t[i]) {
              continue;
          } else {
              return false;
          }
      } else {
          map.set(s[i], t[i]);
      }
  }

  console.log(map.keys());
  console.log(map.values());
  
  const valuesSet = new Set();
  for (let m of map.values()) {
      if (valuesSet.has(m)) {
          return false;
      }
      valuesSet.add(m);        
  }

  return true;
};