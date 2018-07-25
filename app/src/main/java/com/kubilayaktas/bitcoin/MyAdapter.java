package com.kubilayaktas.bitcoin;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.security.CryptoPrimitive;
import java.util.List;

/**
 * Created by MSI on 24.07.2018 at 16:46.
 */
public class MyAdapter extends RecyclerView.Adapter <MyAdapter.ViewHolder>{
    private List<CryptoCoin> listItems;
    private Context context;

    public MyAdapter(List<CryptoCoin> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_view, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder ViewHolder, int position) {
        CryptoCoin listItem = listItems.get(position);
        ViewHolder.name.setText(listItem.getName());
        ViewHolder.symbol.setText(listItem.getSymbol());
        ViewHolder.id.setText(listItem.getId());
        ViewHolder.rank.setText(listItem.getRank());
        ViewHolder.priceUsd.setText(listItem.getPriceUsd());
        ViewHolder.priceBtc.setText(listItem.getPriceUsd());
        ViewHolder.h_volume_usd.setText(listItem.get_24hVolumeUsd());
        ViewHolder.marketCapUsd.setText(listItem.getMarketCapUsd());
        ViewHolder.available_supply.setText(listItem.getAvailableSupply());
        ViewHolder.max_supply.setText(listItem.getMaxSupply().toString());
        ViewHolder.percent_change_1h.setText(listItem.getPercentChange1h());
        ViewHolder.percent_change_24h.setText(listItem.getPercentChange24h());
        ViewHolder.percent_change_7d.setText(listItem.getPercentChange7d());
        ViewHolder.lastUpdated.setText(listItem.getLastUpdated());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView name, symbol, id, rank, priceUsd, priceBtc, h_volume_usd;
        public TextView marketCapUsd, available_supply, max_supply, percent_change_1h;
        public TextView percent_change_24h, percent_change_7d, lastUpdated;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            symbol = (TextView) itemView.findViewById((R.id.symbol));
            id = (TextView) itemView.findViewById((R.id.id));
            rank = (TextView) itemView.findViewById((R.id.rank));
            priceUsd = (TextView) itemView.findViewById((R.id.priceUsd));
            priceBtc = (TextView) itemView.findViewById((R.id.priceBtc));
            h_volume_usd = (TextView) itemView.findViewById((R.id.h_volume_usd));
            marketCapUsd = (TextView) itemView.findViewById((R.id.marketCapUsd));
            available_supply = (TextView) itemView.findViewById((R.id.available_supply));
            max_supply = (TextView) itemView.findViewById((R.id.max_supply));
            percent_change_1h = (TextView) itemView.findViewById((R.id.percent_change_1h));
            percent_change_24h = (TextView) itemView.findViewById((R.id.percent_change_24h));
            percent_change_7d = (TextView) itemView.findViewById((R.id.percent_change_7d));
            lastUpdated = (TextView) itemView.findViewById((R.id.lastUpdated));
        }
    }
}
