package hurdleg.commonsizeofandroid;

/**
 * Display common sizeof()'s on Android operating system, featuring NDK and 'C'.
 *
 * Source Code: https://github.com/hurdleg/common-sizeofs-android.git
 *
 * @author Gerald.Hurdle@AlgonquinCollege.com
 */

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("sizeof-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvInt = findViewById(R.id.sizeof_int);
        // Example of a call to a native method
        tvInt.setText( getInt() + "" );
        TextView tvChar = findViewById(R.id.sizeof_char);
        tvChar.setText( getChar() + "" );
        TextView tvShort = findViewById(R.id.sizeof_short);
        tvShort.setText( getShort() + "" );

        TextView tvLong = findViewById(R.id.sizeof_long);
        tvLong.setText( getLong() + "" );
        TextView tvFloat = findViewById(R.id.sizeof_float);
        tvFloat.setText( getFloat() + "" );
        TextView tvDouble = findViewById(R.id.sizeof_double);
        tvDouble.setText( getDouble() + "" );

        TextView tvCharPtr = findViewById(R.id.sizeof_char_ptr);
        tvCharPtr.setText( getCharPtr() + "" );
        TextView tvIntPtr = findViewById(R.id.sizeof_int_ptr);
        tvIntPtr.setText( getIntPtr() + "" );
        TextView tvLongPtr = findViewById(R.id.sizeof_long_ptr);
        tvLongPtr.setText( getLongPtr() + "" );
        TextView tvDoublePtr = findViewById(R.id.sizeof_double_ptr);
        tvDoublePtr.setText( getDoublePtr() + "" );
    }

    /**
     * Native methods that are implemented by the 'sizeof-lib' native library,
     * which is packaged with this application.
     */
    public native int getChar();
    public native int getCharBit();
    public native int getCharPtr();
    public native int getDouble();
    public native int getDoublePtr();
    public native int getFloat();
    public native int getInt();
    public native int getIntPtr();
    public native int getLong();
    public native int getLongPtr();
    public native int getShort();
}
//
//class SizeofLib {
//    public native int getInt();
//}
