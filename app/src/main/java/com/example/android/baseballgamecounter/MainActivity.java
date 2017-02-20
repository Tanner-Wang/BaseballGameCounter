package com.example.android.baseballgamecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int sumScoreForA;
    int sumScoreForB;

    public void resetTheScore(View view) {
        sumScoreForA = 0;
        sumScoreForB = 0;
        displayForA(sumScoreForA);
        displayForB(sumScoreForB);
    }

    public void Add6PointsForTeamA(View view) {
        sumScoreForA = sumScoreForA + 6;
        displayForA(sumScoreForA);
    }

    public void Add3PointsForTeamA(View view) {
        sumScoreForA = sumScoreForA + 3;
        displayForA(sumScoreForA);
    }

    public void Add2PointsForTeamA(View view) {
        sumScoreForA = sumScoreForA + 2;
        displayForA(sumScoreForA);
    }

    public void Add1PointsForTeamA(View view) {
        sumScoreForA = sumScoreForA + 1;
        displayForA(sumScoreForA);
    }

    public void Add6PointsForTeamB(View view) {
        sumScoreForB = sumScoreForB + 6;
        displayForB(sumScoreForB);
    }

    public void Add3PointsForTeamB(View view) {
        sumScoreForB = sumScoreForB + 3;
        displayForB(sumScoreForB);
    }

    public void Add2PointsForTeamB(View view) {
        sumScoreForB = sumScoreForB + 2;
        displayForB(sumScoreForB);
    }

    public void Add1PointsForTeamB(View view) {
        sumScoreForB = sumScoreForB + 1;
        displayForB(sumScoreForB);
    }

    public void displayForA(int scoreOfTeamA) {
        TextView t = (TextView) findViewById(R.id.scoreForTeamA);
        t.setText(String.valueOf(scoreOfTeamA));
    }

    public void displayForB(int scoreOfTeamB) {
        TextView t = (TextView) findViewById(R.id.scoreForTeamB);
        t.setText(String.valueOf(scoreOfTeamB));
    }
}
