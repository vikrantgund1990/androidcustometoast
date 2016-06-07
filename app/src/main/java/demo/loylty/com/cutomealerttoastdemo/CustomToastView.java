package demo.loylty.com.cutomealerttoastdemo;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by vikrantg on 20-05-2016.
 */
public class CustomToastView extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custome_toast);
    }

    public void onGenerateTostClick(View v){

        TheToast.generateToast(this,"This is Toast",TheToast.LENGTH_SHORT);
    }

    public void onGenerateErrorTostClick(View v){
        TheToast.generateToast(this,"This is error Toast",TheToast.LENGTH_SHORT, TheToast.ERROR_TOAST);
    }

    public void onGenerateSuccessTostClick(View v){
        TheToast.generateToast(this,"This is success Toast",TheToast.LENGTH_SHORT, TheToast.SUCCESS_TOAST);
    }

}
