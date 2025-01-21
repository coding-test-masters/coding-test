/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
  let k = 0;
  let cur = 1;
  let count = 1;

  if (nums.length == 1) return k + 1;

  while (cur < nums.length) {
      if (nums[k] === nums[cur]) {
          count++;                                   
      } else {
          count = 1;
      }

      if (count <= 2) {
          k++;
          nums[k] = nums[cur];
      }
      cur++;              
  }

  return k + 1;
};