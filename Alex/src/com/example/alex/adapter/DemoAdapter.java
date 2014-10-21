package com.example.alex.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.alex.R;

public class DemoAdapter extends BaseAdapter{
	String[] titles;
	Context context;
	
	public DemoAdapter(Context context, String[] titles) {
		// TODO Auto-generated constructor stub
		this.titles = titles;
		this.context = context;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return titles.length;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View view, ViewGroup arg2) {
		// TODO Auto-generated method stub
		Holder holder;
		if(view==null){
			view = LinearLayout.inflate(context, R.layout.item_demo, null);
			holder = new Holder();
			holder.title = (TextView)view.findViewById(R.id.textView1);
			holder.img = (ImageView)view.findViewById(R.id.imageView2);
			view.setTag(holder);
			
//			TextView title = (TextView)view.findViewById(R.id.textView1);
		}else{
			holder = (Holder) view.getTag();
		}
		
		holder.title.setText(titles[position]);
		holder.img.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				((Activity)context).finish();
			}
		});
		
		return view;
	}

	class Holder{
		TextView title;
		ImageView img;
	}
}
