package com.dreamlin.alex.activity;

import com.dreamlin.alex.R;
import com.dreamlin.alex.adapter.DemoAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class Demo extends Activity {
	ListView listView;
	String[] titles = { "�p���", "�i�P�s�t��", "�ʪ�����", "BMI�p�⾹", "�۶�APP" };
	String[] content = { "Java GUI and Android APP", "Java GUI and MySQL",
			"JSP and MySQL", "Android APP", "Android APP" };
	String[] date = { "2014/06/01", "2014/08/01", "2014/08/01", "2014/09/01",
			"2014/10/01" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.demo);

		listView = (ListView) findViewById(R.id.listView1);
		listView.setAdapter(new DemoAdapter(this, titles, content, date));
	}
}
