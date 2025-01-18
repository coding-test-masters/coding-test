/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function (nums1, m, nums2, n) {
  let nums3 = [];
  for (let i = 0; i < m; i++) {
    nums3.push(nums1[i]);
  }

  let i2 = 0;
  let i3 = 0;
  let i1 = 0; // combined index
  while (i2 < n || i3 < m) {
    if (i2 === n) {
      nums1[i1] = nums3[i3];
      i3++;
      i1++;
      continue;
    }
    if (i3 === m) {
      nums1[i1] = nums2[i2];
      i2++;
      i1++;
      continue;
    }

    if (nums2[i2] < nums3[i3]) {
      nums1[i1] = nums2[i2];
      i2++;
      i1++;
    } else {
      nums1[i1] = nums3[i3];
      i3++;
      i1++;
    }
  }
};
