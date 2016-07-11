package com.cloudhome.game2048;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv_score;


    public void clearScore(){
        score = 0;
        showScore();
    }

    public void showScore(){
        tv_score.setText(score + "");
    }

    public void addScore(int s){
        score += s;
        showScore();
    }

    private int score = 0;
    private static MainActivity mainActivity = null;

    public static MainActivity getMainActivity() {
        return mainActivity;
    }

    public MainActivity(){
        mainActivity = this;

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_score = (TextView) findViewById(R.id.tv_score);

    }

}

