package com.example.alex.activity;

import com.example.alex.R;
import com.example.alex.adapter.DemoAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class Demo extends Activity{
	ListView listView;
	String[] titles = {"1","2","3"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.demo);
		
		listView = (ListView)findViewById(R.id.listView1);
		listView.setAdapter(new DemoAdapter(this, titles));
	}
}
