package pe.edu.upc.tareamapa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class IconActivity extends AppCompatActivity {

    TextView nombreTextView;
    TextView posicionTextView;
    TextView juegaTextView;
    TextView bioTextView;
    ImageView pictureImageView;
    Button btnMostrarMapa;
    TextView latTextView;
    TextView longTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        latTextView = (TextView) findViewById(R.id.latTextView);
        longTextView = (TextView) findViewById(R.id.longTextView);

        btnMostrarMapa = (Button) findViewById(R.id.btnMostrarMapa);

        nombreTextView = (TextView) findViewById(R.id.nombreTextView);
        posicionTextView = (TextView) findViewById(R.id.posicionTextView);
        juegaTextView = (TextView) findViewById(R.id.juegaTextView);
        bioTextView = (TextView) findViewById(R.id.biografiaTextView);
        pictureImageView = (ImageView) findViewById(R.id.pictureImageView);
        ClienteService service = new ClienteService(this);
        Cliente cliente = service.getClientes().get(getIntent().getExtras().getInt("currentPosition"));
        nombreTextView.setText(cliente.getNombre());
        posicionTextView.setText(cliente.getPosicion());
        juegaTextView.setText(cliente.getJuega());
        bioTextView.setText(cliente.getBiografia());
        longTextView.setText(cliente.getLongitude());
        latTextView.setText(cliente.getLatitude());

        pictureImageView.setImageResource(cliente.getPictureId());

        btnMostrarMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                System.out.println("se imprime lat: " + latTextView.getText().toString());
                System.out.println("se imprime long: " + longTextView.getText().toString());
                bundle.putDouble("curLat", Double.parseDouble(latTextView.getText().toString()));
                bundle.putDouble("curLon", Double.parseDouble(longTextView.getText().toString()));
                Intent intMap = new Intent(view.getContext(), MapsActivity.class);
                intMap.putExtras(bundle);
                startActivity(intMap);
            }
        });
    }
}