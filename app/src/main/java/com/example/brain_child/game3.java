package com.example.brain_child;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class game3 extends AppCompatActivity {

    TextView textViewScore;
    TextView textViewLife;
    TextView textViewTime;
    TextView textViewQuestion;
    EditText answer;
    Button buttonOk;
    Button buttonNext;

    Random random= new Random();
    int num1;
    int num2;

    int UserAnswer;
    int RealAnswer;

    int Userlife = 2;
    int UserScore = 0;

    CountDownTimer Timer;
    private static final long timeLeftInMillis = 30000; // 30 seconds
    boolean timerRunning;
    long timeLeftInMillis2 = timeLeftInMillis; // 10 seconds




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game3);

        textViewScore = findViewById(R.id.textViewScore);
        textViewLife = findViewById(R.id.textViewLife);
        textViewTime = findViewById(R.id.textViewTime);
        textViewQuestion = findViewById(R.id.textViewQuestion);
        answer = findViewById(R.id.answer);
        buttonOk = findViewById(R.id.buttonOK);
        buttonNext = findViewById(R.id.buttonNext);

        gameContinue();
        updateText();




        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // Handle OK button click
                UserAnswer = Integer.valueOf(answer.getText().toString());

                pauseTimer();
                if (UserAnswer == RealAnswer) {
                    textViewQuestion.setText("Your answer is Correct!");
                    UserScore= UserScore + 10;
                    textViewScore.setText("" + UserScore);

                } else {

                    UserScore= UserScore - 5;
                    textViewScore.setText("" + UserScore);
                    Userlife= Userlife - 1;
                    textViewLife.setText("" + Userlife);
                    textViewQuestion.setText("Wrong! The correct answer is: " + RealAnswer);
                }
                // Check the answer and update score/life accordingly
            }
        });



        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                gameContinue();
                // Reset the answer field
                answer.setText("");

                resetTimer();
                if (Userlife == 0) {
                    // Handle game over
                    Intent intent = new Intent(game3.this, result.class);
                    intent.putExtra("score", UserScore);
                    startActivity(intent);
                    finish();
                }
                else {
                    gameContinue();
                }

            }
        });

    }
    public void gameContinue() {
        num1 = random.nextInt(10);
        num2 = random.nextInt(10);
        RealAnswer = num1 * num2;
        textViewQuestion.setText(num1 + " * " + num2 + " = ?");

        startTimer();

    }

    public void startTimer() {
        Timer = new CountDownTimer(timeLeftInMillis2, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMillis2 = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                timerRunning = false;
                pauseTimer();
                resetTimer();
                updateText();
                Userlife = Userlife - 1;
                textViewLife.setText(" " + Userlife);
                textViewQuestion.setText("Time's up! You lost a life.");
                // Handle timer finish (e.g., end game)
            }
        }.start();
        timerRunning = true;
    }
    public void pauseTimer() {
        Timer.cancel();
        timerRunning = false;
    }
    public void resetTimer() {
        if (Timer != null) {
            Timer.cancel();
        }
        timeLeftInMillis2 = timeLeftInMillis;
        updateCountDownText();
        startTimer();


    }
    public void updateCountDownText() {
        int minutes = (int) (timeLeftInMillis2 / 1000) / 60;
        int seconds = (int) (timeLeftInMillis2 / 1000) % 60;

        String timeLeftFormatted = String.format("%02d:%02d", minutes, seconds);
        textViewTime.setText(timeLeftFormatted);
    }
    public void updateText() {
        textViewLife.setText(" " + Userlife);
        textViewScore.setText(" " + UserScore);
    }
}