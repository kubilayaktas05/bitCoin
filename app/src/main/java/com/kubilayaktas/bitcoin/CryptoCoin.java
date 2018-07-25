package com.kubilayaktas.bitcoin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CryptoCoin {

    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("symbol")
    @Expose
    public String symbol;
    @SerializedName("rank")
    @Expose
    public String rank;
    @SerializedName("price_usd")
    @Expose
    public String priceUsd;
    @SerializedName("price_btc")
    @Expose
    public String priceBtc;
    @SerializedName("24h_volume_usd")
    @Expose
    public String _24hVolumeUsd;
    @SerializedName("market_cap_usd")
    @Expose
    public String marketCapUsd;
    @SerializedName("available_supply")
    @Expose
    public String availableSupply;
    @SerializedName("total_supply")
    @Expose
    public String totalSupply;
    @SerializedName("max_supply")
    @Expose
    public Object maxSupply;
    @SerializedName("percent_change_1h")
    @Expose
    public String percentChange1h;
    @SerializedName("percent_change_24h")
    @Expose
    public String percentChange24h;
    @SerializedName("percent_change_7d")
    @Expose
    public String percentChange7d;
    @SerializedName("last_updated")
    @Expose
    public String lastUpdated;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getRank() {
        return rank;
    }

    public String getPriceUsd() {
        return priceUsd;
    }

    public String getPriceBtc() {
        return priceBtc;
    }

    public String get_24hVolumeUsd() {
        return _24hVolumeUsd;
    }

    public String getMarketCapUsd() {
        return marketCapUsd;
    }

    public String getAvailableSupply() {
        return availableSupply;
    }

    public String getTotalSupply() {
        return totalSupply;
    }

    public Object getMaxSupply() {
        return maxSupply;
    }

    public String getPercentChange1h() {
        return percentChange1h;
    }

    public String getPercentChange24h() {
        return percentChange24h;
    }

    public String getPercentChange7d() {
        return percentChange7d;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }
}