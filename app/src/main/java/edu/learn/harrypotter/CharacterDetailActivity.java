package edu.learn.harrypotter;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import edu.learn.harrypotter.models.HarryPotterCharacter;
import edu.learn.harrypotterapp.R;

public class CharacterDetailActivity extends AppCompatActivity {

    private ImageView characterImage;
    private TextView characterName;
    private TextView actorName;
    private TextView dateOfBirth;
    private TextView gender;
    private TextView house;
    private TextView species;
    private TextView ancestry;
    private TextView eyeColour;
    private TextView hairColour;
    private TextView patronus;
    private TextView wand;
    private TextView alive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_detail);

        // Initialize views
        characterImage = findViewById(R.id.detail_character_image);
        characterName = findViewById(R.id.detail_character_name);
        actorName = findViewById(R.id.detail_actor_name);
        dateOfBirth = findViewById(R.id.detail_date_of_birth);
        gender = findViewById(R.id.detail_gender);
        house = findViewById(R.id.detail_house);
        species = findViewById(R.id.detail_species);
        ancestry = findViewById(R.id.detail_ancestry);
        eyeColour = findViewById(R.id.detail_eye_colour);
        hairColour = findViewById(R.id.detail_hair_colour);
        patronus = findViewById(R.id.detail_patronus);
        wand = findViewById(R.id.detail_wand);
        alive = findViewById(R.id.detail_alive);

        // Get the character object from the intent
        HarryPotterCharacter character = (HarryPotterCharacter) getIntent().getSerializableExtra("character");

        if (character != null) {
            // Load image using Glide
            Glide.with(this)
                    .load(character.getImage())
                    .into(characterImage);

            // Set character details
            characterName.setText(character.getName());
            actorName.setText("Played by: " + character.getActor());
            dateOfBirth.setText("DOB: " + character.getDateOfBirth());
            gender.setText("Gender: " + character.getGender());
            house.setText("House: " + character.getHouse());
            species.setText("Species: " + character.getSpecies());
            ancestry.setText("Ancestry: " + character.getAncestry());
            eyeColour.setText("Eye Colour: " + character.getEyeColour());
            hairColour.setText("Hair Colour: " + character.getHairColour());
            patronus.setText("Patronus: " + character.getPatronus());

            // Set wand details
            HarryPotterCharacter.Wand characterWand = character.getWand();
            if (characterWand != null) {
                wand.setText("Wand: " + characterWand.getWood() + " wood, core: " + characterWand.getCore() + ", length: " + characterWand.getLength() + " inches");
            } else {
                wand.setText("Wand: No wand information");
            }

            // Set alive status
            alive.setText("Alive: " + (character.isAlive() ? "Yes" : "No"));
        }
    }
}
