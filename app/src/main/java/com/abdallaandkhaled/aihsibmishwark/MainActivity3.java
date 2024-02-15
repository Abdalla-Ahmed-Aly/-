package  com.abdallaandkhaled.aihsibmishwark;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


import com.abdallaandkhaled.aihsibmishwark.R;
import com.github.nisrulz.sensey.Sensey;

public class MainActivity3 extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Sensey.getInstance().init(this);





    }


    public void link(View view) {
        String url = "https://www.linkedin.com/in/hanynemr";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);


    }

    public void facebook(View view) {
        String url = "https://www.facebook.com/TheTrainerHanyNemr?mibextid=ZbWKwL";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);


    }


    public void next(View view) {
        Intent i =new Intent(this,infor.class);
        startActivity(i);
    }

    public void KHabd(View view) {
        String url = "https://www.linkedin.com/in/khaled-mohamed-811041237";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    public void KHface(View view) {
        String url = "https://www.facebook.com/profile.php?id=100011324872824&mibextid=LQQJ4d";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);

    }

    public void AbdFacebook(View view) {
        String url = "https://www.facebook.com/abdallahahmed.ali.7?mibextid=LQQJ4d";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    public void Abdlink(View view) {
        String url = "https://www.linkedin.com/in/abdalaa-ahmed-8746aa24b";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}