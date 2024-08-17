package edu.learn.harrypotter;

import static edu.learn.harrypotter.endpoint.ALL_SPELL;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import edu.learn.harrypotter.adapters.SpellAdapter;
import edu.learn.harrypotter.models.Spell;
import edu.learn.harrypotterapp.R;

public class SpellActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
   // private SpellAdapter spellAdapter;
    // create spell adapter here // item_spell already created
    private ArrayList<Spell> spellList;
    RecyclerView.LayoutManager layoutManager;

    SpellAdapter spellAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_spell);
        spellList = new ArrayList<Spell>();
        recyclerView = findViewById(R.id.allSpellRecyclerView);


        //set layout

        //setting adapter to layout

         layoutManager = new LinearLayoutManager(SpellActivity.this);
        recyclerView.setLayoutManager(layoutManager);

requestTOServer();


        // set adapter and view type of recylyer here and reqeuest to server



    }

    void requestTOServer(){


        RequestQueue queue = Volley.newRequestQueue(SpellActivity.this);

        StringRequest stringRequest = new StringRequest(
                Request.Method.GET,
                ALL_SPELL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.d("ServerResponse", response);

                        try {
                            JSONArray jsonArray = new JSONArray(response);
                            for (int i = 0; i < jsonArray.length(); i++) {
                                JSONObject jsonObject = new JSONObject(String.valueOf(jsonArray.get(i)));

                                String id = jsonObject.getString("id");
                                String name = jsonObject.getString("name");
                                String description = jsonObject.getString("description");


                                Spell spell = new Spell(id, name, description);



                                spellList.add(spell);

                            }

                            spellAdapter = new SpellAdapter(SpellActivity.this,spellList);
                            recyclerView.setAdapter(spellAdapter);

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("ServerResponse", "Error: " + error.getMessage());
                    }
                }
        );

        queue.add(stringRequest);

    }



}