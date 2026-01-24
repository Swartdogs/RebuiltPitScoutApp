package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Start_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start__page);
        //WARNING: Anything above this line do not edit

        //Below to dotted line defines the needed button and are used to bring you to data collection start page
        Button Start_Collection_Open = (Button) findViewById(R.id.Start_Collection_Open_B); //Defines button for later use
        Start_Collection_Open.setOnClickListener(new View.OnClickListener() { //Makes onclick listener for button
            @Override


            public void onClick(View v) {
                Data_Collection_Page_1.GenTeamNum = 0;
                Data_Collection_Page_1.GenAutoCodes = 0;
                        Data_Collection_Page_1.GenReefL1 = "False";
                        Data_Collection_Page_1.GenReefL2 = "False";
                        Data_Collection_Page_1.GenReefL3 = "False";
                        Data_Collection_Page_1.GenReefL4 = "False";
                        Data_Collection_Page_1.GenAutoRight = "False";
                        Data_Collection_Page_1.GenAutoGround = "False";
                        Data_Collection_Page_1.GenAutoLeft = "False";
                        data_Collection_sandstorm.CoralReefL1 = "False";
                        data_Collection_sandstorm.CoralReefL2 = "False";
                        data_Collection_sandstorm.CoralReefL3 = "False";
                        data_Collection_sandstorm.CoralReefL4 = "False";
                        data_Collection_sandstorm.CoralPickupGround = "False";
                        data_Collection_sandstorm.CoralPickupStation = "False";
                        data_Collection_sandstorm.AlgaePickupGround = "False";
                        data_Collection_sandstorm.AlgaePickupReef = "False";
                        data_Collection_sandstorm.AlgaePlaceProcessor = "False";
                        data_Collection_sandstorm.AlgaePlaceNet = "False";
                        data_Collection_sandstorm.AlgaeKnockYes = "False";
                        data_Collection_sandstorm.AlgaeKnockNo = "False";
                        data_collection_TeleOP.shallow = "False";
                        data_collection_TeleOP.deep = "False";
                        data_collection_TeleOP.NoFit = "False";
                        data_collection_end_game.EndPlayerProcessor = "False";
                        data_collection_end_game.EndPlayerStation = "False";
                        data_collection_end_game.EndPlayerNone = "False";
                        data_collection_end_game.EndSwerve = "False";
                        data_collection_end_game.EndTank = "False";
                        data_collection_end_game.EndOther = "False";
                        data_collection_end_game.EndOtherText = "NA";
                        data_collection_end_game.EndPreferenceAlgae = "False";
                        data_collection_end_game.EndPreferenceCoral = "False";
                        data_collection_end_game.EndPreferenceNo = "False";



                Intent startintent = new Intent(Start_Page.this, Data_Collection_Page_1.class);
                startActivity(startintent);
            }

        });
        //----------------------------------------------------------------------------------------------------------------

        /*
        //Below to dotted line defines the needed button and are used to bring you to the instruction page
        Button Instruct_Button = (Button) findViewById(R.id.Instructions);
        Instruct_Button.setOnClickListener(new View.OnClickListener()
        { //Makes onclick listener for button
            @Override
            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), Instructions_Page.class);
                startActivity(startintent);
            }
        });
        //----------------------------------------------------------------------------------------------------------------
    */
    }
}