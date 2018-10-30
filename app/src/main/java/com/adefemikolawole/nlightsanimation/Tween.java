package com.adefemikolawole.nlightsanimation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Tween extends AppCompatActivity {
    Button btnStop2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween);
        final ImageView imgRotate = findViewById(R.id.imgTween);
        imgRotate.startAnimation((Animation) AnimationUtils.loadAnimation(this, R.anim.rotation));
        btnStop2 = findViewById(R.id.btnStop2);

        btnStop2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgRotate.clearAnimation();
                startActivity(new Intent(Tween.this, MainActivity.class));
            }
        });
    }
}
