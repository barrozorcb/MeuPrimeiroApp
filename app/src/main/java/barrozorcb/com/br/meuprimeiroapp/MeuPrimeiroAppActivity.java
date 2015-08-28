package barrozorcb.com.br.meuprimeiroapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MeuPrimeiroAppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);

        String editText = String.valueOf(findViewById(R.id.campo));

        Button botaoEnviar = (Button) findViewById(R.id.enviar);
        
        
        
        String[] nomes = {};


        for (String nome:nomes) {

            nome = editText;
        }
        
        int layout = android.R.layout.simple_list_item_1;

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, layout, nomes);
        
        ListView lista = (ListView) findViewById(R.id.lista);

        

        botaoEnviar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {


                
                Toast.makeText(MeuPrimeiroAppActivity.this, "Nome Adicionado", Toast.LENGTH_LONG).show();
            }
        });
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_meu_primeiro_app, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
