package com.futuracomnetwork.com.notepadpluss;

import android.app.ListActivity;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import com.futuracomnetwork.com.database.NoteCursorAdapter;
import com.futuracomnetwork.com.database.NoteDbAdapter;
import com.futuracomnetwork.com.database.NotepadAdapter;

public class MainActivity extends ListActivity implements View.OnClickListener {

    //codigo FAB
    private FABToolbarLayout morph;

    public static final String C_MODO  = "modo" ;
    public static final int C_VISUALIZAR = 551 ;
    public static final int C_CREAR = 552 ;
    public static final int C_EDITAR = 553 ;
    public static final int C_ELIMINAR = 554 ;
    public static final int C_CONFIGURAR = 555 ;
    public static final int C_ABOUT = 556;

    private NoteDbAdapter dbAdapter;
    private Cursor cursor;
    private NoteCursorAdapter noteAdapter ;
    private ListView lista;
    private String filtro ;
    private NotepadAdapter notepadAdapter ;
    private String resultskey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
