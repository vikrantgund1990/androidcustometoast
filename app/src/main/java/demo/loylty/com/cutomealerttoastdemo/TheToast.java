package demo.loylty.com.cutomealerttoastdemo;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by vikrantg on 06-06-2016.
 */
public class TheToast {

    public static final int INFO_TOAST = 1;
    public static final int ERROR_TOAST = 2;
    public static final int SUCCESS_TOAST = 3;
    public static final int LENGTH_SHORT = Toast.LENGTH_SHORT;
    public static final int LENGTH_LONG = Toast.LENGTH_LONG;

    public static void generateToast(Context context,String message,int duration){

        Toast toast = new Toast(context);
        toast.setGravity(Gravity.TOP, 0, 200);
        toast.setDuration(duration);
        toast.setView(getToastLayout(context,message,INFO_TOAST));
        toast.show();
    }

    public static void generateToast(Context context,String message,int duration,int toastType){

        Toast toast = new Toast(context);
        toast.setGravity(Gravity.TOP, 0, 200);
        toast.setDuration(duration);
        toast.setView(getToastLayout(context,message,toastType));
        toast.show();
    }

    private static View getToastLayout(Context context,String msg,int toastType){

        LinearLayout layout = new LinearLayout(context);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        layout.setLayoutParams(params);
        layout.setPadding(20,10,20,10);

        switch (toastType){
            case INFO_TOAST:
                layout.setBackgroundResource(R.drawable.toast_background);
                break;
            case ERROR_TOAST:
                layout.setBackgroundResource(R.drawable.error_toast_bachground);
                break;
            case SUCCESS_TOAST:
                layout.setBackgroundResource(R.drawable.success_toast_background);
                break;
        }

        ViewGroup.LayoutParams textParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        TextView text = new TextView(context);
        text.setLayoutParams(textParams);
        text.setText(msg);
        text.setTextColor(Color.BLACK);
        layout.addView(text);

        return layout;

    }
}
