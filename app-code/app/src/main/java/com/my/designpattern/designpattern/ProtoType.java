package com.my.designpattern.designpattern;

import android.content.Context;
import android.widget.Toast;
import com.my.designpattern.Interface.ProtoClones;

public class ProtoType implements ProtoClones {

    private Context context;

    public ProtoType(Context context) {
        this.context=context;
    }



    public void Display() {
        for (int i = 0; i <= 50; i++) {
            Toast.makeText(context, "Protype: " + i, Toast.LENGTH_SHORT).show();
        }
    }



    @Override
    public Object clone1() {
        return new ProtoType(context);
    }


}
