package hello.array

fun maxProfit(prices: IntArray): Int{
    var maxProfit = 0
    var minPrice = prices[0]

    for (price in prices){
        minPrice = minPrice.coerceAtMost(price)
        maxProfit = maxProfit.coerceAtMost(price - minPrice)
    }
    return maxProfit
}