package cn.septenary.widget;

import android.util.SparseArray;
import android.view.View;

public class ViewHolder {
    public static <T> T getView(View convertView, int id) {
        SparseArray<View> holder = (SparseArray<View>) convertView.getTag();
        if (holder == null) {
            holder = new SparseArray<>();
            convertView.setTag(holder);
        }
        View view = holder.get(id);
        if (view == null) {
            view = convertView.findViewById(id);
            holder.put(id, view);
        }
        return (T) view;
    }
}