package com.example.billsu.myapplication;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import android.os.Handler;


public class MainActivity extends Activity {
   /* private Handler frame = new Handler();
    private static final int FRAME_RATE = 20;*/
    ImageView Scared_Person;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  Handler h = new Handler();
       // ((Button)findViewById(R.id.the_button)).setOnClickListener(this);
        Scared_Person = (ImageView) findViewById(R.id.Scared_Person);
        Scared_Person.setImageResource(
                R.drawable.sprite);

     /*   h.postDelayed(new Runnable(){
            @Override
                    public void run() {
                        initGfx();
            }
        },1000); */

    }

  /*  synchronized public void initGfx() {
        ((GameBoard)findViewById(R.id.the_canvas)).resetStarField();
        ((Button)findViewById(R.id.the_button)).setEnabled(true);
        frame.removeCallbacks(frameUpdate);
        frame.postDelayed(frameUpdate, FRAME_RATE);
    }

    @Override
    synchronized public void onClick(View v){
        initGfx();
    }

    private Runnable frameUpdate = new Runnable() {
        @Override

    synchronized public void run() {
            frame.removeCallbacks(frameUpdate);
            ((GameBoard)findViewById(R.id.the_canvas)).invalidate();
            frame.postDelayed(frameUpdate,FRAME_RATE);
        }
    };*/
}
