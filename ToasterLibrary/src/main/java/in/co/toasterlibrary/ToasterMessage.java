package in.co.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {
    public static void longToast(Context c,String message){
        Toast.makeText(c, ""+message, Toast.LENGTH_LONG).show();
    }
    public static void shortToast(Context c, String message){
        Toast.makeText(c, ""+message, Toast.LENGTH_LONG).show();

    }
}
