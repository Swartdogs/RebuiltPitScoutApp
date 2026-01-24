package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
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
    public static String GenReefL1 = "False";
    public static String GenReefL2 = "False";
    public static String GenReefL3 = "False";
    public static String GenReefL4 = "False";
    public static String GenAutoLeft = "False";
    public static String GenAutoRight = "False";
    public static String GenAutoGround = "False";


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
        final CheckBox GenReefL1CB = (CheckBox) findViewById(R.id.genAutoPlaceL1_CB);
        final CheckBox GenReefL2CB = (CheckBox) findViewById(R.id.genAutoPlaceL2_CB);
        final CheckBox GenReefL3CB = (CheckBox) findViewById(R.id.genAutoPlaceL3_CB);
        final CheckBox GenReefL4CB = (CheckBox) findViewById(R.id.genAutoPlaceL4_CB);
        final CheckBox GenAutoLeftCB = (CheckBox) findViewById(R.id.genPickupLeft_CB);
        final CheckBox GenAutoRightCB = (CheckBox) findViewById(R.id.genPickupRight_CB);
        final CheckBox GenAutoGroundCB = (CheckBox) findViewById(R.id.genPickupGround_CB);

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
                if (GenReefL1CB.isChecked()) {
                    GenReefL1= "True";
                }
                if (GenReefL2CB.isChecked()) {
                    GenReefL2 = "True";
                }
                if (GenReefL3CB.isChecked()) {
                    GenReefL3= "True";
                }
                if (GenReefL4CB.isChecked()) {
                    GenReefL4= "True";
                }
                if (GenAutoRightCB.isChecked()) {
                    GenAutoRight= "True";
                }
                if (GenAutoLeftCB.isChecked()) {
                    GenAutoLeft= "True";
                }
                if (GenAutoGroundCB.isChecked()) {
                    GenAutoGround= "True";
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