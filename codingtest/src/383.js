/**
 * @param {string} ransomNote
 * @param {string} magazine
 * @return {boolean}
 */
var canConstruct = function(ransomNote, magazine) {
  const arr = [];
  for (let i = 0; i < magazine.length; i++) {
      arr.push(magazine[i]);
  }

  for (let i = 0; i < ransomNote.length; i++) {
      const r = ransomNote[i];
      const firstIndex = arr.indexOf(r);
      if (firstIndex !== -1) {            
          arr.splice(firstIndex, 1);
      } else {
          return false;
      }
  }
  return true;
};