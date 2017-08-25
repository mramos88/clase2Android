package com.example.android.myapplication;

import android.util.Log;
import android.view.View;
import android.widget.EditText;

/**
 * Created by android on 24/08/17.
 */

public class MyListener implements View.OnClickListener
{
    EditText editText;

    public MyListener(EditText editText){
        this.editText = editText;

    }
    @Override
    public void onClick(View v) {

        Log.d("Se hizo click",editText.getText()+"");
    }
}
