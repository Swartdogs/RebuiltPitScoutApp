package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


public class Data_Collection_Page_1 extends AppCompatActivity {

    //Defines variables for data collection
    public static int GenTeamNum = 0;
    public static int GenAutoCodes = 20;
    public static String GenAutoDepot = "False";
    public static String GenAutoNeutral = "False";
    public static String GenAutoOutpost = "False";
    public static String GenAutoLeft = "False";
    public static String GenAutoMiddle = "False";
    public static String GenAutoRight = "False";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__collection__page_1);

        //Sets up comparison number
        final int CompareTeamNum = 1; //Team must be greater than 1

        //Defines all EditText boxes
        final EditText GenTeamNumTXT = (EditText) findViewById(R.id.genTeamNum_TXT);
        final EditText GenAutoCodesTXT = (EditText) findViewById(R.id.genAutoCodes_TXT);

        //Defines all CheckBoxes
        final CheckBox GenAutoDepotCB = (CheckBox) findViewById(R.id.genPickupDepot_CB);
        final CheckBox GenAutoNeutralCB = (CheckBox) findViewById(R.id.genPickupNeutral_CB);
        final CheckBox GenAutoOutpostCB = (CheckBox) findViewById(R.id.genPickupOutpost_CB);

        //Defines all Buttons
        final Button GenAutoLeftB = (Button) findViewById(R.id.genStartLeft_B);
        GenAutoLeftB.setTag("D7D7D7D5");

        final Button GenAutoMiddleB = (Button) findViewById(R.id.genStartMiddle_B);
        GenAutoMiddleB.setTag("D7D7D7D5");

        final Button GenAutoRightB = (Button) findViewById(R.id.genStartRight_B);
        GenAutoRightB.setTag("D7D7D7D5");

        GenAutoLeftB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) GenAutoLeftB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    GenAutoLeftB.setBackgroundColor(ContextCompat.getColor(GenAutoLeftB.getContext(), R.color.colorPrimary));
                    GenAutoLeftB.setTag("#FFE600");
                    GenAutoLeft = "true";
                }
                else if("#FFE600".equals(colorCode)){
                    GenAutoLeftB.setBackgroundColor(ContextCompat.getColor(GenAutoLeftB.getContext(), R.color.grey_button));
                    GenAutoLeftB.setTag("D7D7D7D5");
                    GenAutoLeft = "false";
                }


            }

        });
        GenAutoMiddleB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) GenAutoMiddleB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    GenAutoMiddleB.setBackgroundColor(ContextCompat.getColor(GenAutoMiddleB.getContext(), R.color.colorPrimary));
                    GenAutoMiddleB.setTag("#FFE600");
                    GenAutoMiddle = "true";
                }
                else if("#FFE600".equals(colorCode)){
                    GenAutoMiddleB.setBackgroundColor(ContextCompat.getColor(GenAutoMiddleB.getContext(), R.color.grey_button));
                    GenAutoMiddleB.setTag("D7D7D7D5");
                    GenAutoMiddle = "false";
                }


            }

        });
        GenAutoRightB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String colorCode = (String) GenAutoRightB.getTag();
                if (!"#FFE600".equals(colorCode)){
                    GenAutoRightB.setBackgroundColor(ContextCompat.getColor(GenAutoRightB.getContext(), R.color.colorPrimary));
                    GenAutoRightB.setTag("#FFE600");
                    GenAutoRight = "true";
                }
                else if("#FFE600".equals(colorCode)){
                    GenAutoRightB.setBackgroundColor(ContextCompat.getColor(GenAutoRightB.getContext(), R.color.grey_button));
                    GenAutoRightB.setTag("D7D7D7D5");
                    GenAutoRight = "false";
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
                if (GenAutoDepotCB.isChecked()) {
                    GenAutoDepot= "True";
                }
                if (GenAutoOutpostCB.isChecked()) {
                    GenAutoOutpost = "True";
                }
                if (GenAutoNeutralCB.isChecked()) {
                    GenAutoNeutral = "True";
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