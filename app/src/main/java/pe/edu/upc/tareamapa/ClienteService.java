package pe.edu.upc.tareamapa;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENSO on 10/11/2017.
 */

public class ClienteService {

    private List<Cliente> clientes;

    public List<Cliente> getClientes() {
        return clientes;
    }

    public ClienteService(Context context) {
        Resources res = context.getResources();
        clientes = new ArrayList<>();
        clientes.add(new Cliente(res.getString(R.string.nombre_gallese),
                res.getString(R.string.posicion_pedro),
                res.getString(R.string.juega_gallese),
                res.getString(R.string.bio_gallese),
                R.drawable.gallese,
                res.getString(R.string.lat_gallese),
                res.getString(R.string.long_gallese)));

        clientes.add(new Cliente(res.getString(R.string.nombre_corso),
                res.getString(R.string.posicion_corso),
                res.getString(R.string.juega_corso),
                res.getString(R.string.bio_corzo),
                R.drawable.corso,
                res.getString(R.string.lat_corso),
                res.getString(R.string.long_corso)));

        clientes.add(new Cliente(res.getString(R.string.nombre_la_zombra),
                res.getString(R.string.posicion_zombra),
                res.getString(R.string.juega_zombra),
                res.getString(R.string.bio_ramos),
                R.drawable.ramos,
                res.getString(R.string.lat_la_zombra),
                res.getString(R.string.long_la_zombra)));

        clientes.add(new Cliente(res.getString(R.string.nombre_mudo),
                res.getString(R.string.posicion_mudo),
                res.getString(R.string.juega_mudo),
                res.getString(R.string.bio_mudo),
                R.drawable.mudo,
                res.getString(R.string.lat_mudo),
                res.getString(R.string.long_mudo)));

        clientes.add(new Cliente(res.getString(R.string.nombre_genio),
                res.getString(R.string.posicion_genio),
                res.getString(R.string.juega_genio),
                res.getString(R.string.bio_genio),
                R.drawable.trauco,
                res.getString(R.string.lat_genio),
                res.getString(R.string.long_genio)));

        clientes.add(new Cliente(res.getString(R.string.nombre_tapia),
                res.getString(R.string.posicion_tapia),
                res.getString(R.string.juega_tapia),
                res.getString(R.string.bio_tapia),
                R.drawable.tapia,
                res.getString(R.string.lat_tapia),
                res.getString(R.string.long_tapia)));

        clientes.add(new Cliente(res.getString(R.string.nombre_yotun),
                res.getString(R.string.posicion_yotun),
                res.getString(R.string.juega_yotun),
                res.getString(R.string.bio_yotun),
                R.drawable.yotun,
                res.getString(R.string.lat_yotun),
                res.getString(R.string.long_yotun)));

        clientes.add(new Cliente(res.getString(R.string.nombre_cueva),
                res.getString(R.string.posicion_cueva),
                res.getString(R.string.juega_cueva),
                res.getString(R.string.bio_cueva),
                R.drawable.cueva,
                res.getString(R.string.lat_cueva),
                res.getString(R.string.long_cueva)));

        clientes.add(new Cliente(res.getString(R.string.nombre_carrillo),
                res.getString(R.string.posicion_carrillo),
                res.getString(R.string.juega_carrillo),
                res.getString(R.string.bio_carrillo),
                R.drawable.carrillo,
                res.getString(R.string.lat_carrillo),
                res.getString(R.string.long_carrillo)));

        clientes.add(new Cliente(res.getString(R.string.nombre_flores),
                res.getString(R.string.posicion_flores),
                res.getString(R.string.juega_flores),
                res.getString(R.string.bio_flores),
                R.drawable.flores,
                res.getString(R.string.lat_flores),
                res.getString(R.string.long_flores)));

        clientes.add(new Cliente(res.getString(R.string.nombre_farfan),
                res.getString(R.string.posicion_farfan),
                res.getString(R.string.juega_farfan),
                res.getString(R.string.bio_farfan),
                R.drawable.farfan,
                res.getString(R.string.lat_farfan),
                res.getString(R.string.long_farfan)));



    }

}