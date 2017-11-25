package pe.edu.upc.tareamapa;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Cliente> clientes;
    RecyclerView.LayoutManager clientesLayoutManager;
    RecyclerView clienteRecyclerView;
    ClienteAdapter clienteAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ClienteService service = new ClienteService(this);
        clientes = service.getClientes();
        clientesLayoutManager = new LinearLayoutManager(this);
        clienteAdapter = new ClienteAdapter();
        clienteAdapter.setClientes(clientes);
        clienteRecyclerView = (RecyclerView) findViewById(R.id.clienteRecyclerView);
        clienteRecyclerView.setLayoutManager(clientesLayoutManager);
        clienteRecyclerView.setAdapter(clienteAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
