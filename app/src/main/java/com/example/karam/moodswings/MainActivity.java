package com.example.karam.moodswings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

     private Button angrybtn, confusedbtn, happybtn, quietbtn, smartbtn, surprisedbtn;

     private ImageView moodimage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angrybtn = (Button) findViewById(R.id.angry_btn);

        confusedbtn = (Button) findViewById(R.id.confused_btn);

        happybtn = (Button) findViewById(R.id.happy_btn);

        quietbtn = (Button) findViewById(R.id.quiet_btn);

        smartbtn = (Button) findViewById(R.id.smart_btn);

        surprisedbtn= (Button) findViewById(R.id.surprised_btn);

        moodimage = (ImageView) findViewById(R.id.image);

        View.OnClickListener onbtnclick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(v.getId() == R.id.happy_btn)
                {

                    moodimage.setImageDrawable(getResources().getDrawable(R.drawable.happy));
                }

                if(v.getId() == R.id.angry_btn)
                {

                    moodimage.setImageDrawable(getResources().getDrawable(R.drawable.angry));
                }

                if(v.getId() == R.id.confused_btn)
                {

                    moodimage.setImageDrawable(getResources().getDrawable(R.drawable.confused));
                }

                if(v.getId() == R.id.quiet_btn)
                {

                    moodimage.setImageDrawable(getResources().getDrawable(R.drawable.quiet));
                }

                if(v.getId() == R.id.smart_btn)
                {
                    moodimage.setImageDrawable(getResources().getDrawable(R.drawable.smart));
                }

                if(v.getId() == R.id.surprised_btn)
                {
                    moodimage.setImageDrawable(getResources().getDrawable(R.drawable.surprised));
                }

            }
        };



        angrybtn.setOnClickListener(onbtnclick);
        confusedbtn.setOnClickListener(onbtnclick);
        happybtn.setOnClickListener(onbtnclick);
        quietbtn.setOnClickListener(onbtnclick);
        smartbtn.setOnClickListener(onbtnclick);
        surprisedbtn.setOnClickListener(onbtnclick);

    }
}








