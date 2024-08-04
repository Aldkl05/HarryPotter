package edu.learn.harrypotter;

import static edu.learn.harrypotter.endpoint.GET_HOUSES;


import android.os.Bundle;
import android.util.Log;
import android.widget.GridView;
import android.widget.TextView;

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

import edu.learn.harrypotter.adapters.CharacterAdapter;
import edu.learn.harrypotter.models.HarryPotterCharacter;
import edu.learn.harrypotter.models.House;
import edu.learn.harrypotterapp.R;

public class HousesActivity extends AppCompatActivity {

    private GridView gridView;

    // create a house adapter (gridAdapter)
 //   private HousesAdapter housesAdapter;
    private ArrayList<House> houseList;
    TextView textview;
    private ArrayList<HarryPotterCharacter> characterList = new ArrayList<>();
    private RecyclerView recyclerView;
    private CharacterAdapter characterAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_houses);

        gridView = findViewById(R.id.housesGridView);
        textview   = findViewById(R.id.selectedHouse);
        recyclerView = findViewById(R.id.housesRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        //CREATE A custome gridview
        //create a custome adapter

        houseList = new ArrayList<>();
        houseList.add(new House("Gryffindor", R.drawable.ic_house_gryffindor));
        houseList.add(new House("Hufflepuff", R.drawable.ic_house_hufflepuff));
        houseList.add(new House("Ravenclaw", R.drawable.ic_house_ravenclaw));
        houseList.add(new House("Slytherin", R.drawable.ic_house_slytherin));




//set Gridview onset item click listener to get data from server according to houses and set text







    }

    void requestTOServer(String house){

        characterList.clear();
        RequestQueue queue = Volley.newRequestQueue(HousesActivity.this);
        Log.d("HOUSEURL",GET_HOUSES+house);

        StringRequest stringRequest = new StringRequest(
                Request.Method.GET,
                GET_HOUSES+house,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        Log.d("ServerResponse", response);

                        try {
                            JSONArray jsonArray = new JSONArray(response);
                            for (int i = 0; i < jsonArray.length(); i++) {
                                JSONObject jsonObject = jsonArray.getJSONObject(i);

                                HarryPotterCharacter character = new HarryPotterCharacter();
                                character.setId(jsonObject.getString("id"));
                                character.setName(jsonObject.getString("name"));
                                character.setAlternate_names(convertJsonArrayToArrayList(jsonObject.getJSONArray("alternate_names")));
                                character.setSpecies(jsonObject.getString("species"));
                                character.setGender(jsonObject.getString("gender"));
                                character.setHouse(jsonObject.getString("house"));
                                character.setDateOfBirth(jsonObject.getString("dateOfBirth"));
                                if (jsonObject.has("yearOfBirth") && !jsonObject.isNull("yearOfBirth")) {
                                    character.setYearOfBirth(jsonObject.getInt("yearOfBirth"));
                                } else {
                                    character.setYearOfBirth(0); // or some default value or handling
                                }

                                character.setWizard(jsonObject.getBoolean("wizard"));
                                character.setAncestry(jsonObject.getString("ancestry"));
                                character.setEyeColour(jsonObject.getString("eyeColour"));
                                character.setHairColour(jsonObject.getString("hairColour"));

                                JSONObject wandObject = jsonObject.getJSONObject("wand");
                                HarryPotterCharacter.Wand wand = new HarryPotterCharacter.Wand();
                                wand.setWood(wandObject.getString("wood"));
                                wand.setCore(wandObject.getString("core"));
                                if (wandObject.has("length") && !wandObject.isNull("length")) {
                                    wand.setLength(wandObject.getInt("length"));
                                } else {
                                    wand.setLength(0); // or some default value or handling
                                }
                                character.setWand(wand);

                                character.setPatronus(jsonObject.getString("patronus"));
                                character.setHogwartsStudent(jsonObject.getBoolean("hogwartsStudent"));
                                character.setHogwartsStaff(jsonObject.getBoolean("hogwartsStaff"));
                                character.setActor(jsonObject.getString("actor"));
                                character.setAlternate_actors(convertJsonArrayToArrayList(jsonObject.getJSONArray("alternate_actors")));
                                character.setAlive(jsonObject.getBoolean("alive"));
                                character.setImage(jsonObject.getString("image"));

                                characterList.add(character);
                            }

                            characterAdapter = new CharacterAdapter(HousesActivity.this, characterList);
                            recyclerView.setAdapter(characterAdapter);
                            // Handle the ArrayList of characters here (e.g., update UI)

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

    private ArrayList<String> convertJsonArrayToArrayList(JSONArray jsonArray) throws JSONException {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            arrayList.add(jsonArray.getString(i));
        }
        return arrayList;
    }
}
