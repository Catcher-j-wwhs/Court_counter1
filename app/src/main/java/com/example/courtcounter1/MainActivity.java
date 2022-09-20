package com.example.courtcounter1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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



    public void threepointer(){
        scoreA+=3;
        displayForTeamA(scoreA);
    }
    public void twopointer(){
        scoreA+=2;
        displayForTeamA(scoreA);

    }
    public void freethrow()
    {
        scoreA++;
        displayForTeamA(scoreA);
    }
    public void threepointerB(){
        scoreB+=3;
        displayForTeamA(scoreB);
    }
    public void twopointerB(){
        scoreB+=2;
        displayForTeamA(scoreB);

    }
    public void freethrowB()
    {
        scoreB++;
        displayForTeamA(scoreB);
    }

    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}