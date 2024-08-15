package com.example.recyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.R;
import com.example.recyclerview.adapter.Adapter;
import com.example.recyclerview.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //listagem de filmes
        this.criarFilmes();


        //configurar adapter
        Adapter adapter = new Adapter(listaFilmes);


        //configurar o recyclerView

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);  //criar o adapter

    }

    public void criarFilmes(){
        Filme filme = new Filme("Homem Aranha", "Aventura", "2018");
        this.listaFilmes.add(filme);

        filme = new Filme("Mulher Maravilha", "Aventura", "2019");
        this.listaFilmes.add(filme);

        filme = new Filme("Senhor dos Anéis", "Ficção", "2001");
        this.listaFilmes.add(filme);

        filme = new Filme("Matrix", "Ficção", "2002");
        this.listaFilmes.add(filme);

        filme = new Filme("Simpson", "Desenho", "2005");
        this.listaFilmes.add(filme);

        filme = new Filme("Requiem para um Sobhi", "Terror", "2007");
        this.listaFilmes.add(filme);

        filme = new Filme("Poderoso Chefão", "Mafia", "2006");
        this.listaFilmes.add(filme);

        filme = new Filme("Terabita", "Ficção", "2007");
        this.listaFilmes.add(filme);

        filme = new Filme("Harry Potter", "Ficção", "1998");
        this.listaFilmes.add(filme);

        filme = new Filme("Forest Gump", "Ação", "1994");
        this.listaFilmes.add(filme);
    }
}