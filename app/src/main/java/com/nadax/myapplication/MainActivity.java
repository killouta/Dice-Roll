package com.nadax.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View ;
import android.widget.ImageView;
import android.widget.Toast;
import java.util.Random ;
public class MainActivity extends AppCompatActivity {


    int resIds[] = {R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};


    public void buttonPressed (View view) {
         ImageView leftImage = findViewById(R.id.leftDice);
         ImageView rightImage = findViewById(R.id.reightDice);
        int x = getRandomNumberInRange( 1 ,6);
        int y = getRandomNumberInRange( 1 ,6);
        leftImage.setImageResource(resIds[x-1]);
        rightImage.setImageResource(resIds[y-1]);

    }
    private  int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
