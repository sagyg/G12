package com.amdocs.g12n;

import com.amdocs.common.Utils.Utils;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class G12Activity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        this.getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        
	    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        SeekBar seekBar = (SeekBar)findViewById(R.id.seekBar1);
        seekBar.setMax(100);
        //Utils.hideSoftKeyboard(this, this.get);
       //seekBar.setFadingEdgeLength(10);
       //seekBar.setVerticalFadingEdgeEnabled(true);
        ShapeDrawable thumb = new ShapeDrawable( new RectShape() );
        thumb.getPaint().setColor( 0x00FF00 );
        thumb.setIntrinsicHeight( 80 );
        thumb.setIntrinsicWidth( 30 );
        seekBar.setThumb( thumb );
        seekBar.setProgress(20);
        seekBar.setBackgroundColor(Color.DKGRAY);
   
  
   seekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
	   
	   @Override
	   public void onStopTrackingTouch(SeekBar seekBar) {
	   }
	   
	   @Override
	   public void onStartTrackingTouch(SeekBar seekBar) {
	    // TODO Auto-generated method stub
	   }
	   
	   @Override
	   public void onProgressChanged(SeekBar seekBar, int progress,
	     boolean fromUser) {
	   
	   }
	  });
      }
}