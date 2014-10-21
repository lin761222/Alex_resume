package com.example.alex.activity;

import com.example.alex.R;
import com.example.alex.adapter.MainAdapter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.GridView;

public class MainActivity extends Activity implements OnItemClickListener {
	final String TAG = getClass().getName();
	GridView gridView;
	String[] items = { "基本資料", "專業技能", "作品集", "聯繫我" };
	int[] items_img = { R.drawable.information, R.drawable.skill,
			R.drawable.demo, R.drawable.jobs };
	final int information = 0;
	final int skill = 1;
	final int demo = 2;
	final int contact = 3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		gridView = (GridView) findViewById(R.id.gridView1);
		// MainAdapter mainAdapter = new MainAdapter(this, items);
		// gridView.setAdapter(mainAdapter);
		gridView.setAdapter(new MainAdapter(this, items, items_img));
		gridView.setOnItemClickListener(this);

		// String a = null;
		// a.equals(null);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
		// Log.e(TAG, "select:"+position);

		switch (position) {

		case information:
			// Log.d("Select", position+"");
			Intent intent = new Intent(MainActivity.this, Information.class);
			startActivity(intent);
			break;
		case skill:
			intent = new Intent(MainActivity.this, Skill.class);
			startActivity(intent);
			break;

		case demo:
			intent = new Intent(MainActivity.this, Demo.class);
			startActivity(intent);
			break;
		case contact:
			intent = new Intent(MainActivity.this, Contact.class);
			startActivity(intent);
			break;
		default:
			break;
		}
	}

	// @Override
	// public void onNothingSelected(AdapterView<?> arg0) {
	// // TODO Auto-generated method stub
	//
	// }
	//
	// @Override
	// public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long
	// arg3) {
	// // TODO Auto-generated method stub
	//
	// }

}
