package com.luan.jogodavelha;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.example.jogodavelhaandroid.R;

public class Op extends ActionBarActivity {
    Button btJogador1, btJogador2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_op);

        btJogador1 = (Button) findViewById(R.id.btJogador1);
        btJogador2 = (Button) findViewById(R.id.btJogador2);

        btJogador1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Op.this,MainActivity.class);
                intent.putExtra("jog",1);
                startActivity(intent);
                finish();
            }
        });

        btJogador2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Op.this,MainActivity.class);
                intent.putExtra("jog",2);
                startActivity(intent);
                finish();
            }
        });
    }
}
