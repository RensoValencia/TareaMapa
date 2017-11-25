package pe.edu.upc.tareamapa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by RENSO on 10/11/2017.
 */

public class ClienteAdapter  extends RecyclerView.Adapter<ClienteAdapter.ViewHolder> {

    List<Cliente> clientes;
    public void setClientes(List<Cliente> clientes) { this.clientes = clientes; }

    @Override
    public ClienteAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.card_cliente, parent, false));
    }
    @Override
    public void onBindViewHolder(ClienteAdapter.ViewHolder holder, final int position) {
        holder.nombreTextView.setText(clientes.get(position).getNombre());
        holder.pictureImageView.setImageResource(clientes.get(position).getPictureId());
        holder.posicionTextView.setText(clientes.get(position).getPosicion());
        holder.juegaTextView.setText(clientes.get(position).getJuega());

        System.out.println("aaa: " + holder.juegaTextView);
        System.out.println("bbb: " + holder.latTextView);
        //System.out.println("ddddd: " + clientes.get(position).getLatitude());
        holder.latTextView.setText(clientes.get(position).getLatitude());
        //holder.lonTextView.setText("dfdsfs");
        holder.clienteCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putInt("currentPosition", position);
                Intent iconIntent = new Intent(view.getContext(), IconActivity.class);
                iconIntent.putExtras(bundle);
                view.getContext().startActivity(iconIntent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return clientes.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {

        CardView clienteCardView;
        ImageView pictureImageView;
        TextView nombreTextView;
        TextView posicionTextView;
        TextView juegaTextView;
        TextView biografiaTextView;
        TextView latTextView;
        TextView lonTextView;

        public ViewHolder(View itemView) {
            super(itemView);

            clienteCardView = (CardView) itemView.findViewById(R.id.clienteCardView);
            pictureImageView = (ImageView) itemView.findViewById(R.id.pictureImageView);
            nombreTextView = (TextView) itemView.findViewById(R.id.nombreTextView);
            posicionTextView = (TextView) itemView.findViewById(R.id.posicionTextView);
            juegaTextView = (TextView) itemView.findViewById(R.id.juegaTextView);
            biografiaTextView = (TextView) itemView.findViewById(R.id.biografiaTextView);

            latTextView = (TextView) itemView.findViewById(R.id.latTextView);
            lonTextView = (TextView) itemView.findViewById(R.id.longTextView);
        }
    }

}
