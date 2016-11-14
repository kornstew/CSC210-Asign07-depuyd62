/*
    Damian Depuy
    CSC 210
    Program solves the 4 ring tower of Hanoi a step at a time and
    displays which top ring of what peg to move to in order to stack
    from smallest to largest, the rings from A to C without any ring stacking on top of a smaller
    ring.
 */
    package com.thelevelgrinder.towerofhanoi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static int MOVES; // keeps track of how many moves for use with nextStep method.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextStep(View view)
    {
        // imageViews represent a particular space on each of the 3 pegs.
        // from top to bottom, pegA= 1,2,3,4 pegB= 5,6,7,8 pegC= 9,10,11,12
        ImageView imageView =(ImageView)findViewById(R.id.imageView);
        ImageView imageView2 = (ImageView)findViewById(R.id.imageView2);
        ImageView imageView3 = (ImageView)findViewById(R.id.imageView3);
        ImageView imageView4 = (ImageView)findViewById(R.id.imageView4);
        // imageView5 isn't used because it doesn't solve for pegB
        ImageView imageView6 = (ImageView)findViewById(R.id.imageView6);
        ImageView imageView7 = (ImageView)findViewById(R.id.imageView7);
        ImageView imageView8 = (ImageView)findViewById(R.id.imageView8);
        ImageView imageView9 = (ImageView)findViewById(R.id.imageView9);
        ImageView imageView10 = (ImageView)findViewById(R.id.imageView10);
        ImageView imageView11 = (ImageView)findViewById(R.id.imageView11);
        ImageView imageView12 = (ImageView)findViewById(R.id.imageView12);

        TextView textView = (TextView)findViewById(R.id.displayMoveTextView); // Displays what top ring to move from and to.
        TextView buttonText = (TextView)findViewById(R.id.button); // button text inital is "next!"

        if(MOVES==0){
            imageView.setImageDrawable(null);
            imageView8.setImageResource(R.drawable.ring1);
            MOVES++;// a to b
            textView.setText("A to B");

            }else
             if(MOVES==1){
                 imageView2.setImageDrawable(null);
                 imageView12.setImageResource(R.drawable.ring2);
                 MOVES++;// a to c
                 textView.setText("A to C");
            }
             else
             if(MOVES==2){
                 imageView8.setImageDrawable(null);
                 imageView11.setImageResource(R.drawable.ring1);
                 MOVES++;// b to c
                 textView.setText("B to C");

             }
             else
             if(MOVES==3){
                 imageView3.setImageDrawable(null);
                 imageView8.setImageResource(R.drawable.ring3);
                 MOVES++;// a to b
                 textView.setText("A to B");

             }
             else
             if(MOVES==4){
                 imageView11.setImageDrawable(null);
                 imageView3.setImageResource(R.drawable.ring1);
                 MOVES++; // c to a
                 textView.setText("C to A");
             }
             else
             if(MOVES==5){
                 imageView12.setImageDrawable(null);
                 imageView7.setImageResource(R.drawable.ring2);
                 MOVES++; // c to b
                 textView.setText("C to B");
             }
             else
             if(MOVES==6){
                 imageView3.setImageDrawable(null);
                 imageView6.setImageResource(R.drawable.ring1);
                 MOVES++; // a to b
                 textView.setText("A to B");
             }
             else
             if(MOVES==7){
                 imageView4.setImageDrawable(null);
                 imageView12.setImageResource(R.drawable.ring4);
                 MOVES++; // a to c
                 textView.setText("A to C");
             }
             else ///
             if(MOVES==8){
                 imageView6.setImageDrawable(null);
                 imageView11.setImageResource(R.drawable.ring1);
                 MOVES++; // b to c
                 textView.setText("B to C");
             }
             else
             if(MOVES==9){
                 imageView7.setImageDrawable(null);
                 imageView4.setImageResource(R.drawable.ring2);
                 MOVES++; //b to a
                 textView.setText("B to A");
             }
             else
             if(MOVES==10){
                 imageView11.setImageDrawable(null);
                 imageView3.setImageResource(R.drawable.ring1);
                 MOVES++; // c to a
                 textView.setText("C to A");
             }
             else //
             if(MOVES==11){
                 imageView8.setImageDrawable(null);
                 imageView11.setImageResource(R.drawable.ring3);
                 MOVES++; // b to c
                 textView.setText("B to C");
             }
             else
             if(MOVES==12){
                 imageView3.setImageDrawable(null);
                 imageView8.setImageResource(R.drawable.ring1);
                 MOVES++; // a to b
                 textView.setText("A to B");
             }
             else
             if(MOVES==13){
                 imageView4.setImageDrawable(null);
                 imageView10.setImageResource(R.drawable.ring2);
                 MOVES++; // a to c
                 textView.setText("A to C");
             }
             else
             if(MOVES==14){
                 imageView8.setImageDrawable(null);
                 imageView9.setImageResource(R.drawable.ring1);
                 MOVES++; // b to c
                 textView.setText("B to C");
                 buttonText.setText("Exit"); // changes button text
                 Toast.makeText(MainActivity.this, "Thanks for watching! Now you can solve the 4 ring tower yourself!", Toast.LENGTH_LONG).show();

             }else
            if(MOVES==15){
                finish(); // terminates app
            }


    }

}
