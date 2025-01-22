/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
  const a = {};
  for (let i = 0; i < nums.length; i++) {
      const num = nums[i];
      if (a[num]) {
          a[num] = a[num] + 1;
      } else {
          a[num] = 1;
      }
  }

  for (const item of Object.entries(a)) {
      if (item[1] >= nums.length / 2) {
          return parseInt(item[0]);
      }
  }
  return 0;
};