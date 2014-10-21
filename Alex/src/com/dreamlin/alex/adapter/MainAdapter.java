package com.dreamlin.alex.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dreamlin.alex.R;

public class MainAdapter extends BaseAdapter {
	Context context;
	String[] items;
	int[] items_img;

	public MainAdapter(Context context, String[] items, int[] items_img) {
		this.items = items;
		this.context = context;
		this.items_img = items_img;
	}

	public void setContext(Context context) {
		this.context = context;
	}

	@Override
	public int getCount() {
		// 幾個元件
		return items.length;
	}

	@Override
	public Object getItem(int arg0) {

		return null;
	}

	@Override
	public long getItemId(int arg0) {
		return 0;
	}

	@Override
	public View getView(int position, View view, ViewGroup viewgroup) {
		view = LinearLayout.inflate(context, R.layout.item_main, null);
		// view.setId(position);
		TextView textView = (TextView) view.findViewById(R.id.textView2);
		textView.setText(items[position]);
		textView.setTextSize(20);
		ImageView img = (ImageView) view.findViewById(R.id.imageView1);
		img.setImageResource(items_img[position]);
		return view;
	}

}
