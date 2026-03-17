package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class Data_Collection_Page_1 extends AppCompatActivity {

    //Defines variables for data collection
    public static int GenTeamNum = 0;
    public static int GenAutoCodes = 0;
    public static String GenAutoDepot = "False";
    public static String GenAutoNeutral = "False";
    public static String GenAutoOutpost = "False";
    public static String GenAutoYes = "False";
    public static String GenAutoNo = "False";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection__page_1);

        //Sets up comparison number
        final int CompareTeamNum = 0; //Team must be greater than 1

        //Defines all EditText boxes
        final EditText GenTeamNumTXT = (EditText) findViewById(R.id.genTeamNum_TXT);
        final EditText GenAutoCodesTXT = (EditText) findViewById(R.id.genAutoCodes_TXT);

        //Defines all Buttons
        final Button GenAutoDepotB = (Button) findViewById(R.id.genPickupDepot_B);
        GenAutoDepotB.setTag("D7D7D7D5");

        final Button GenAutoOutpostB = (Button) findViewById(R.id.genPickupOutpost_B);
        GenAutoOutpostB.setTag("D7D7D7D5");

        final Button GenAutoNeutralB = (Button) findViewById(R.id.genPickupNeutralZone_B);
        GenAutoNeutralB.setTag("D7D7D7D5");

        //Defines all Radio Buttons
        final RadioButton AutoHangYesRB = (RadioButton) findViewById(R.id.autoHangYes_RB);
        final RadioButton AutoHangNoRB = (RadioButton) findViewById(R.id.autoHangNo_RB);

        GenAutoDepotB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) GenAutoDepotB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    GenAutoDepotB.setBackgroundColor(ContextCompat.getColor(GenAutoDepotB.getContext(), R.color.colorPrimary));
                    GenAutoDepotB.setTag("#FFE600");
                    GenAutoDepot = "true";
                }
                else if("#FFE600".equals(colorCode)){
                    GenAutoDepotB.setBackgroundColor(ContextCompat.getColor(GenAutoDepotB.getContext(), R.color.grey_button));
                    GenAutoDepotB.setTag("D7D7D7D5");
                    GenAutoDepot = "false";
                }


            }

        });
        GenAutoOutpostB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) GenAutoDepotB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    GenAutoOutpostB.setBackgroundColor(ContextCompat.getColor(GenAutoDepotB.getContext(), R.color.colorPrimary));
                    GenAutoOutpostB.setTag("#FFE600");
                    GenAutoOutpost = "true";
                }
                else if("#FFE600".equals(colorCode)){
                    GenAutoOutpostB.setBackgroundColor(ContextCompat.getColor(GenAutoDepotB.getContext(), R.color.grey_button));
                    GenAutoOutpostB.setTag("D7D7D7D5");
                    GenAutoOutpost = "false";
                }


            }

        });
        GenAutoNeutralB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) GenAutoNeutralB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    GenAutoNeutralB.setBackgroundColor(ContextCompat.getColor(GenAutoNeutralB.getContext(), R.color.colorPrimary));
                    GenAutoNeutralB.setTag("#FFE600");
                    GenAutoNeutral = "true";
                }
                else if("#FFE600".equals(colorCode)){
                    GenAutoNeutralB.setBackgroundColor(ContextCompat.getColor(GenAutoNeutralB.getContext(), R.color.grey_button));
                    GenAutoNeutralB.setTag("D7D7D7D5");
                    GenAutoNeutral = "false";
                }


            }

        });


        //Defines Button to cancel data collection
        Button Cancel_Collection = (Button) findViewById(R.id.genCancel_B);
        Cancel_Collection.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), Start_Page.class);
                startActivity(startintent);
            }
        });

        //Defines Button to next page
        Button gen_Next = (Button) findViewById(R.id.genNextPage_B);

        //Makes onclick listener for next page button
        gen_Next.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override
            public void onClick(View v) {

                //Sets variables to true if checked
                if (AutoHangYesRB.isChecked()) {
                    GenAutoYes= "True";
                }
                if (AutoHangNoRB.isChecked()) {
                    GenAutoNo = "True";
                }


                //Collect text inputs and ensures they are filled
                if (GenTeamNumTXT.getText().toString().isEmpty() || GenAutoCodesTXT.getText().toString().isEmpty()) {
                    Toast.makeText(Data_Collection_Page_1.this, "Cannot Continue. Please Enter Team Number Or Auto Codes!", Toast.LENGTH_LONG).show();
                }
                else{
                    //Checks if team number inputted makes sense
                    int Team_Num_Real = Integer.parseInt(GenTeamNumTXT.getText().toString());
                    if (CompareTeamNum < Team_Num_Real) {
                        GenTeamNum = Integer.parseInt(GenTeamNumTXT.getText().toString()); //Sets team num data to txt box information
                        GenAutoCodes = Integer.parseInt(GenAutoCodesTXT.getText().toString());

                        Intent startintent = new Intent(getApplicationContext(), data_Collection_sandstorm.class);
                        startActivity(startintent);
                    }
                    else {
                        Toast.makeText(Data_Collection_Page_1.this, "This error should not be reached. Uh Oh!", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }

}