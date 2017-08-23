package com.example.utkarshshukla.chathead;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "UTKARSH";

    @RequiresApi ( api = Build.VERSION_CODES.JELLY_BEAN )
    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        try {
            Log.e ( TAG, "onCreate: INTENT FIRST" + getIntent ( ).getClipData ( ).getDescription ( ) +
                    getIntent ( ).getClipData ( ).getItemCount ( ) +
                    getIntent ( ).getClipData ( ).getItemAt ( 0 ).toString ( ) );
            String s = getIntent ( ).getClipData ( ).getItemAt ( 0 ).toString ( );
            int x = s.indexOf ( ":" );
            s = s.substring ( x + 1, s.length ( ) -1);
            Log.e ( TAG, "onCreate: " + s );
            Glide.with ( this ).load ( s ).into ( ( ImageView ) ( findViewById ( R.id.myimage ) ) );

        } catch ( Exception e ) {

        }

    }

}

