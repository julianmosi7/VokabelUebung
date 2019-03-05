package com.calculate.vokabeluebung;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapBaseAdapter extends BaseAdapter {
    private Map<String, List>  map = new HashMap<>();
    private int layoutId;
    private LayoutInflater inflater;

    public HashMapBaseAdapter(Context ctx, int layoutId, Map<String, List> map) {
        this.map = map;
        this.layoutId = layoutId;
        this.inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return map.size();
    }

    @Override
    public Object getItem(int position) {
        return map.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
