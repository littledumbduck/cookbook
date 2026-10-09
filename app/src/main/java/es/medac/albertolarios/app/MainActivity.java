package es.medac.albertolarios.app;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vinculamos y formateamos el texto con parámetro %1$s de strings.xml
        TextView tvBienvenida = findViewById(R.id.tvBienvenida);
        String textoConParametro = getString(R.string.subtitulo_bienvenida, "Alberto");
        tvBienvenida.setText(textoConParametro);
    }
}