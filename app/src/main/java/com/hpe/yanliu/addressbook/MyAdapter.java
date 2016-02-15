package com.hpe.yanliu.addressbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * 创建自定义的Adapter
 */
public class MyAdapter extends BaseAdapter{
    //需要具体的内容，即集合List<>
    private List<PhoneInfo> lists;
    private Context context;
    private LinearLayout layout;

    public MyAdapter(List<PhoneInfo> lists,Context context){
        this.lists = lists;
        this.context = context;
    }

    //返回的是集合的数量
    @Override
    public int getCount() {
        return lists.size();
    }

    //获取当前集合中的一条数据
    @Override
    public Object getItem(int position) {
        return lists.get(position);
    }

    //id与position相等
    @Override
    public long getItemId(int position) {
        return position;
    }

    //在getView获取要加载的View并且把内容加载到视图中
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //获取加载View的权限
        LayoutInflater inflater = LayoutInflater.from(context);
        //加载
        layout = (LinearLayout) inflater.inflate(R.layout.cell,null);
        TextView nametv =(TextView) layout.findViewById(R.id.name);
        TextView numbertv = (TextView) layout.findViewById(R.id.number);
        nametv.setText(lists.get(position).getName());
        numbertv.setText(lists.get(position).getNumber());
        return layout;
    }
}
