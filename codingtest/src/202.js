/**
 * @param {number} n
 * @return {boolean}
 */
var isHappy = function(n) {
  const set = new Set();

  while (true) {
      if (set.has(n)) return false;        
      set.add(n);
      
      const len = n.toString().length;
      let sum = 0;
      for (let i = 0; i < len; i++) {
          const sq = Number(n.toString()[i]) * Number(n.toString()[i]);
          sum += sq;
      }
      
      if (sum === 1) {
          return true;
      }

      n = sum;
  }
};