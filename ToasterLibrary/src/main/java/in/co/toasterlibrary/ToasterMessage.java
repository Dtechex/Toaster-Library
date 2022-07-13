package in.co.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {
    public static void main(Context c,String s){
        Toast.makeText(c, ""+s, Toast.LENGTH_SHORT).show();
    }
}
