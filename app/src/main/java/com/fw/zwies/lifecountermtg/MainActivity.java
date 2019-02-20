package com.fw.zwies.lifecountermtg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button players2;
    Button players4;
    Button life1;
    Button life2;
    Button resetId; //reset 40 life for 2 player
    Button reset202p; //reset 20 life for 2 player

    Button home;

    Button reset404p;
    Button reset204p;

    Button life11;
    Button life12;
    Button life13;
    Button life14;

    //2 player buttons
    Button life1add1;
    Button life2add1;
    Button life1minus1;
    Button life2minus1;
    Button life1add5;
    Button life2add5;
    Button life1minus5;
    Button life2minus5;

    //4 player buttons
    Button life3add1;
    Button life3add5;
    Button life3minus1;
    Button life3minus5;

    Button life4add1;
    Button life4add5;
    Button life4minus1;
    Button life4minus5;

    Button life11add1;
    Button life11add5;
    Button life11minus1;
    Button life11minus5;

    Button life12add1;
    Button life12add5;
    Button life12minus1;
    Button life12minus5;


    int lives1 = 40;
    int lives2= 40;

    int lives11= 40;
    int lives12= 40;
    int lives13= 40;
    int lives14= 40;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        players2 = (Button)findViewById(R.id.player2id);
        players4 = (Button)findViewById(R.id.player4id);
        life1 = (Button)findViewById(R.id.life1);
        life2 = (Button)findViewById(R.id.life2);
        resetId = (Button)findViewById(R.id.reset402p);
        reset202p = (Button)findViewById(R.id.reset202p);
        reset404p = (Button)findViewById(R.id.reset40p4);
        reset204p = (Button)findViewById(R.id.reset20p4);

        home = (Button)findViewById(R.id.home);

        life11 = (Button)findViewById(R.id.life11);
        life12 = (Button)findViewById(R.id.life12);
        life13 = (Button)findViewById(R.id.life13);
        life14 = (Button)findViewById(R.id.life14);

        life1add1 = (Button)findViewById(R.id.life1add1);
        life1add5 = (Button)findViewById(R.id.life1add5);
        life2add1 = (Button)findViewById(R.id.life2add1);
        life2add5 = (Button)findViewById(R.id.life2add5);
        life1minus1 = (Button)findViewById(R.id.life1minus1);
        life1minus5 = (Button)findViewById(R.id.life1minus5);
        life2minus1 = (Button)findViewById(R.id.life2minus1);
        life2minus5 = (Button)findViewById(R.id.life2minus5);

        life3add1 = (Button)findViewById(R.id.life3add1);
        life3add5 = (Button)findViewById(R.id.life3add5);
        life3minus1 = (Button)findViewById(R.id.life3sub1);
        life3minus5 = (Button)findViewById(R.id.life3sub5);

        life4add1 = (Button)findViewById(R.id.life4add1);
        life4add5 = (Button)findViewById(R.id.life4add5);
        life4minus1 = (Button)findViewById(R.id.life4sub1);
        life4minus5 = (Button)findViewById(R.id.life4sub5);

        life11add1 = (Button)findViewById(R.id.life11add1);
        life11add5 = (Button)findViewById(R.id.life11add5);
        life11minus1 = (Button)findViewById(R.id.life11sub1);
        life11minus5 = (Button)findViewById(R.id.life11sub5);

        life12add1 = (Button)findViewById(R.id.life12add1);
        life12add5 = (Button)findViewById(R.id.life12add5);
        life12minus1 = (Button)findViewById(R.id.life12sub1);
        life12minus5 = (Button)findViewById(R.id.life12sub5);

    }

    void fourClicked(View view){

        home.setVisibility(View.VISIBLE);
        players2.setVisibility(View.INVISIBLE);
        players4.setVisibility(View.INVISIBLE);
        reset404p.setVisibility(View.VISIBLE);
        reset204p.setVisibility(View.VISIBLE);

        life11.setVisibility(View.VISIBLE);
        life12.setVisibility(View.VISIBLE);
        life13.setVisibility(View.VISIBLE);
        life14.setVisibility(View.VISIBLE);

        life3add1.setVisibility(View.VISIBLE);
        life3add5.setVisibility(View.VISIBLE);
        life3minus1.setVisibility(View.VISIBLE);
        life3minus5.setVisibility(View.VISIBLE);

        life4add1.setVisibility(View.VISIBLE);
        life4add5.setVisibility(View.VISIBLE);
        life4minus1.setVisibility(View.VISIBLE);
        life4minus5.setVisibility(View.VISIBLE);

        life11add1.setVisibility(View.VISIBLE);
        life11add5.setVisibility(View.VISIBLE);
        life11minus1.setVisibility(View.VISIBLE);
        life11minus5.setVisibility(View.VISIBLE);

        life12add1.setVisibility(View.VISIBLE);
        life12add5.setVisibility(View.VISIBLE);
        life12minus1.setVisibility(View.VISIBLE);
        life12minus5.setVisibility(View.VISIBLE);
    }

    void twoClicked(View view){
        home.setVisibility(View.VISIBLE);
        players2.setVisibility(View.INVISIBLE);
        players4.setVisibility(View.INVISIBLE);
        resetId.setVisibility(View.VISIBLE);
        reset202p.setVisibility(View.VISIBLE);

        life1.setVisibility(View.VISIBLE);
        life2.setVisibility(View.VISIBLE);
        life1add1.setVisibility(View.VISIBLE);
        life2add1.setVisibility(View.VISIBLE);
        life1add5.setVisibility(View.VISIBLE);
        life2add5.setVisibility(View.VISIBLE);
        life1minus1.setVisibility(View.VISIBLE);
        life2minus1.setVisibility(View.VISIBLE);
        life1minus5.setVisibility(View.VISIBLE);
        life2minus5.setVisibility(View.VISIBLE);

    }
    void life12added1(View view){
        lives12 +=1;
        life12.setText(Integer.toString(lives12));
    }
    void life12added5(View view){
        lives12 +=5;
        life12.setText(Integer.toString(lives12));
    }
    void life12subbed1(View view){
        lives12 -=1;
        life12.setText(Integer.toString(lives12));
    }
    void life12subbed5(View view){
        lives12 -=5;
        life12.setText(Integer.toString(lives12));
    }

    void life11added1(View view){
        lives11 +=1;
        life11.setText(Integer.toString(lives11));
    }
    void life11added5(View view){
        lives11 +=5;
        life11.setText(Integer.toString(lives11));
    }
    void life11subbed1(View view){
        lives11 -=1;
        life11.setText(Integer.toString(lives11));
    }
    void life11subbed5(View view){
        lives11 -=5;
        life11.setText(Integer.toString(lives11));
    }

    void life3added1(View view){
        lives13 +=1;
        life13.setText(Integer.toString(lives13));
    }
    void life3added5(View view){
        lives13 +=5;
        life13.setText(Integer.toString(lives13));
    }
    void life3subbed1(View view){
        lives13 -=1;
        life13.setText(Integer.toString(lives13));
    }
    void life3subbed5(View view){
        lives13 -=5;
        life13.setText(Integer.toString(lives13));
    }
    void life4added1(View view){
        lives14 +=1;
        life14.setText(Integer.toString(lives14));
    }
    void life4added5(View view){
        lives14 +=5;
        life14.setText(Integer.toString(lives14));
    }
    void life4subbed1(View view){
        lives14 -=1;
        life14.setText(Integer.toString(lives14));
    }
    void life4subbed5(View view){
        lives14 -=5;
        life14.setText(Integer.toString(lives14));
    }

    void life2sub1(View view){
        lives2 -= 1;
        life2.setText(Integer.toString(lives2));
    }
    void life2sub5(View view){
        lives2 -= 5;
        life2.setText(Integer.toString(lives2));
    }
    void life2plus1(View view){
        lives2 += 1;
        life2.setText(Integer.toString(lives2));
    }
    void life2plus5(View view){
        lives2 += 5;
        life2.setText(Integer.toString(lives2));
    }

    void life1sub1(View view){
        lives1 -= 1;
        life1.setText(Integer.toString(lives1));
    }
    void life1sub5(View view){
        lives1 -= 5;
        life1.setText(Integer.toString(lives1));
    }
    void life1plus1(View view){
        lives1 += 1;
        life1.setText(Integer.toString(lives1));
    }
    void life1plus5(View view){
        lives1 += 5;
        life1.setText(Integer.toString(lives1));
    }

    void reset(View view){
        lives1 = 40;
        lives2 = 40;
        life1.setText(Integer.toString(lives1));
        life2.setText(Integer.toString(lives2));
    }
    void reset20p2(View view){
        lives1 = 20;
        lives2 = 20;
        life1.setText(Integer.toString(lives1));
        life2.setText(Integer.toString(lives2));
    }

    void reset40p4(View view){
        lives11 = 40;
        lives12 = 40;
        lives13 = 40;
        lives14 = 40;
        life11.setText(Integer.toString(lives11));
        life12.setText(Integer.toString(lives12));
        life13.setText(Integer.toString(lives13));
        life14.setText(Integer.toString(lives14));
    }
    void reset20p4(View view){
        lives11 = 20;
        lives12 = 20;
        lives13 = 20;
        lives14 = 20;
        life11.setText(Integer.toString(lives11));
        life12.setText(Integer.toString(lives12));
        life13.setText(Integer.toString(lives13));
        life14.setText(Integer.toString(lives14));
    }

    void homeClicked(View view){
        life11.setVisibility(View.INVISIBLE);
        life12.setVisibility(View.INVISIBLE);
        life13.setVisibility(View.INVISIBLE);
        life14.setVisibility(View.INVISIBLE);

        life3add1.setVisibility(View.INVISIBLE);
        life3add5.setVisibility(View.INVISIBLE);
        life3minus1.setVisibility(View.INVISIBLE);
        life3minus5.setVisibility(View.INVISIBLE);

        life4add1.setVisibility(View.INVISIBLE);
        life4add5.setVisibility(View.INVISIBLE);
        life4minus1.setVisibility(View.INVISIBLE);
        life4minus5.setVisibility(View.INVISIBLE);

        life11add1.setVisibility(View.INVISIBLE);
        life11add5.setVisibility(View.INVISIBLE);
        life11minus1.setVisibility(View.INVISIBLE);
        life11minus5.setVisibility(View.INVISIBLE);

        life12add1.setVisibility(View.INVISIBLE);
        life12add5.setVisibility(View.INVISIBLE);
        life12minus1.setVisibility(View.INVISIBLE);
        life12minus5.setVisibility(View.INVISIBLE);

        resetId.setVisibility(View.INVISIBLE);
        reset202p.setVisibility(View.INVISIBLE);

        life1.setVisibility(View.INVISIBLE);
        life2.setVisibility(View.INVISIBLE);
        life1add1.setVisibility(View.INVISIBLE);
        life2add1.setVisibility(View.INVISIBLE);
        life1add5.setVisibility(View.INVISIBLE);
        life2add5.setVisibility(View.INVISIBLE);
        life1minus1.setVisibility(View.INVISIBLE);
        life2minus1.setVisibility(View.INVISIBLE);
        life1minus5.setVisibility(View.INVISIBLE);
        life2minus5.setVisibility(View.INVISIBLE);

        home.setVisibility(View.INVISIBLE);
        players2.setVisibility(View.VISIBLE);
        players4.setVisibility(View.VISIBLE);
        reset404p.setVisibility(View.INVISIBLE);
        reset204p.setVisibility(View.INVISIBLE);
        lives11 = 40;
        lives12 = 40;
        lives13 = 40;
        lives14 = 40;
        lives1 = 40;
        lives2 = 40;
        life11.setText(Integer.toString(lives11));
        life12.setText(Integer.toString(lives12));
        life13.setText(Integer.toString(lives13));
        life14.setText(Integer.toString(lives14));
        life1.setText(Integer.toString(lives1));
        life2.setText(Integer.toString(lives2));
    }



}
//now its time to do 4player mode!