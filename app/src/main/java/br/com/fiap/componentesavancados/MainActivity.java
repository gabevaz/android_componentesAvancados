package br.com.fiap.componentesavancados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox chkEstouAprendendo;
    RadioGroup rdgOpcoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkEstouAprendendo = findViewById(R.id.chkEstouAprendendo);
        rdgOpcoes = findViewById(R.id.rdgOpcoes);
    }

    public void mostrarDados(View view) {

        int idRdg = rdgOpcoes.getCheckedRadioButtonId();
        String msg = "";

        switch (idRdg){
            case R.id.rdbOpcao1:
                msg = getString(R.string.op_o_1);
                break;
            case R.id.rdbOpcao2:
                msg = getString(R.string.op_o_2);
                break;
            case R.id.rdbOpcao3:
                msg = getString(R.string.op_o_3);
                break;
            default:
                msg = getString(R.string.nenhumaOpcao);
        }


        Toast.makeText(this, "O radio que está selecionado " + msg,
                Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "Checkbox selecionada " + chkEstouAprendendo.isChecked(),
                Toast.LENGTH_LONG).show();

    }
}
