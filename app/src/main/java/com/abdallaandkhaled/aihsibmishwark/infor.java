package   com.abdallaandkhaled.aihsibmishwark;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.abdallaandkhaled.aihsibmishwark.R;


public class infor extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infor);




}

    public void link2(View view) {
        String url = "https://www.linkedin.com/in/khaled-mohamed-811041237";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);


    }

    public void face2(View view) {
        String url = "https://www.facebook.com/profile.php?id=100011324872824&mibextid=LQQJ4d";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);

    }

    public void link1(View view) {
        String url = "https://www.linkedin.com/in/abdalaa-ahmed-8746aa24b";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    public void face1(View view) {
        String url = "https://www.facebook.com/abdallahahmed.ali.7?mibextid=LQQJ4d";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }




    public void back(View view) {
        Intent i =new Intent(this,MainActivity3.class);
        startActivity(i);
    }
}