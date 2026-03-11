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
                        Data_Collection_Page_1.GenAutoDepot = "False";
                        Data_Collection_Page_1.GenAutoOutpost = "False";
                        Data_Collection_Page_1.GenAutoNeutral = "False";
                        Data_Collection_Page_1.GenAutoYes = "False";
                        Data_Collection_Page_1.GenAutoNo = "False";

                        data_Collection_sandstorm.Level1 = "False";
                        data_Collection_sandstorm.Level2 = "False";
                        data_Collection_sandstorm.Level3 = "False";

                        data_collection_TeleOP.EndSwerve = "False";
                        data_collection_TeleOP.EndTank = "False";
                        data_collection_TeleOP.EndOther = "False";
                        data_collection_TeleOP.EndOtherText = "NA";
                        data_collection_TeleOP.EndWeight = 0;
                        data_collection_TeleOP.EndTrench = "False";
                        data_collection_TeleOP.EndBump = "False";

                        data_collection_end_game.EndFuelShot = 0;
                        data_collection_end_game.EndTurretNo = "False";
                        data_collection_end_game.EndTurretYes = "False";
                        data_collection_end_game.EndMoveNo = "False";
                        data_collection_end_game.EndMoveYes = "False";


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