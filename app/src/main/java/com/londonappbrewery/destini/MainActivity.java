package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryText;
    private Button mTopAnswer;
    private Button mBottomAnswer;
    private int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryText = findViewById(R.id.storyTextView);
        mTopAnswer = findViewById(R.id.buttonTop);
        mBottomAnswer = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mStoryIndex) {
                    case 1:
                        mStoryText.setText(R.string.T3_Story);
                        mTopAnswer.setText(R.string.T3_Ans1);
                        mBottomAnswer.setText(R.string.T3_Ans2);
                        mStoryIndex = 3;
                        break;
                    case 2:
                        mStoryText.setText(R.string.T4_End);
                        mTopAnswer.setVisibility(View.GONE);
                        mBottomAnswer.setVisibility(View.GONE);
                        break;
                    case 3:
                        mStoryText.setText(R.string.T6_End);
                        mTopAnswer.setVisibility(View.GONE);
                        mBottomAnswer.setVisibility(View.GONE);
                        break;
                }


            }
        });
        mBottomAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(mStoryIndex){
                    case 1:
                        mStoryText.setText(R.string.T2_Story);
                        mTopAnswer.setText(R.string.T2_Ans1);
                        mBottomAnswer.setText(R.string.T2_Ans2);
                        mStoryIndex = 2;
                        break;
                    case 2:
                        mStoryText.setText(R.string.T3_Story);
                        mTopAnswer.setText(R.string.T3_Ans1);
                        mBottomAnswer.setText(R.string.T3_Ans2);
                        mStoryIndex = 3;
                        break;
                    case 3:
                        mStoryText.setText(R.string.T4_End);
                        mTopAnswer.setVisibility(View.GONE);
                        mBottomAnswer.setVisibility(View.GONE);
                        break;
                }

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
}
