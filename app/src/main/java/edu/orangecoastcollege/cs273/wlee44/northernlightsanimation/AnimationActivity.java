package edu.orangecoastcollege.cs273.wlee44.northernlightsanimation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;

public class AnimationActivity extends AppCompatActivity {

    private ImageView lightsImageView;

    private AnimationDrawable frameAnim; // frame animation
    private Animation rotateAnim; // tween animation
    private Animation shakeAnim;
    private Animation customAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        lightsImageView = (ImageView) findViewById(R.id.lightsImageView);
    }

    public void toggleFrameAnim(View view)
    {
        // 1) Programmatically set the background of the image view to @drawable/lights1
        lightsImageView.setBackgroundResource(R.drawable.frame_anim);
        // 2) Associate the frameAnim with the animation in XML
        frameAnim = (AnimationDrawable) lightsImageView.getBackground();
        // 3) Start the frame animation
        frameAnim.start();
    }


}
