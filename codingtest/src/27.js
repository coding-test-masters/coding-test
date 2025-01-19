/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function (nums, val) {
  let i = 0;
  let cur = nums.length - 1;

  while (true) {
    while (cur >= i) {
      if (nums[cur] !== val) {
        break;
      }
      cur--;
    }

    while (cur >= i) {
      if (nums[i] === val) {
        break;
      }
      i++;
    }

    if (cur <= i) {
      break;
    }

    // swap
    const temp = nums[i];
    nums[i] = nums[cur];
    nums[cur] = temp;
  }

  return i;
};
