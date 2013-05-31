package com.example.applefactfart;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class BeginTest extends Activity {
	
	public static int Score=0,number;
	public static String Name,finalScore;
	public String q1="1.A guy named Ronald Wayne founded Apple with Jobs and Wozniak but sold them his share for $800.";
	public String q2="2.Apple founders Steve Jobs and Steve Wozniak met at summer camp when they were teenagers.";
	public String q3="3.The first Apple I computer cost $666.66.";
	public String q4="4.A computer called the \"Lisa\" was supposed to be Apple's flagship model, but it failed and was replaced by the Macintosh";
	public String q5="5.One day in 1991, half of Apple's employees quit because the atmosphere had become \"too corporate.\"";
	public String q6="6.The original Apple logo featured Sir Isaac Newton under an apple tree.";
	public String q7="7.Apple still makes most of its money from computers";
	public String q8="8.Apple co-founder Steve Wozniak would like to become a citizen of Australia.";
	public String q9="9.The first Macintosh, released in 1984, had a whopping 128 kilobytes of system memory";
	public String q10="10.Apple co-founder Steve Wozniak once made the statement that “Steve (Jobs) didn’t know very much about electronics.”";
	public String q11="11.In 1996, Apple was named the country’s worst-run company.";
	public String q12="12.Apple's early success was based on its invention of graphical user interface (GUI) technology.";
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_begin_test);
		Score=0;number=1;
		Intent intent=getIntent();
		 Name=intent.getStringExtra(MainActivity.NAME);
		TextView nameandscore=(TextView)findViewById(R.id.NameAndScore);
		TextView textview=(TextView)findViewById(R.id.textView1);
		nameandscore.setText("hello:");
		textview.setText(Name);
		shownextquestion();
		
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.begin_test, menu);
		return true;
	}
public void fact(View view)
{
	switch(number)
	{
	case 1: case 3: case 4: case 6: case 8: case 9: case 10: case 11:
		Score++;
		Toast.makeText(this,"correct!!" ,Toast.LENGTH_LONG).show();
		break;
		default:Toast.makeText(this,"your guess is wrong!!" ,Toast.LENGTH_SHORT).show();
	}
	
	if(number==12)
		finish();
	number++;
	shownextquestion();
}
public void fart(View view)
{
	switch(number)
	{
	case 2: case 5: case 7:  case 12: 
		Score++;
		Toast.makeText(this,"correct!!" ,Toast.LENGTH_LONG).show();
		break;
		default:Toast.makeText(this,"your guess is wrong!!" ,Toast.LENGTH_SHORT).show();
	}
		if(number==12)
			finish();
		number++;
		shownextquestion();
	
}
public void finish()
{
	Intent result=new Intent(this,Result.class);
	finalScore=String.valueOf(Score);
	result.putExtra(Name,Name);
	result.putExtra(finalScore, finalScore);
	startActivity(result);	
	
}
public void shownextquestion()
{
	TextView question=(TextView)findViewById(R.id.Question);
	switch(number)
	{
	case 1:question.setText(q1);
			break;
	case 2:question.setText(q2);
			break;
	case 3:question.setText(q3);
			break;
	case 4:question.setText(q4);
			break;
	case 5:question.setText(q5);
			break;
	case 6:question.setText(q6);
			break;
	case 7:question.setText(q7);
			break;
	case 8:question.setText(q8);
			break;
	case 9:question.setText(q9);
			break;
	case 10:question.setText(q10);
			break;
	case 11:question.setText(q11);
			break;
	case 12:question.setText(q12);
			break;
	}
}
}
