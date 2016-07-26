package com.example.appcreate48.gotogether_2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by appcreate48 on 2016. 7. 26..
 */
public class ModificationActivity extends AppCompatActivity {
    Button change;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modification);
        change = (Button)findViewById(R.id.changeProfile);

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String[] picture = new String[] {"카메라","갤러리"};
                AlertDialog.Builder dig = new AlertDialog.Builder(ModificationActivity.this);
                dig.setTitle("프로필 사진 바꾸기");
                dig.setIcon(R.drawable.heart);
                dig.setItems(picture,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                change.setText(picture[which]);

                            }
                        });
                dig.setPositiveButton("닫기",null);
                dig.show();
            }
        });
    }
}
