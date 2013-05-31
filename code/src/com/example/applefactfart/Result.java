package com.example.applefactfart;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Result extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result);
		Intent result=getIntent();
		String name=result.getStringExtra(BeginTest.Name);
		String Score=result.getStringExtra(BeginTest.finalScore);
		TextView dname=(TextView)findViewById(R.id.textView1);
		TextView dscore=(TextView)findViewById(R.id.textView3);
		
		//dname.setText("Hello ");
		dscore.setText(Score);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.result, menu);
		return true;
	}
	public void Replay(View view)
	{
		Intent intent=new Intent(this,MainActivity.class);
		startActivity(intent);
	}
	public void close(View view)
	{
		Intent intent = new Intent(Intent.ACTION_MAIN);
		intent.addCategory(Intent.CATEGORY_HOME);
		intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(intent);
	}
}
