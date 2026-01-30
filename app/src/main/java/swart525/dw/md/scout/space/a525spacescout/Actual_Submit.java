package swart525.dw.md.scout.space.a525spacescout;
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Actual_Submit extends AppCompatActivity {

    //Names the file it will be saved to
    public String fileName = "Pit_Scouting_Data.CSV";
    public String filePath = "/ScoutData/";

    //This is debugging
    //final View txtDebug =(View)findViewById(R.id.TextViewDebug)

    //Compiles string for CSV file
    public String Final_String =
         Data_Collection_Page_1.GenTeamNum + "," +
         Data_Collection_Page_1.GenAutoCodes + "," +
         Data_Collection_Page_1.GenAutoDepot + "," +
         Data_Collection_Page_1.GenAutoOutpost + "," +
         Data_Collection_Page_1.GenAutoNeutral + "," +
         Data_Collection_Page_1.GenAutoLeft + "," +
         Data_Collection_Page_1.GenAutoMiddle + "," +
                 Data_Collection_Page_1.GenAutoRight + "," +
                 data_Collection_sandstorm.TeleopDepot + "," +
                 data_Collection_sandstorm.TeleopOutpost + ',' +
                 data_Collection_sandstorm.TeleopNeutralZone + ',' +
         data_collection_TeleOP.Level1 + "," +
         data_collection_TeleOP.Level2 + "," +
         data_collection_TeleOP.Level3 + "," +
         data_collection_end_game.EndTrenchYes + "," +
                 data_collection_end_game.EndTrenchNo + "," +
                 data_collection_end_game.EndBumpYes + "," +
         data_collection_end_game.EndBumpNo + "," +
         data_collection_end_game.EndSwerve + "," +
         data_collection_end_game.EndTank + "," +
                 data_collection_end_game.EndOther + "," +
                 data_collection_end_game.EndOtherText;

    File externalStorageDir = Environment.getExternalStorageDirectory();
    public File Scout_Data = new File(externalStorageDir , "/DCIM/" + fileName);

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actual__submit);
        Button Press_Here = (Button) findViewById(R.id.Press_Here_B);
        //Button Click_to_go_Back = (Button) findViewById(R.id.Backto);
    }*/


    //Checks for confirmation from external storage
        private boolean isExternalStorageWritable () {
            if (Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState())) {
                Log.i("State", "Yes, it is writable!");
                return true;
            } else {
                return false;
            }
        }

        public void Press_Here (View v){
            //Toast.makeText(this, "Start", Toast.LENGTH_LONG).show();
            //txtDebug.setTe("test");
            if (isExternalStorageWritable() && checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
                Toast.makeText(this, "First If", Toast.LENGTH_LONG).show();
                if(Scout_Data.exists() && Scout_Data.isFile() ){
                    try {
                        final Button Press_Here = (Button) findViewById(R.id.Press_Here_B);
                        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(Scout_Data, true)));
                        out.println(Final_String);
                        out.close();
                        Toast.makeText(this, "File Saved", Toast.LENGTH_LONG).show();
                        Press_Here.setVisibility(View.GONE);
                        Intent startintent = new Intent(getApplicationContext(), Start_Page.class);
                        startActivity(startintent);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    File textFile = new File(Environment.getExternalStorageDirectory().getPath() + "/DCIM", fileName);
                    try {
                        final Button Press_Here = (Button) findViewById(R.id.Press_Here_B);
                        FileOutputStream fos = new FileOutputStream(textFile);
                        Final_String = Final_String + "\n";
                        fos.write(Final_String.getBytes());
                        fos.close();
                        Toast.makeText(this, "File Saved", Toast.LENGTH_LONG).show();
                        Press_Here.setVisibility(View.GONE);
                        Intent startintent = new Intent(getApplicationContext(), Start_Page.class);
                        startActivity(startintent);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            Toast.makeText(this, "No permissions", Toast.LENGTH_LONG).show();
        }

    public boolean checkPermission (String permission) {
        int check = ContextCompat.checkSelfPermission(this, permission);
        return (check == PackageManager.PERMISSION_GRANTED);
    }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_actual__submit);
            //Button Press_Here = (Button) findViewById(R.id.Press_Here_B);;
            setContentView(R.layout.activity_actual__submit);
            final Button Press_Here = (Button) findViewById(R.id.Press_Here_B);
            Press_Here.setVisibility(View.VISIBLE);

    }
}










