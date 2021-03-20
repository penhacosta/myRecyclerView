package adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myrecyclerview.R;

import java.util.List;

import model.Filmes;

public class AdapterFilmes extends RecyclerView.Adapter<AdapterFilmes.MyViewHolder> {

   private List<Filmes> filmes;

   public AdapterFilmes(List<Filmes> filme){
        this.filmes = filme;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lista, parent,false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            Filmes filme = filmes.get(position);
            holder.titulo.setText(filme.getTitulo());
            holder.genero.setText(filme.getGenero());
            holder.ano.setText(filme.getAno());
    }

    @Override
    public int getItemCount() {
        return filmes.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView titulo;
        private TextView ano;
        private TextView genero;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.txt_view_titulo);
            ano = itemView.findViewById(R.id.txt_view_ano);
            genero = itemView.findViewById(R.id.txt_view_genero);

        }
    }
}
