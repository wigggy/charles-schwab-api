package com.github.wigggy.charlesschwab_api.data_objs


data class StockQuote(
    val assetMainType: String,
    val assetSubType: String,
    val quoteType: String,
    val realtime: Boolean,
    val ssid: Long,
    val symbol: String,

    val avg10DaysVolume: Long,
    val avg1YearVolume: Long,
    val divAmount: Double,
    val divFreq: Int,
    val divPayAmount: Double,
    val divYield: Double,
    val eps: Double,
    val fundLeverageFactor: Double,
    val lastEarningsDate: String,
    val peRatio: Double,

    val week52High: Double,
    val week52Low: Double,
    val askMICId: String,
    val askPrice: Double,
    val askSize: Int,
    val askTime: Long,
    val bidMICId: String,
    val bidPrice: Double,
    val bidSize: Int,
    val bidTime: Long,
    val closePrice: Double,
    val highPrice: Double,
    val lastMICId: String,
    val lastPrice: Double,
    val lastSize: Int,
    val lowPrice: Double,
    val mark: Double,
    val markChange: Double,
    val markPercentChange: Double,
    val netChange: Double,
    val netPercentChange: Double,
    val openPrice: Double,
    val postMarketChange: Double,
    val postMarketPercentChange: Double,
    val quoteTime: Long,
    val securityStatus: String,
    val totalVolume: Long,
    val tradeTime: Long,

    val cusip: String,
    val description: String,
    val exchange: String,
    val exchangeName: String,
    val isHardToBorrow: Boolean,
    val isShortable: Boolean,
    val htbRate: Double,

    val regularMarketLastPrice: Double,
    val regularMarketLastSize: Long,
    val regularMarketNetChange: Double,
    val regularMarketPercentChange: Double,
    val regularMarketTradeTime: Long
)


