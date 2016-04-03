package com.luan.jogodavelha;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.jogodavelhaandroid.R;
import com.example.jogodavelhaandroid.R.drawable;
import com.luan.controle.ControlaJogo;
import com.luan.controle.ControlaOponente;

public class MainActivity extends ActionBarActivity {
	int turno = 0, jogadores;
	Button qd1x1;
	Button qd1x2;
	Button qd1x3;
	Button qd2x1;
	Button qd2x2;
	Button qd2x3;
	Button qd3x1;
	Button qd3x2;
	Button qd3x3;
    Button btIcone;
    Button btMatriz;
    Button btRestart;
	View tela;
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuItem novo = menu.add("Reiniciar jogo");
        MenuItem voltaMenu = menu.add("Tela inicial");
		getMenuInflater().inflate(R.menu.main, menu);
		novo.setTitle("Reiniciar Jogo");
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	
		int id = item.getItemId();
		if (id == 0) {
			reinicia();
		}

        if(item.getItemId() == 1){
            Intent intent = new Intent(this,Op.class);
            startActivity(intent);
            finish();
        }
		return super.onOptionsItemSelected(item);
	}
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tela = (View) findViewById(R.id.view);
		qd1x1 = (Button) findViewById(R.id.bt1x1);
		qd1x2 = (Button) findViewById(R.id.bt1x2);
		qd1x3 = (Button) findViewById(R.id.bt1x3);
		qd2x1 = (Button) findViewById(R.id.bt2x1);
		qd2x2 = (Button) findViewById(R.id.bt2x2);
		qd2x3 = (Button) findViewById(R.id.bt2x3);
		qd3x1 = (Button) findViewById(R.id.bt3x1);
		qd3x2 = (Button) findViewById(R.id.bt3x2);
		qd3x3 = (Button) findViewById(R.id.bt3x3);
        btIcone = (Button) findViewById(R.id.btIcone);

        Bundle extras = getIntent().getExtras();
        jogadores = extras.getInt("jog");

		reinicia();
	}
	
	public void trataEvento(View v) {



		if (v.getId() == R.id.bt1x1) {
			turno++;
			qd1x1.setEnabled(false);
			if (turno % 2 == 1) {
				qd1x1.setBackgroundResource(drawable.o);
				ControlaJogo.atualizaCampo(0, 0, 1);
			}else{
				qd1x1.setBackgroundResource(drawable.x);
				ControlaJogo.atualizaCampo(0, 0, 2);
			}
		}
        if (v.getId() == R.id.bt1x2) {
            turno++;
            qd1x2.setEnabled(false);
            if (turno % 2 == 1) {
                qd1x2.setBackgroundResource(drawable.o);
                ControlaJogo.atualizaCampo(0, 1, 1);
            }else{
                qd1x2.setBackgroundResource(drawable.x);
                ControlaJogo.atualizaCampo(0, 1, 2);
            }
        }
        if (v.getId() == R.id.bt1x3) {
            turno++;
            qd1x3.setEnabled(false);
            if (turno % 2 == 1) {
                qd1x3.setBackgroundResource(drawable.o);
                ControlaJogo.atualizaCampo(0, 2, 1);
            }else{
                qd1x3.setBackgroundResource(drawable.x);
                ControlaJogo.atualizaCampo(0, 2, 2);
            }
        }
        if (v.getId() == R.id.bt2x1) {
            turno++;
            qd2x1.setEnabled(false);
            if (turno % 2 == 1) {
                qd2x1.setBackgroundResource(drawable.o);
                ControlaJogo.atualizaCampo(1, 0, 1);
            }else{
                qd2x1.setBackgroundResource(drawable.x);
                ControlaJogo.atualizaCampo(1, 0, 2);
            }
        }
        if (v.getId() == R.id.bt2x2) {
            turno++;
            qd2x2.setEnabled(false);
            if (turno % 2 == 1) {
                qd2x2.setBackgroundResource(drawable.o);
                ControlaJogo.atualizaCampo(1, 1, 1);
            }else{
                qd2x2.setBackgroundResource(drawable.x);
                ControlaJogo.atualizaCampo(1, 1, 2);
            }
        }
        if (v.getId() == R.id.bt2x3) {
            turno++;
            qd2x3.setEnabled(false);

            if (turno % 2 == 1) {
                qd2x3.setBackgroundResource(drawable.o);
                ControlaJogo.atualizaCampo(1, 2, 1);
            }else{
                qd2x3.setBackgroundResource(drawable.x);
                ControlaJogo.atualizaCampo(1, 2, 2);
            }
        }
        if (v.getId() == R.id.bt3x1) {
            turno++;
            qd3x1.setEnabled(false);
            if (turno % 2 == 1) {
                qd3x1.setBackgroundResource(drawable.o);
                ControlaJogo.atualizaCampo(2, 0, 1);
            }else{
                qd3x1.setBackgroundResource(drawable.x);
                ControlaJogo.atualizaCampo(2, 0, 2);
            }
        }
        if (v.getId() == R.id.bt3x2) {
            turno++;
            qd3x2.setEnabled(false);
            if (turno % 2 == 1) {
                qd3x2.setBackgroundResource(drawable.o);
                ControlaJogo.atualizaCampo(2, 1, 1);
            }else{
                qd3x2.setBackgroundResource(drawable.x);
                ControlaJogo.atualizaCampo(2, 1, 2);
            }
        }
        if (v.getId() == R.id.bt3x3) {
            turno++;
            qd3x3.setEnabled(false);
            if (turno % 2 == 1) {
                qd3x3.setBackgroundResource(drawable.o);
                ControlaJogo.atualizaCampo(2, 2, 1);
            }else{
                qd3x3.setBackgroundResource(drawable.x);
                ControlaJogo.atualizaCampo(2, 2, 2);
            }
        }

        if(v.getId() == R.id.btRestart){
            reinicia();
        }

        if(jogadores == 1)
            if(turno % 2 == 1)
                turno += ControlaOponente.oponente(ControlaJogo.getMatriz(),turno);

        atualizaSimbolo();
        verificaVencedor();
	}

    private void atualizaSimbolo(){
        if(ControlaJogo.getMatriz()[0][0] == 1){
            qd1x1.setBackgroundResource(drawable.o);
            qd1x1.setEnabled(false);
        }else if(ControlaJogo.getMatriz()[0][0] == 2){
            qd1x1.setBackgroundResource(drawable.x);
            qd1x1.setEnabled(false);
        }

        if(ControlaJogo.getMatriz()[0][1] == 1){
            qd1x2.setBackgroundResource(drawable.o);
            qd1x2.setEnabled(false);
        }else if(ControlaJogo.getMatriz()[0][1] == 2){
            qd1x2.setBackgroundResource(drawable.x);
            qd1x2.setEnabled(false);
        }

        if(ControlaJogo.getMatriz()[0][2] == 1){
            qd1x3.setBackgroundResource(drawable.o);
            qd1x3.setEnabled(false);
        }else if(ControlaJogo.getMatriz()[0][2] == 2){
            qd1x3.setBackgroundResource(drawable.x);
            qd1x3.setEnabled(false);
        }

        if(ControlaJogo.getMatriz()[1][0] == 1){
            qd2x1.setBackgroundResource(drawable.o);
            qd2x1.setEnabled(false);
        }else if(ControlaJogo.getMatriz()[1][0] == 2){
            qd2x1.setBackgroundResource(drawable.x);
            qd2x1.setEnabled(false);
        }

        if(ControlaJogo.getMatriz()[1][1] == 1){
            qd2x2.setBackgroundResource(drawable.o);
            qd2x2.setEnabled(false);
        }else if(ControlaJogo.getMatriz()[1][1] == 2){
            qd2x2.setBackgroundResource(drawable.x);
            qd2x2.setEnabled(false);
        }

        if(ControlaJogo.getMatriz()[1][2] == 1){
            qd2x3.setBackgroundResource(drawable.o);
            qd2x3.setEnabled(false);
        }else if(ControlaJogo.getMatriz()[1][2] == 2){
            qd2x3.setBackgroundResource(drawable.x);
            qd2x3.setEnabled(false);
        }

        if(ControlaJogo.getMatriz()[2][0] == 1){
            qd3x1.setBackgroundResource(drawable.o);
            qd3x1.setEnabled(false);
        }else if(ControlaJogo.getMatriz()[2][0] == 2){
            qd3x1.setBackgroundResource(drawable.x);
            qd3x1.setEnabled(false);
        }

        if(ControlaJogo.getMatriz()[2][1] == 1){
            qd3x2.setBackgroundResource(drawable.o);
            qd3x2.setEnabled(false);
        }else if(ControlaJogo.getMatriz()[2][1] == 2){
            qd3x2.setBackgroundResource(drawable.x);
            qd3x2.setEnabled(false);
        }

        if(ControlaJogo.getMatriz()[2][2] == 1){
            qd3x3.setBackgroundResource(drawable.o);
            qd3x3.setEnabled(false);
        }else if(ControlaJogo.getMatriz()[2][2] == 2){
            qd3x3.setBackgroundResource(drawable.x);
            qd3x3.setEnabled(false);
        }


    }

    private void verificaVencedor(){

        String aux = "";
        int icone  = 0;
        if(ControlaJogo.verificaGanhador()==1){
            aux += "Vencedor";
            icone = drawable.o;
        }else
        if(ControlaJogo.verificaGanhador()==2){
            aux += "Vencedor";
            icone = drawable.x;
        }else
        if(ControlaJogo.verificaGanhador()==0){
            aux += "Velha";
            icone = drawable.velha;
        };

        if (ControlaJogo.verificaGanhador() != -1 ) {
            Intent intent = new Intent(this,GanhadorActivity.class);
            intent.putExtra("ganhador",aux);
            intent.putExtra("icone",icone);
            intent.putExtra("jog",jogadores);
            desativaTodos();
            this.startActivity(intent);
        }

        atualizaIcone();

    }
	
	private void reinicia() {
		qd1x1.setBackgroundResource(drawable.t);
		qd1x2.setBackgroundResource(drawable.t);
		qd1x3.setBackgroundResource(drawable.t);
		qd2x1.setBackgroundResource(drawable.t);
		qd2x2.setBackgroundResource(drawable.t);
		qd2x3.setBackgroundResource(drawable.t);
		qd3x1.setBackgroundResource(drawable.t);
		qd3x2.setBackgroundResource(drawable.t);
		qd3x3.setBackgroundResource(drawable.t);
        btIcone.setBackgroundResource(drawable.o);
		qd1x1.setEnabled(true);
		qd1x2.setEnabled(true);
		qd1x3.setEnabled(true);
		qd2x1.setEnabled(true);
		qd2x2.setEnabled(true);
		qd2x3.setEnabled(true);
		qd3x1.setEnabled(true);
		qd3x2.setEnabled(true);
		qd3x3.setEnabled(true);
		turno = 0;
		ControlaJogo.zeramatriz();
	}

    private void atualizaIcone(){
        if (turno % 2 == 1){
            btIcone.setBackgroundResource(drawable.x);
        }else
            btIcone.setBackgroundResource(drawable.o);
    }

    private void desativaTodos(){
        qd1x1.setEnabled(false);
        qd1x2.setEnabled(false);
        qd1x3.setEnabled(false);
        qd2x1.setEnabled(false);
        qd2x2.setEnabled(false);
        qd2x3.setEnabled(false);
        qd3x1.setEnabled(false);
        qd3x2.setEnabled(false);
        qd3x3.setEnabled(false);
    }
 @Override
    public void onBackPressed() {
        Intent intent = new Intent(this,Op.class);
        startActivity(intent);
        finish();
    }
}
