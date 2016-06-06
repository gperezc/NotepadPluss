package com.futuracomnetwork.com.database;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by gperezc on 6/06/16.
 */

public class NoteCursorAdapter {

    private NoteDbAdapter dbAdapter = null ;

    public NoteCursorAdapter(Context context, Cursor c)
    {
        super(context, c);
        dbAdapter = new NoteDbAdapter(context);
        dbAdapter.abrir();
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor)
    {
        TextView tv = (TextView) view ;

        tv.setText(cursor.getString(cursor.getColumnIndex(NoteDbAdapter.C_COLUMNA_NOMBRE)));

        if (cursor.getString(cursor.getColumnIndex(NoteDbAdapter.C_COLUMNA_IMPORT)).equals("S"))
        {
            tv.setTextColor(Color.RED);
        }
        else
        {
            tv.setTextColor(Color.WHITE);
        }
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent)
    {
        final LayoutInflater inflater = LayoutInflater.from(context);
        final View view = inflater.inflate(android.R.layout.simple_dropdown_item_1line, parent, false);

        return view;
    }

}
