package facci.pm.rosalesordonez.estudiandosqlite;

import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import facci.pm.rosalesordonez.estudiandosqlite.adapter.ShoppingItemAdapter;
import facci.pm.rosalesordonez.estudiandosqlite.database.entities.ShoppingItemDB;
import facci.pm.rosalesordonez.estudiandosqlite.database.model.ShoppingItem;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    private ShoppingItemDB shoppingItemDB;
    private ShoppingItemAdapter shoppingItemAdapter;
    private ArrayList<ShoppingItem> shoppingItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.shopping_list_view);

        shoppingItemDB = new ShoppingItemDB(this);

        insertProducts();

        shoppingItems.addAll(shoppingItemDB.getAllItems());

        shoppingItemAdapter = new ShoppingItemAdapter(this, shoppingItems);
        listView.setAdapter(shoppingItemAdapter);
    }

    private void insertProducts() {
        shoppingItemDB.insertElement("P0001","Avion: Tame 2305","lunes");
        shoppingItemDB.insertElement("P0002","Avion: Avianca 3402","martes");

    }

}
