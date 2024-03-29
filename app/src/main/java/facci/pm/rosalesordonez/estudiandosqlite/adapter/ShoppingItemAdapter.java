package facci.pm.rosalesordonez.estudiandosqlite.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

import facci.pm.rosalesordonez.estudiandosqlite.R;
import facci.pm.rosalesordonez.estudiandosqlite.database.model.ShoppingItem;

public class ShoppingItemAdapter extends ArrayAdapter<ShoppingItem> {

    private Context context;
    private ArrayList<ShoppingItem> shoppingItems;

    public ShoppingItemAdapter(Context context, ArrayList<ShoppingItem> shoppingItems) {
        super(context, R.layout.item_list_shopping);
        this.context = context;
        this.shoppingItems = shoppingItems;
    }

    @Override
    public int getCount() {
        return shoppingItems.size();
    }

    @Override
    public ShoppingItem getItem(int position) {
        return  shoppingItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return shoppingItems.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        final ViewHolder viewHolder;

        if (convertView == null || convertView.getTag() == null) {
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(context).inflate(R.layout.item_list_shopping, parent, false);
            viewHolder.mItemName = view.findViewById(R.id.shopping_tv_item_name);
            viewHolder.mDireccion = view.findViewById(R.id.direccion);
            viewHolder.mFecha = view.findViewById(R.id.fecha);
            view.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            view = convertView;
        }

        // Set text with the item name
        viewHolder.mItemName.setText(shoppingItems.get(position).getName());
        viewHolder.mDireccion.setText(shoppingItems.get(position).getDireccion());
        viewHolder.mFecha.setText(shoppingItems.get(position).getFecha());

        return view;
    }

    static class ViewHolder {
        TextView mItemName;
        TextView mDireccion;
        TextView mFecha;
    }
}
