package adapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.myrecyclerview.R;

import java.util.ArrayList;
import java.util.List;

import model.Filmes;

public class MainActivity extends AppCompatActivity {


    List<Filmes> filmeList = new ArrayList<>();

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.criarFilmes();
        recyclerView = findViewById(R.id.recyclerView);

        AdapterFilmes adapterFilmes = new AdapterFilmes(filmeList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapterFilmes);
    }

    public void criarFilmes(){
        Filmes filmes = new Filmes("Homem Aranha","De Voltar ao Lar","2017");
        filmeList.add(filmes);
        filmes = new Filmes("Mulher Maravilha","Fantasia","2020");
        filmeList.add(filmes);
        filmes = new Filmes("Titanic","Romance","2000");
        filmeList.add(filmes);
        filmes = new Filmes("Duro de Matar","Ação","1998");
        filmeList.add(filmes);
    }
}