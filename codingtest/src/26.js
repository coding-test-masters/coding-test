/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function (nums) {
  // [0, 0, 1, 1, 2, 2]
  // When same
  // When different

  let k = 0;

  if (nums.length === 1) return k + 1;

  let cur = 1;

  while (cur < nums.length) {
    if (nums[k] === nums[cur]) {
      cur++;
    } else {
      k++;
      nums[k] = nums[cur];
      cur++;
    }
  }
  return k + 1;
};
