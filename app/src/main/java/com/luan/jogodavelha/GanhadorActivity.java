package com.luan.jogodavelha;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jogodavelhaandroid.R;

public class GanhadorActivity extends ActionBarActivity {
    ImageView ivGanhador;
    int jogadores;
    TextView tvbt;
    TextView titulo;
    TextView tvVerTabuleiro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganhador);

        Bundle extras = getIntent().getExtras();
        String vencedor = (String) extras.getCharSequence("ganhador");
        int icone = extras.getInt("icone");
        jogadores = extras.getInt("jog");

        ivGanhador = (ImageView) findViewById(R.id.imageGanhaor);
        tvbt = (TextView) findViewById(R.id.tvbt);
        titulo = (TextView) findViewById(R.id.tvVencedor);
        tvVerTabuleiro = (TextView) findViewById(R.id.tvVerTabuleiro);
        titulo.setText(vencedor);
        ivGanhador.setBackgroundResource(icone);


        tvbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GanhadorActivity.this,MainActivity.class);
                intent.putExtra("jog",jogadores);
                GanhadorActivity.this.startActivity(intent);
            }
        });

        tvVerTabuleiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}
