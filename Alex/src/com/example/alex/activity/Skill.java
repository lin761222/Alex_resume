package com.example.alex.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.alex.R;
import com.example.alex.adapter.DemoAdapter;
import com.example.alex.adapter.SkillAdapter;

public class Skill extends Activity {
	ListView listView;
	String[] titles = { "Java WEB", "DateBase", "Android APP", "Front-End" };
	String[] content = { "JSP , Hibernate , Spring , Struct",
			"MySQL , MSSQL , SQLite", "Native code , Android SDK",
			"HTML5 , CSS3 , JavaScrpit" };
	int[] imgTitles = { R.drawable.java2, R.drawable.db, R.drawable.android,
			R.drawable.front_end };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.skill);

		listView = (ListView) findViewById(R.id.lv1);
		listView.setAdapter(new SkillAdapter(this, titles, imgTitles, content));
	}

}
