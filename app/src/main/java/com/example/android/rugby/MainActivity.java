package com.example.android.rugby;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.rugby.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Initialize  and track scores and stats Variables.
     */
    int scoreA = 0;
    int scoreB = 0;
    int tryA = 0;
    int tryB = 0;
    int penA = 0;
    int penB = 0;
    int cnvA = 0;
    int cnvB = 0;
    int goalA = 0;
    int goalB = 0;

    //**********************************
    /**
     * Team A
     * Defining score methods for team A
     * score updates A
     * display score A
     * stats update A
     * display Stats A
     */

    public void try_A(View view){
        scoreA += 5;
        displayForTeamA(scoreA);
        tryA++;
        displayTryTeamA(tryA);
    }

    public void penalty_A(View view){
        scoreA += 3;
        displayForTeamA(scoreA);
        penA++;
        displayPenTeamA(penA);
    }

    public void cnv_A(View view){
        scoreA += 2;
        displayForTeamA(scoreA);
        cnvA++;
        displayCnvTeamA(cnvA);
    }

    public void goal_A(View view){
        scoreA += 3;
        displayForTeamA(scoreA);
        goalA++;
        displayGoalTeamA(goalA);
    }
    //* End of Score methods for team A

    //**********************************

    /**
     * Team B
     * Defining score methods for team B
     * score updates B
     * display score B
     * stats update B
     * display Stats B
     */

    public void try_B(View view){
        scoreB += 5;
        displayForTeamB(scoreB);
        tryB++;
        displayTryTeamB(tryB);
    }

    public void penalty_B(View view){
        scoreB += 3;
        displayForTeamB(scoreB);
        penB++;
        displayPenTeamB(penB);
    }

    public void cnv_B(View view){
        scoreB += 2;
        displayForTeamB(scoreB);
        cnvB++;
        displayCnvTeamB(cnvB);
    }

    public void goal_B(View view){
        scoreB += 3;
        displayForTeamB(scoreB);
        goalB++;
        displayGoalTeamB(goalB);
    }
    //* End of Score methods for team B

    //**********************************

    /**
     * Reset Scores and Stats to zero.
     */

    public void reset(View view){
        scoreA = 0;
        displayForTeamA(scoreA);
        scoreB = 0;
        displayForTeamB(scoreB);
        tryA = 0;
        displayTryTeamA(tryA);
        tryB = 0;
        displayTryTeamB(tryB);
        penA = 0;
        displayPenTeamA(penA);
        penB = 0;
        displayPenTeamB(penB);
        cnvA = 0;
        displayCnvTeamA(cnvA);
        cnvB = 0;
        displayCnvTeamB(cnvB);
        goalA = 0;
        displayGoalTeamA(goalA);
        goalB = 0;
        displayGoalTeamB(goalB);
    }



    /**
     * Displays the given score and stats for Team A.
     */

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTryTeamA(int states) {
        TextView scoreView = (TextView) findViewById(R.id.try_a_stats);
        scoreView.setText(String.valueOf(states));
    }

    public void displayPenTeamA(int states) {
        TextView scoreView = (TextView) findViewById(R.id.pen_a_stats);
        scoreView.setText(String.valueOf(states));
    }

    public void displayCnvTeamA(int states) {
        TextView scoreView = (TextView) findViewById(R.id.cnv_a_stats);
        scoreView.setText(String.valueOf(states));
    }

    public void displayGoalTeamA(int states) {
        TextView scoreView = (TextView) findViewById(R.id.goal_a_stats);
        scoreView.setText(String.valueOf(states));
    }

    /**
     * Displays the given score and stats for Team B.
     */

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTryTeamB(int states) {
        TextView scoreView = (TextView) findViewById(R.id.try_b_stats);
        scoreView.setText(String.valueOf(states));
    }

    public void displayPenTeamB(int states) {
        TextView scoreView = (TextView) findViewById(R.id.pen_b_stats);
        scoreView.setText(String.valueOf(states));
    }

    public void displayCnvTeamB(int states) {
        TextView scoreView = (TextView) findViewById(R.id.cnv_b_stats);
        scoreView.setText(String.valueOf(states));
    }

    public void displayGoalTeamB(int states) {
        TextView scoreView = (TextView) findViewById(R.id.goal_b_stats);
        scoreView.setText(String.valueOf(states));
    }
}
