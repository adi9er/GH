package com.example.billsu.ghosthunter;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import android.os.Handler;

import java.util.ArrayList;


public class MainActivity extends Activity {
   /* private Handler frame = new Handler();
    private static final int FRAME_RATE = 20;*/
    ImageView Scared_Person;
    Person guy;
    ArrayList<Rect> obstacles;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  Handler h = new Handler();
       // ((Button)findViewById(R.id.the_button)).setOnClickListener(this);
        Scared_Person = (ImageView) findViewById(R.id.Scared_Person);
        Scared_Person.setImageResource(
                R.drawable.thresh);
        guy = new Person((double) Scared_Person.getX(), (double) Scared_Person.getY(), (double) Scared_Person.getWidth(), (double) Scared_Person.getHeight());


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
  public boolean onTouchEvent(MotionEvent event){
      try {
          Thread.sleep(50);
      } catch (InterruptedException e){
          e.printStackTrace();
      }

      if (event.getAction() == MotionEvent.ACTION_UP == false){

          //GUY MOVES HERE

          guy.setTarget((double) event.getX(), (double) event.getY());
          guy.move();
          Log.i("Guy:","Guy is now at " + guy.getX() + ",  " + guy.getY());

//          for(Rect obs: obstacles){
//              if(guy.getHitbox().intersects(guy.getHitbox(), obs)) {
//                  guy.setTarget(-(double) event.getX(), -(double) event.getY());
//                  guy.move();
//
//              }
//
//          }

          //IMAGE MATCHES GUY HERE

          Scared_Person.setX((float) guy.getX());
          Scared_Person.setY((float) guy.getY());
          Log.i("image:", "now at "+ Scared_Person.getX() +", " + Scared_Person.getY());
;

      }

      return true;
  }


}
