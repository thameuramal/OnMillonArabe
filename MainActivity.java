package com.example.user.onmillonarabe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private int []image={R.mipmap.b,R.mipmap.a,R.mipmap.m,R.mipmap.l};
private Button button;
    private ImageView i1 , i2 ,i3 ,i4 ;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1=findViewById(R.id.bana);
        i2=findViewById(R.id.org);
    i3=findViewById(R.id.tigre);
    i4=findViewById(R.id.hamstar);
        button= findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i1.setImageResource(image[1]);
                i2.setImageResource(image[0]);
                i3.setImageResource(image[3]);
                i4.setImageResource(image[2]);
            }
        });
    }
}
