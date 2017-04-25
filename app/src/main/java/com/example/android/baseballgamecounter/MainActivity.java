package com.example.android.baseballgamecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int sumScoreForA;
    private int sumScoreForB;
    private final int SIX_POINTS = 6;
    private final int THREE_POINTS = 3;
    private final int TWO_POINTS = 2;
    private final int ONE_POINT = 1;
    ViewHolder holder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        holder.teamAScore = (TextView) findViewById(R.id.scoreForTeamA);
        holder.teamBScore = (TextView) findViewById(R.id.scoreForTeamB);
    }

    public void resetTheScore(View view) {
        sumScoreForA = 0;
        sumScoreForB = 0;
        displayForA(sumScoreForA);
        displayForB(sumScoreForB);
    }

    public void Add6PointsForTeamA(View view) {
        sumScoreForA += SIX_POINTS;
        displayForA(sumScoreForA);
    }

    public void Add3PointsForTeamA(View view) {
        sumScoreForA += THREE_POINTS;
        displayForA(sumScoreForA);
    }

    public void Add2PointsForTeamA(View view) {
        sumScoreForA += TWO_POINTS;
        displayForA(sumScoreForA);
    }

    public void Add1PointsForTeamA(View view) {
        sumScoreForA += ONE_POINT;
        displayForA(sumScoreForA);
    }

    public void Add6PointsForTeamB(View view) {
        sumScoreForB += SIX_POINTS;
        displayForB(sumScoreForB);
    }

    public void Add3PointsForTeamB(View view) {
        sumScoreForB += THREE_POINTS;
        displayForB(sumScoreForB);
    }

    public void Add2PointsForTeamB(View view) {
        sumScoreForB += TWO_POINTS;
        displayForB(sumScoreForB);
    }

    public void Add1PointsForTeamB(View view) {
        sumScoreForB += ONE_POINT;
        displayForB(sumScoreForB);
    }

    private void displayForA(int scoreOfTeamA) {
        holder.teamAScore.setText(String.valueOf(scoreOfTeamA));
    }

    private void displayForB(int scoreOfTeamB) {
        holder.teamBScore.setText(String.valueOf(scoreOfTeamB));
    }

    private class ViewHolder{
        TextView teamAScore;
        TextView teamBScore;
    }
}
