package com.example.alex.activity;

import java.lang.ref.PhantomReference;

import com.example.alex.R;
import com.example.alex.R.id;
import com.example.alex.R.layout;
import com.example.alex.R.menu;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;

public class Contact extends Activity implements OnClickListener {
	WebView wv;
	final int GMAIL = R.id.btn1;
	final int PHONE = R.id.btn2;
	final int FB = R.id.btn3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contact);

		wv = (WebView) findViewById(R.id.webView1);
		// 縮放功能
		wv.getSettings().setBuiltInZoomControls(true);
		// JS效果
		wv.getSettings().setJavaScriptEnabled(true);
		// 顯示縮放小工具
		wv.invokeZoomPicker();

		// 建立超連結
		wv.setWebViewClient(new WebViewClient());
		wv.setWebChromeClient(new WebChromeClient() {
			public void onProgressChanged(WebView view, int progress) {
				setProgress(progress * 100);
			}
		});
		wv.loadUrl("http://ppt.cc/NE3G");

		ImageButton ibtn1 = (ImageButton) findViewById(R.id.btn1);
		ImageButton ibtn2 = (ImageButton) findViewById(R.id.btn2);
		ImageButton ibtn3 = (ImageButton) findViewById(R.id.btn3);
		ibtn1.setOnClickListener(this);
		ibtn2.setOnClickListener(this);
		ibtn3.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.contact, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		Intent it = new Intent(Intent.ACTION_VIEW);
		switch (v.getId()) {
		case GMAIL:
			it.setData(Uri.parse("mailto:alex.chen1222@gmail.com"));
			// 主旨
			it.putExtra(Intent.EXTRA_SUBJECT, "請輸入主旨");
			// 內文
			it.putExtra(Intent.EXTRA_TEXT, "請輸入內文");
			break;
		case PHONE:
			it.setData(Uri.parse("tel:0913922152"));
			break;
		case FB:
			it.setData(Uri.parse("http://ppt.cc/pOZx"));
			break;
		}
		startActivity(it);
	}

}
