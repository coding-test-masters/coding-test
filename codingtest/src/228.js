/**
 * @param {number[]} nums
 * @return {string[]}
 */
var summaryRanges = function(nums) {
  const arr = [];
  
  if (nums.length === 0) { return [] }

  let start = nums[0];
  let end = nums[0];

  for (let i = 1; i < nums.length; i++) {
      if (nums[i] - nums[i - 1] > 1) {
          end = nums[i - 1];
          arr.push(makeRangeString(start, end));
          start = nums[i];
          end = nums[i];
      } else {
          end = nums[i];
      }
  }

  arr.push(makeRangeString(start, end));

  return arr;
};

const makeRangeString = (start, end) => {
  if (start === end) {
      return start.toString();
  } else {
      return `${start}->${end}`;
  }    
}