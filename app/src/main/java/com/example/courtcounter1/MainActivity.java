package com.example.courtcounter1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.courtcounter1.R;




public class MainActivity extends AppCompatActivity {

    public int scoreA= 0;
    public int scoreB= 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void reset(View v) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

    public void threepointer(View v){
        scoreA+=3;
        displayForTeamA(scoreA);
    }
    public void twopointer(View v){
        scoreA+=2;
        displayForTeamA(scoreA);

    }
    public void freethrow(View v)
    {
        scoreA++;
        displayForTeamA(scoreA);
    }
    public void threepointerB(View v){
        scoreB+=3;
        displayForTeamB(scoreB);
    }
    public void twopointerB(View v){
        scoreB+=2;
        displayForTeamB(scoreB);

    }
    public void freethrowB(View v)
    {
        scoreB++;
        displayForTeamB(scoreB);
    }

    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}