package com.example.tfg;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.tfg.db.DbExecute;
import com.example.tfg.db.DbHelper;

import java.util.ArrayList;

public class AnadirEmpleado extends AppCompatActivity {

    DbExecute dbExecute;
    Spinner spCargo, spTaller, spCiu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anadir_empleado);

        añadirCargos();
        añadirTalleres();
        añadirCiudades();
    }


    public void añadirCargos(){

        spCargo = findViewById(R.id.spinnerCargos);
        dbExecute = new DbExecute(AnadirEmpleado.this);
        ArrayList<String> arr = new ArrayList<String>();

        arr = dbExecute.selectCargos();

        for (int i = 0; i < arr.size(); i++) {
            System.out.println("i " + i + " codigo " + arr.get(i) + " cargo " + arr.get(++i));

        }

        ArrayAdapter<CharSequence> adapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item, arr);

        spCargo.setAdapter(adapter);

    }

    public void añadirTalleres(){

        spTaller = findViewById(R.id.spinnerTaller);
        dbExecute = new DbExecute(AnadirEmpleado.this);
        ArrayList<String> arr = new ArrayList<String>();

        arr = dbExecute.selectTalleres();

        for (int i = 0; i < arr.size(); i++) {
            System.out.println("i " + i + " codigo " + arr.get(i) + " taller " + arr.get(++i));

        }

        ArrayAdapter<CharSequence> adapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item, arr);

        spTaller.setAdapter(adapter);

    }

    public void añadirCiudades(){

        spCiu = findViewById(R.id.spinnerCiu);
        dbExecute = new DbExecute(AnadirEmpleado.this);
        ArrayList<String> arr = new ArrayList<String>();

        arr = dbExecute.selectCiudades();

        for (int i = 0; i < arr.size(); i++) {
            System.out.println("i " + i + " codigo " + arr.get(i) + " ciudad " + arr.get(++i));

        }

        ArrayAdapter<CharSequence> adapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item, arr);

        spCiu.setAdapter(adapter);

    }
}