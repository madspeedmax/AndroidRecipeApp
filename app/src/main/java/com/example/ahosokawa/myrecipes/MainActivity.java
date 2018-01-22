package com.example.ahosokawa.myrecipes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> recipe_list = new ArrayList<String>();
        recipe_list.add("Chicken Adobo");
        recipe_list.add("Beef Stroganoff");
        recipe_list.add("Sunday Pot Roast");
        recipe_list.add("Chicken Tikka Masala");
        recipe_list.add("Middle Eastern Lamb");
        recipe_list.add("Chicken and Sweet Potato Curry");

        ArrayAdapter<String> recipe_list_adapter = new ArrayAdapter<String>(
                this,
                R.layout.list_item_recipe,
                R.id.text_view_recipe,
                recipe_list);

        ListView recipeListView = (ListView) this.findViewById(R.id.list_view_recipe);
        recipeListView.setAdapter(recipe_list_adapter);

        recipeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast toast = Toast.makeText(MainActivity.this, ""+i, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
