package swart525.dw.md.scout.space.a525spacescout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Delete_Data extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete__data);
        Button Delete = (Button) findViewById(R.id.Delete_B);
        Button Cancel = (Button) findViewById(R.id.Cancel_B);
        final CheckBox Del_Confirm = (CheckBox) findViewById(R.id.ConfirmDelete_CB);

        Delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Del_Confirm.isChecked()){
                    Intent startintent = new Intent(getApplicationContext(), Start_Page.class);
                    startActivity(startintent);
                }
            }
        });

        Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), Save_Page.class);
                startActivity(startintent);
            }
        });

    }
}
