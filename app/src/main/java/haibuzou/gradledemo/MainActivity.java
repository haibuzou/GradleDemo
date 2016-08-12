package haibuzou.gradledemo;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView versionName = (TextView) findViewById(R.id.version_name);
        TextView versionCode = (TextView) findViewById(R.id.version_code);
        try{
            PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(),0);
            versionName.setText("versionName: "+packageInfo.versionName);
            versionCode.setText("packageName: "+getPackageName());
        }catch (Exception e){
        }

    }
}
