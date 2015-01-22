package com.lwz.letterbarview.sample;

/**
 * Created by yangfeng on 15/1/22.
 */

import android.util.SparseArray;
import android.view.View;

public class ViewHolder {

    @SuppressWarnings("unchecked")
    public static <T extends View> T getView(View convertView, int id) {

        SparseArray<View> holder = (SparseArray<View>) convertView.getTag();
        if( holder == null ) {
            holder = new SparseArray<View>();
            convertView.setTag(holder);
        }

        View view = holder.get(id);
        if( view == null ) {
            view = convertView.findViewById(id);
            holder.put(id, view);
        }
        return (T)view;
    }
}
