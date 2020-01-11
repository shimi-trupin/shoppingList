package com.trupin.shimi.shoppinglist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ShoppingItemsAdapter extends RecyclerView.Adapter<ShoppingItemsAdapter.ViewHolder> {
    private List<ShoppingItem> shoppingList;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View shoppingItemView = inflater.inflate(R.layout.shopping_item, parent, false);
        return new ViewHolder(shoppingItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final ShoppingItem shoppingItem = shoppingList.get(position);
        CheckBox item = holder.item;
        item.setText(shoppingItem.getName());
        item.setChecked(shoppingItem.getIsChecked());
        TextView description = holder.description;
        description.setText(shoppingItem.getDescription());
    }

    @Override
    public int getItemCount() {
        return shoppingList.size();
    }

    public ShoppingItemsAdapter(List<ShoppingItem> shoppingList) {
        this.shoppingList = shoppingList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public CheckBox item;
        public TextView description;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            item = (CheckBox) itemView.findViewById(R.id.item);
            description = (TextView) itemView.findViewById(R.id.description);
        }
    }
}
