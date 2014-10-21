package com.dreamlin.alex.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dreamlin.alex.R;

public class SkillAdapter extends BaseAdapter {
	String[] titles;
	Context context;
	int[] imgTitles;
	String[] content;

	public SkillAdapter(Context context, String[] titles, int[] imgTitles,
			String[] content) {
		this.context = context;
		this.titles = titles;
		this.imgTitles = imgTitles;
		this.content = content;
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
		if (view == null) {
			view = LinearLayout.inflate(context, R.layout.item_skill, null);
			holder = new Holder();
			holder.title = (TextView) view.findViewById(R.id.textView1);
			holder.imgTitle = (ImageView) view.findViewById(R.id.img1);
			holder.img = (ImageView) view.findViewById(R.id.imageView2);
			holder.content = (TextView) view.findViewById(R.id.txv2);
			view.setTag(holder);

		} else {
			holder = (Holder) view.getTag();
		}
		holder.imgTitle.setImageResource(imgTitles[position]);
		// holder.imgTitle.setBackgroundResource(imgTitles[position]);
		holder.title.setText(titles[position]);
		holder.content.setText(content[position]);
		// holder.img.setOnClickListener(new OnClickListener() {
		//
		// @Override
		// public void onClick(View arg0) {
		// // TODO Auto-generated method stub
		// ((Activity) context).finish();
		// }
		// });

		return view;
	}

	class Holder {
		TextView title;
		ImageView img;
		ImageView imgTitle;
		TextView content;
	}
}
