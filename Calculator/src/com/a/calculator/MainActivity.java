package com.a.calculator;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	String first_number = "";
	String second_number = "";
	String final_result = "";
	boolean number1 = true;
	boolean number2 = false;
	boolean add = false;
	boolean sub = false;
	boolean mul = false;
	boolean div = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final TextView tv = (TextView) findViewById(R.id.textView1);
		Button b0 = (Button) findViewById(R.id.button0);
		Button b1 = (Button) findViewById(R.id.button1);
		Button b2 = (Button) findViewById(R.id.button2);
		Button b3 = (Button) findViewById(R.id.button3);
		Button b4 = (Button) findViewById(R.id.button4);
		Button b5 = (Button) findViewById(R.id.button5);
		Button b6 = (Button) findViewById(R.id.button6);
		Button b7 = (Button) findViewById(R.id.button7);
		Button b8 = (Button) findViewById(R.id.button8);
		Button b9 = (Button) findViewById(R.id.button9);
		// -------------------functoin buttons----------
		Button bAdd = (Button) findViewById(R.id.button10);
		Button bSubtract = (Button) findViewById(R.id.button11);
		Button bMultiply = (Button) findViewById(R.id.button12);
		Button bDivision = (Button) findViewById(R.id.button13);
		Button bEqual = (Button) findViewById(R.id.button14);
		Button bClr = (Button) findViewById(R.id.button15);

		b0.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tv.toString() != "") {
					tv.append("0");
					// current_number.concat("0");
				} else {
					tv.setText("0");
					// current_number = "0";
				}

			}
		});

		b1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tv.toString() != "") {
					tv.append("1");
					// current_number.concat("1");
				} else {
					tv.setText("1");
					// current_number = "1";
				}
			}
		});

		b2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tv.toString() != "") {
					tv.append("2");
					// current_number.concat("2");
				} else {
					tv.setText("2");
					// current_number = "2";
				}
			}
		});

		b3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tv.toString() != "") {
					tv.append("3");
					// current_number.concat("3");
				} else {
					tv.setText("3");
					// current_number = "3";
				}
			}
		});

		b4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tv.toString() != "") {
					tv.append("4");
					// current_number.concat("4");
				} else {
					tv.setText("4");
					// current_number = "4";
				}
			}
		});

		b5.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tv.toString() != "") {
					tv.append("5");
					// current_number.concat("5");
				} else {
					tv.setText("5");
					// current_number = "5";
				}
			}
		});

		b6.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tv.toString() != "") {
					tv.append("6");
					// current_number.concat("6");
				} else {
					tv.setText("6");
					// current_number = "6";
				}
			}
		});

		b7.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tv.toString() != "") {
					tv.append("7");
					// current_number.concat("7");
				} else {
					tv.setText("7");
					// current_number = "7";
				}
			}
		});

		b8.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tv.toString() != "") {
					tv.append("8");
					// current_number.concat("8");
				} else {
					tv.setText("8");
					// current_number = "8";
				}
			}
		});

		b9.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tv.toString() != "") {
					tv.append("9");
					// current_number.concat("9");
				} else {
					tv.setText("9");
					// current_number = "9";
				}
			}
		});

		// functions click listener

		bAdd.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tv.toString() != "") {
					first_number = tv.getText().toString();
					System.out.println(first_number);
					number1 = false;
					number2 = true;
					tv.setText("");
					add = true;
				} else {
					Toast t1 = Toast.makeText(MainActivity.this,
							" Please enter numbers to add", 5000);

				}
			}
		});

		bSubtract.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tv.toString() != "") {
					first_number = tv.getText().toString();
					number1 = false;
					number2 = true;
					tv.setText("");
					sub = true;
				} else {
					Toast t2 = Toast.makeText(MainActivity.this,
							" Please enter numbers to subtract", 5000);

				}
			}
		});

		bMultiply.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tv.toString() != "") {
					first_number = tv.getText().toString();
					number1 = false;
					number2 = true;
					tv.setText("");
					mul = true;
				} else {
					Toast t3 = Toast.makeText(MainActivity.this,
							" Please enter numbers to multiply", 5000);

				}
			}
		});

		bDivision.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tv.toString() != "") {
					first_number = tv.getText().toString();
					number1 = false;
					number2 = true;
					tv.setText("");
					div = true;
				} else {
					Toast t4 = Toast.makeText(MainActivity.this,
							" Please enter numbers to divide", 5000);

				}
			}
		});

		bEqual.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tv.toString() != "") {
					second_number = tv.getText().toString();
					number1 = true;
					number2 = false;
					int s = 0;

					if (add == true) {
						s = Integer.parseInt(first_number)
								+ Integer.parseInt(second_number);
						final_result = Integer.toString(s);

					} else if (sub == true) {

						s = Integer.parseInt(first_number)
								- Integer.parseInt(second_number);
						final_result = Integer.toString(s);
					} else if (mul == true) {

						s = Integer.parseInt(first_number)
								* Integer.parseInt(second_number);
						final_result = Integer.toString(s);
					} else if (div == true) {

						s = Integer.parseInt(first_number)
								/ Integer.parseInt(second_number);
						final_result = Integer.toString(s);
					} else {
						Toast t5 = Toast.makeText(MainActivity.this,
								" Sorry,something wrong.", 5000);

					}

					add = false;
					sub = false;
					mul = false;
					div = false;
					tv.setText(final_result);
				} else {
					Toast t6 = Toast.makeText(MainActivity.this,
							" Please enter numbers to calculate", 5000);

				}
			}
		});

		
		
		bClr.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				first_number ="";
				second_number="";
				tv.setText("");

				add = false;
				sub = false;
				mul = false;
				div = false;
				
				String final_result = "";
				boolean number1 = true;
				boolean number2 = false;
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
