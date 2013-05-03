package com.mkyong.android;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Context;
import android.content.Intent;

//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;

public class WebViewActivity extends Activity {

	private WebView webView;
	
	private Button buttonDaily;
	private Button buttonMonthly;
	private Button buttonYearly;

	private String url = "http://premastrologer.com/";
	private String dailyParam = "/pages/geminidaily.php?typedata=Aspect";
	private String monthlyParam = "/pages/geminimonthly.php";
	private String yearParam = "/pages/yearlyforecast.php#cancer";
	

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.webview);
		


		webView = (WebView) findViewById(R.id.webView1);
		webView.getSettings().setJavaScriptEnabled(true);
		
		//webView.loadUrl("http://www.google.com");
	
		
		webView.loadUrl(url);
		
		buttonDaily = (Button) findViewById(R.id.buttonDaily);
		
				buttonDaily.setOnClickListener(new OnClickListener() {
		
					@Override
					public void onClick(View arg0) {
						
						webView.loadUrl(url+dailyParam);
					}
		
				});
				
		buttonMonthly = (Button) findViewById(R.id.buttonMonthly);
				
		buttonMonthly.setOnClickListener(new OnClickListener() {
		
					@Override
					public void onClick(View arg0) {
		
						webView.loadUrl(url+monthlyParam);
					}
		
				});
		
		buttonYearly = (Button) findViewById(R.id.buttonYearly);
		
		buttonYearly.setOnClickListener(new OnClickListener() {
		
					@Override
					public void onClick(View arg0) {
		
						webView.loadUrl(url+yearParam);
					}
		
				});		


	}

}