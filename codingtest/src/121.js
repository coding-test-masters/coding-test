/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
  let minPrice = Infinity;
  let maxProfit = 0;

  for (let i = 0; i < prices.length; i++) {
      minPrice = Math.min(minPrice, prices[i]);
      const price = prices[i] - minPrice;
      maxProfit = Math.max(maxProfit, price);
  }

  return maxProfit;
};