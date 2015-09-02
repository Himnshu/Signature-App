package com.smoketech.Mysignature;



import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MysignatureActivity extends Activity {
	EditText name;
	TextView text;
	Button create;
	Button pre,next;
	Typeface face,face1,face2,face3,face4,face5,face6,face7,face8;
	int position=0;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign);
        face = Typeface.createFromAsset(getAssets(),"fonts/atmostsphere.ttf");
        face1 = Typeface.createFromAsset(getAssets(),"fonts/doridrobot.ttf");
        face2 = Typeface.createFromAsset(getAssets(),"fonts/Flubber.ttf");
        face3 = Typeface.createFromAsset(getAssets(),"fonts/HONEY.TTF");
        face4 = Typeface.createFromAsset(getAssets(),"fonts/Dreamwish.ttf");
        face5 = Typeface.createFromAsset(getAssets(),"fonts/First Crush.ttf");
        face6 = Typeface.createFromAsset(getAssets(),"fonts/lokicola.ttf");
        face7 = Typeface.createFromAsset(getAssets(),"fonts/ROMANTIC.TTF");
        face8 = Typeface.createFromAsset(getAssets(),"fonts/Words of love.ttf");
        name=(EditText)findViewById(R.id.edt_edid);
        text=(TextView)findViewById(R.id.textView1);
        create=(Button)findViewById(R.id.btn_create);
        pre=(Button)findViewById(R.id.pre);
        next=(Button)findViewById(R.id.next);
        final Typeface array[]={face,face1,face2,face3,face4,face5,face6,face7,face8};
        text.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			Toast.makeText(getApplicationContext(), "Enter Text", Toast.LENGTH_LONG).show();
			}
		});
    	create.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				String s=name.getText().toString();
	        	text.setText(s);
	        	text.setTypeface(array[position]);
	   
			}
		});
    	pre.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				position++;
				if (position > array.length-1) {
					position = 0;
				}
				text.setTypeface(array[position]);
				
			}
		});
    	next.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				position++;
				if (position > array.length -1) {
					position = 0;
				}	
				text.setTypeface(array[position]);
				
			}
		});

    }
}