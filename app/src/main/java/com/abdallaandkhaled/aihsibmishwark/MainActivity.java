package com.abdallaandkhaled.aihsibmishwark;

import
        androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.abdallaandkhaled.aihsibmishwark.R;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

import mumayank.com.airlocationlibrary.AirLocation;


public class MainActivity extends AppCompatActivity implements AirLocation.Callback {

    AirLocation a, AirLocation;
    private static final int LOCATION_PERMISSION_REQUEST_CODE = 1;
    ProgressBar pr;
    EditText addText, add2Text, Add3Text, Add4Text;
    TextView resText, newa;
    FusedLocationProviderClient op;


    ImageView s;
    Spinner Com, whered;
    double cost1;
    float fi;
    float distance;
    private List<name_stashion<String, Double, Double>> gas = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addText = findViewById(R.id.addText);
        add2Text = findViewById(R.id.add2Text);
        Add3Text = findViewById(R.id.addtext3);
        Add4Text = findViewById(R.id.addtext4);
        resText = findViewById(R.id.resText);
        pr = findViewById(R.id.progres);

        newa = findViewById(R.id.newa);
        s = findViewById(R.id.imageView17);
        Com = findViewById(R.id.sp);
        newa.setMovementMethod(new ScrollingMovementMethod());
        resText.setMovementMethod(new ScrollingMovementMethod());
        op = LocationServices.getFusedLocationProviderClient(this);


        Toast.makeText(this, "اضغط على السياره لاختيار نوع سيارتك", Toast.LENGTH_LONG).show();

        final String str[] = {"select car or cc", "FIAT", "JEEP", "Reno", "Peugeot", "Mg", "Verna", "BMW", "Mercedes", "Citreon", "Toyota", "Nissan", "Lada", "Kia Spotrage", "Volvo", "Mini Copper", "Mitsubishi lancer", "Chevrolet", "Suzuki", "Rang Rover", "Porsche", "1000 cc", "1500 cc", "2000 cc", "2500 cc", "3000 cc", "3500 cc", "4000 cc", "4500 cc", "5000 cc", "5500 cc", "6000 cc", "6500 cc", "7000 cc", "7500 cc", "8000 cc", "8500 cc", "9000 cc"};
        ArrayAdapter adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_dropdown_item_1line, str);
        Com.setAdapter(adapter);
        Com.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                if (str[1].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.img_1);
                } else if (str[2].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.img_3);
                } else if (str[3].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.img_23);
                } else if (str[4].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.pegut);
                } else if (str[5].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.img_7);
                } else if (str[6].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.img_8);
                } else if (str[7].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.img_9);
                } else if (str[8].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.img_10);
                } else if (str[9].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.img_11);
                } else if (str[10].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.img_12);
                } else if (str[11].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.img_13);
                } else if (str[12].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.img_14);
                } else if (str[13].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.img_15);
                } else if (str[14].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.img_16);
                } else if (str[15].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.img_17);
                } else if (str[16].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.img_18);
                } else if (str[17].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.img_19);
                } else if (str[18].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.img_20);
                } else if (str[19].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.img_21);
                } else if (str[20].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.img_22);
                } else if (str[21].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.cc);
                } else if (str[22].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.cc);
                } else if (str[23].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.cc);
                } else if (str[24].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.cc);
                } else if (str[25].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.cc);
                } else if (str[26].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.cc);
                } else if (str[27].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.cc);
                } else if (str[28].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.cc);
                } else if (str[29].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.cc);
                } else if (str[30].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.cc);
                } else if (str[31].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.cc);
                } else if (str[32].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.cc);
                } else if (str[33].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.cc);
                } else if (str[34].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.cc);
                } else if (str[35].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.cc);
                } else if (str[36].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.cc);
                } else if (str[37].equals(Com.getItemAtPosition(i).toString())) {
                    s.setImageResource(R.drawable.cc);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }


        });

        getLastLocion();
        pr.setVisibility(View.GONE);
        if (ContextCompat.checkSelfPermission(MainActivity.this,
                Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(MainActivity.this,
                    Manifest.permission.ACCESS_FINE_LOCATION)) {
                ActivityCompat.requestPermissions(MainActivity.this,
                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
                pr.setVisibility(View.GONE);
            } else {
                ActivityCompat.requestPermissions(MainActivity.this,
                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
                pr.setVisibility(View.GONE);
            }
        }
    }

    public void onRequstPermissionResult(int requestCode, String[] permissions, int[] grantResult) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResult);
        if (requestCode == 1) {
            if (grantResult.length > 0 && grantResult[0] == PackageManager.PERMISSION_GRANTED) {
                pr.setVisibility(View.GONE);
            } else {

            }
        }
        switch (requestCode) {
            case 1: {
                if (grantResult.length > 0 && grantResult[0] == PackageManager.PERMISSION_GRANTED) {
                    if (ContextCompat.checkSelfPermission(MainActivity.this,
                            Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED)
                        ;
                    pr.setVisibility(View.GONE);
                } else {

                }
                return;
            }
        }

    }


    private void getLastLocion() {

        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            pr.setVisibility(View.GONE);
            return;
        }
        Task<Location> locationTask = op.getLastLocation().addOnSuccessListener(new OnSuccessListener<Location>() {
            @Override
            public void onSuccess(Location location) {
                if (location != null) {
                    Geocoder geocoder = new Geocoder(MainActivity.this);
                    List<Address> addresses = null;
                    try {
                        addresses = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
                        if (!addresses.isEmpty()) {
                            String currentAddress = addresses.get(0).getAddressLine(0);
                            addText.setText(currentAddress);
                            pr.setVisibility(View.GONE);
                            return;
                        } else {
                            Toast.makeText(MainActivity.this, "عنوان غير متاح", Toast.LENGTH_SHORT).show();
                            pr.setVisibility(View.GONE);

                        }
                    } catch (IOException e) {
                        Toast.makeText(MainActivity.this, "حدث خطأ", Toast.LENGTH_SHORT).show();
                        pr.setVisibility(View.GONE);
                    }
                } else {
                    Toast.makeText(MainActivity.this, "الموقع غير متاح", Toast.LENGTH_SHORT).show();
                    pr.setVisibility(View.GONE);
                    return;
                }

            }
        });

    }


    public void show(View view) {

        String address = addText.getText().toString().trim() + " مصر ";
        String address2 = add2Text.getText().toString().trim() + " مصر ";
        String address3 = Add3Text.getText().toString().trim() + " مصر ";
        String address4 = Add4Text.getText().toString().trim() + " مصر ";

        if (Com.getSelectedItem().toString().equals("select car or cc")) {
            Toast.makeText(this, "برجاء اختيار نوع سياره", Toast.LENGTH_SHORT).show();
            pr.setVisibility(View.GONE);
            return;
        } else
            pr.setVisibility(View.VISIBLE);
        resText.setText("");
        newa.setText("");

        String address1 = addText.getText().toString();
        String addresss2 = add2Text.getText().toString();
        String addresss3 = Add3Text.getText().toString();
        String addresss4 = Add4Text.getText().toString();

        Geocoder gm = new Geocoder(this, new Locale("ar"));

        try {
            gas.clear();

            if (!address1.isEmpty()) {
                addPlaceToLocationList(address1, gm);
            }
            if (!addresss2.isEmpty()) {
                addPlaceToLocationList(addresss2, gm);
            }
            if (!addresss3.isEmpty()) {
                addPlaceToLocationList(addresss3, gm);
            }
            if (!addresss4.isEmpty()) {
                addPlaceToLocationList(addresss4, gm);
            }

            a = new AirLocation(this, this, true, 0, "");
            a.start();


        } catch (Exception e) {
            Toast.makeText(this, "برجاء فتح الانترنت وضغط علي زرار احسب مشوارك وتأكد من العنواوين المدخله ", Toast.LENGTH_SHORT).show();
            pr.setVisibility(View.GONE);
        }
    }

    private boolean isValidAddress(String address) {
        Geocoder geocoder = new Geocoder(this);
        try {
            List<Address> addresses = geocoder.getFromLocationName(address, 1);
            pr.setVisibility(View.GONE);
            return !addresses.isEmpty();
        } catch (IOException e) {
            Toast.makeText(this, "حدث خطأ", Toast.LENGTH_SHORT).show();
            pr.setVisibility(View.GONE);
            return true;
        }
    }

    private void addPlaceToLocationList(String address, Geocoder g) throws Exception {
        List<Address> addresses = g.getFromLocationName(address, 1);
        if (!addresses.isEmpty()) {
            Address addr = addresses.get(0);
            double latitude = addr.getLatitude();
            double longitude = addr.getLongitude();
            gas.add(new name_stashion<>(address, latitude, longitude));
        }
    }

    @Override
    public void onSuccess(@NonNull ArrayList<Location> arrayList) {


        if (addText.getText().toString().isEmpty()) {
            Toast.makeText(this, "برجاء اختار العنوان الاول", Toast.LENGTH_SHORT).show();
            pr.setVisibility(View.GONE);
            return;
        }

        if (add2Text.getText().toString().isEmpty()) {
            Toast.makeText(this, "برجاء اختار العنوان تاني", Toast.LENGTH_SHORT).show();
            pr.setVisibility(View.GONE);
            return;
        }


        Geocoder g = new Geocoder(this, new Locale("ar"));
        String address = addText.getText().toString().trim() + " مصر ";
        String address2 = add2Text.getText().toString().trim() + " مصر ";
        String address3 = Add3Text.getText().toString().trim() + " مصر ";
        String address4 = Add4Text.getText().toString().trim() + " مصر ";


        try {


            if (address.equals(address2) || address.equals(address3) || address.equals(address4)) {
                Toast.makeText(this, "برجاء اختيار عنوان مختلف عن العنوان الاول", Toast.LENGTH_SHORT).show();
                pr.setVisibility(View.GONE);
                return;
            }
            if (address2.equals(address) || address2.equals(address3) || address2.equals(address4)) {
                Toast.makeText(this, "برجاء اختيار عنوان مختلف عن العنوان التاني", Toast.LENGTH_SHORT).show();
                pr.setVisibility(View.GONE);
                return;
            }
            if (address3.equals(address) || address3.equals(address2) || address3.equals(address4) && !Add4Text.getText().toString().isEmpty()) {
                Toast.makeText(this, "برجاء اختيار عنوان مختلف عن العنوان الثالث", Toast.LENGTH_SHORT).show();
                pr.setVisibility(View.GONE);
                return;
            }
            if (address4.equals(address) || address4.equals(address2) || address4.equals(address3) && !Add3Text.getText().toString().isEmpty()) {
                Toast.makeText(this, "برجاء اختيار عنوان مختلف عن العنوان الرابع", Toast.LENGTH_SHORT).show();
                pr.setVisibility(View.GONE);
                return;
            }
            try {
                Location loc2 = null, loc3 = null, loc1 = null, loc4 = null;
                double latitude2 = 0, latitude = 0, longitude = 0, latitude3 = 0, longitude3 = 0, longitude4 = 0, latitude4 = 0;
                double longitude2;
                List<Address> addresses = g.getFromLocationName(address, 1);
                List<Address> addresses2 = g.getFromLocationName(address2, 1);
                List<Address> addresses3 = g.getFromLocationName(address3, 1);
                List<Address> addresses4 = g.getFromLocationName(address4, 1);


                float distance0;
                float d;
                float d2;
                float d3;
                double cost3 = 0.0;
                double cost2 = 0.0;
                double cost = 0.0;
                double cost11 = 0.0;

                if (addText.getText().toString().isEmpty() && add2Text.getText().toString().isEmpty() && Add3Text.getText().toString().isEmpty() && Add4Text.getText().toString().isEmpty()) {
                    Toast.makeText(this, "برجاء املاء الفراغات", Toast.LENGTH_SHORT).show();
                    pr.setVisibility(View.GONE);
                    return;
                } else if (Add3Text.getText().toString().isEmpty() && Add4Text.getText().toString().isEmpty()) {

                    if (address.equals(address2) || address.equals(address3) || address.equals(address4)) {
                        Toast.makeText(this, "هذا المكان تم كتابته من قبل لرجاء مراجعه الاماكن المدخله", Toast.LENGTH_SHORT).show();
                        pr.setVisibility(View.GONE);
                        return;
                    } else {
                        if (addresses == null || addresses.size() == 0 || addresses.get(0).getAddressLine(0).equalsIgnoreCase("مصر")) {
                            Toast.makeText(this, "الرجاء التأكد من العنوان الاول", Toast.LENGTH_SHORT).show();
                            pr.setVisibility(View.GONE);
                            return;
                        } else {
                            pr.setVisibility(View.VISIBLE);

                            latitude = addresses.get(0).getLatitude();
                            longitude = addresses.get(0).getLongitude();

                            loc1 = new Location("");

                            loc1.setLatitude(latitude);
                            loc1.setLongitude(longitude);
                        }
                        if (addresses2 == null || addresses2.size() == 0 || addresses2.get(0).getAddressLine(0).equalsIgnoreCase("مصر")) {
                            Toast.makeText(this, "الرجاء التأكد من العنوان التاني", Toast.LENGTH_SHORT).show();
                            pr.setVisibility(View.GONE);
                            return;
                        } else {
                            latitude2 = addresses2.get(0).getLatitude();
                            longitude2 = addresses2.get(0).getLongitude();
                            loc2 = new Location("");
                            loc2.setLatitude(latitude2);
                            loc2.setLongitude(longitude2);

                        }


                        distance0 = loc1.distanceTo(loc2);
                        distance0 = distance0 / 1000;

                        String selectedCar = Com.getSelectedItem().toString();


                        switch (selectedCar) {
                            case "JEEP":
                                cost = (distance0 / 4.37585211) * 11.50;


                                break;
                            case "FIAT":
                                cost = (distance0 / 10.3561833) * 11.50;


                                break;
                            case "Peugeot":
                                cost = (distance0 / 11.7239811) * 11.50;


                                break;
                            case "Reno":
                                cost = (distance0 / 10.9452292) * 11.50;


                                break;
                            case "BMW":
                                cost = (distance0 / 8.06974026) * 11.50;


                                break;
                            case "Mg":
                                cost = (distance0 / 5.17808333) * 11.50;


                                break;
                            case "Verna":
                                cost = (distance0 / 6.0918627451) * 11.50;


                                break;
                            case "Mercedes":
                                cost = (distance0 / 10.3561666667) * 11.50;


                                break;
                            case "Citreon":
                                cost = (distance0 / 12.6810204082) * 11.50;


                                break;
                            case "Nissan":
                                cost = (distance0 / 12.1837254902) * 11.50;


                                break;
                            case "Toyota":
                                cost = (distance0 / 9.00536231884) * 11.50;


                                break;
                            case "Lada":
                                cost = (distance0 / 6.3379862) * 11.50;


                                break;
                            case "Kia Spotrage":
                                cost = (distance0 / 6.4622604) * 11.50;


                                break;
                            case "Volvo":
                                cost = (distance0 / 4.040117035110533) * 11.50;


                                break;
                            case "Volkswagan":
                                cost = (distance0 / 7.57768293) * 11.50;


                                break;
                            case "Chevrolet":
                                cost = (distance0 / 10.35616666666667) * 11.50;


                                break;
                            case "Suzuki":
                                cost = (distance0 / 11.94942307692308) * 11.50;


                                break;
                            case "Mitsubishi lancer":
                                cost = (distance0 / 8.876714285714286) * 11.50;


                                break;
                            case "Mini Copper":
                                cost = (distance0 / 10.90122807017544) * 11.50;


                                break;
                            case "Rang Rover":
                                cost = (distance0 / 4.435189150606709) * 11.50;


                                break;
                            case "Rolls Royce":
                                cost = (distance0 / 4.087960526315789) * 11.50;


                                break;
                            case "Porsche":
                                cost = (distance0 / 5.051788617886179) * 11.50;

                                break;
                            case "1000 cc":
                                cost = (distance0 / 28.968192) * 11.50;


                                break;
                            case "1500 cc":
                                cost = (distance0 / 19.3121) * 11.50;

                                break;
                            case "2000 cc":
                                cost = (distance0 / 13.6794) * 11.50;

                                break;
                            case "2500 cc":
                                cost = (distance0 / 11.2654) * 11.50;

                                break;
                            case "3000 cc":
                                cost = (distance0 / 9.65606) * 11.50;

                                break;
                            case "3500 cc":
                                cost = (distance0 / 8.85139) * 11.50;

                                break;
                            case "4000 cc":
                                cost = (distance0 / 7.24205) * 11.50;

                                break;
                            case "4500 cc":
                                cost = (distance0 / 6.43738) * 11.50;

                                break;
                            case "5000 cc":
                                cost = (distance0 / 6.11551) * 11.50;

                                break;
                            case "5500 cc":
                                cost = (distance0 / 5.6327) * 11.50;

                                break;
                            case "6000 cc":
                                cost = (distance0 / 4.82803) * 11.50;

                                break;
                            case "6500 cc":
                                cost = (distance0 / 4.02336) * 11.50;

                                break;
                            case "7000 cc":
                                cost = (distance0 / 3.21869) * 11.50;

                                break;
                            case "7500 cc":
                                cost = (distance0 / 2.41402) * 11.50;

                                break;
                            case "8000 cc":
                                cost = (distance0 / 1.60934) * 11.50;

                                break;
                            case "8500 cc":
                                cost = (distance0 / 1.28748) * 11.50;

                                break;
                            case "9000 cc":
                                cost = (distance0 / 0.804672) * 11.50;

                                break;
                            default:
                                break;
                        }

                        if (Math.round(distance0) == 0) {
                            Toast.makeText(this, "انت الان في نفس العنوان او قريب منك", Toast.LENGTH_SHORT).show();
                            pr.setVisibility(View.GONE);
                            return;
                        } else {

                            resText.setText("");
                            resText.append("\n " + addText.getText().toString() + "\n  الي  " + add2Text.getText().toString());
                            resText.append("\n السعر تقريبا من  \n" + Math.round(cost) + " جنيه " + "الي :" + Math.round(cost * 1.25) + "جنيه ");
                            pr.setVisibility(View.GONE);
                        }
                    }

                } else if (Add4Text.getText().toString().isEmpty()) {
                    if (addText.getText().toString().isEmpty()) {
                        Toast.makeText(this, "املا المكان الاول من فضلك", Toast.LENGTH_SHORT).show();
                        newa.setText("");
                        return;
                    }
                    if (address2.equals(address3) || address2.equals(address4) || address2.equals(address)) {
                        Toast.makeText(this, "هذا المكان تم كتابته من قبل لرجاء مراجعه الاماكن المدخله", Toast.LENGTH_SHORT).show();
                        pr.setVisibility(View.GONE);
                        return;


                    } else {
                        if (addresses == null || addresses.size() == 0 || addresses.get(0).getAddressLine(0).equalsIgnoreCase("مصر")) {
                            Toast.makeText(this, "الرجاء التأكد من العنوان الاول", Toast.LENGTH_SHORT).show();
                            pr.setVisibility(View.GONE);
                            return;
                        } else {
                            latitude = addresses.get(0).getLatitude();
                            longitude = addresses.get(0).getLongitude();

                            loc1 = new Location("");

                            loc1.setLatitude(latitude);
                            loc1.setLongitude(longitude);
                        }
                        if (addresses2 == null || addresses2.size() == 0 || addresses2.get(0).getAddressLine(0).equalsIgnoreCase("مصر")) {
                            Toast.makeText(this, "الرجاء التأكد من العنوان التاني", Toast.LENGTH_SHORT).show();
                            pr.setVisibility(View.GONE);
                            return;
                        } else {
                            latitude2 = addresses2.get(0).getLatitude();
                            longitude2 = addresses2.get(0).getLongitude();
                            loc2 = new Location("");
                            loc2.setLatitude(latitude2);
                            loc2.setLongitude(longitude2);

                        }
                        if (addresses3 == null || addresses3.size() == 0 || addresses3.get(0).getAddressLine(0).equalsIgnoreCase("مصر")) {
                            Toast.makeText(this, "الرجاء التأكد من العنوان الثالث", Toast.LENGTH_SHORT).show();
                            pr.setVisibility(View.GONE);
                            return;
                        } else {


                            latitude3 = addresses3.get(0).getLatitude();
                            longitude3 = addresses3.get(0).getLongitude();
                            loc3 = new Location("");
                            loc3.setLatitude(latitude3);
                            loc3.setLongitude(longitude3);
                        }


                        d = loc1.distanceTo(loc2);
                        d = d / 1000;
                        d2 = loc2.distanceTo(loc3);
                        d2 = d2 / 1000;
                        distance0 = loc1.distanceTo(loc2) + loc2.distanceTo(loc3);
                        distance0 = distance0 / 1000;


                        String selectedCar = Com.getSelectedItem().toString();
                        switch (selectedCar) {
                            case "JEEP":
                                cost = (distance0 / 4.37585211) * 11.50;
                                cost11 = (d / 4.37585211) * 11.50;
                                cost2 = (d2 / 4.37585211) * 11.50;


                                break;
                            case "FIAT":
                                cost = (distance0 / 10.3561833) * 11.50;
                                cost11 = (d / 10.3561833) * 11.50;
                                cost2 = (d2 / 10.3561833) * 11.50;

                                break;
                            case "Peugeot":
                                cost = (distance0 / 11.7239811) * 11.50;
                                cost11 = (d / 11.7239811) * 11.50;
                                cost2 = (d2 / 11.7239811) * 11.50;


                                break;
                            case "Reno":
                                cost = (distance0 / 10.9452292) * 11.50;
                                cost11 = (d / 10.9452292) * 11.50;
                                cost2 = (d2 / 10.9452292) * 11.50;


                                break;
                            case "BMW":
                                cost = (distance0 / 8.06974026) * 11.50;
                                cost11 = (d / 8.06974026) * 11.50;
                                cost2 = (d2 / 8.06974026) * 11.50;


                                break;
                            case "Mg":
                                cost = (distance0 / 5.17808333) * 11.50;
                                cost11 = (d / 5.17808333) * 11.50;
                                cost2 = (d2 / 5.17808333) * 11.50;


                                break;
                            case "Verna":
                                cost = (distance0 / 6.0918627451) * 11.50;
                                cost11 = (d / 6.0918627451) * 11.50;
                                cost2 = (d2 / 6.0918627451) * 11.50;


                                break;
                            case "Mercedes":
                                cost = (distance0 / 10.3561666667) * 11.50;
                                cost11 = (d / 10.3561666667) * 11.50;
                                cost2 = (d2 / 10.3561666667) * 11.50;


                                break;
                            case "Citreon":
                                cost = (distance0 / 12.6810204082) * 11.50;
                                cost11 = (d / 12.6810204082) * 11.50;
                                cost2 = (d2 / 12.6810204082) * 11.50;


                                break;
                            case "Nissan":
                                cost = (distance0 / 12.1837254902) * 11.50;
                                cost11 = (d / 12.1837254902) * 11.50;
                                cost2 = (d2 / 12.1837254902) * 11.50;


                                break;
                            case "Toyota":
                                cost = (distance0 / 9.00536231884) * 11.50;
                                cost11 = (d / 9.00536231884) * 11.50;
                                cost2 = (d2 / 9.00536231884) * 11.50;


                                break;
                            case "Lada":
                                cost = (distance0 / 6.3379862) * 11.50;
                                cost11 = (d / 6.3379862) * 11.50;
                                cost2 = (d2 / 6.3379862) * 11.50;


                                break;
                            case "Kia Spotrage":
                                cost = (distance0 / 6.4622604) * 11.50;
                                cost11 = (d / 6.4622604) * 11.50;
                                cost2 = (d2 / 6.4622604) * 11.50;


                                break;
                            case "Volvo":
                                cost = (distance0 / 4.040117035110533) * 11.50;
                                cost11 = (d / 4.040117035110533) * 11.50;
                                cost2 = (d2 / 4.040117035110533) * 11.50;


                                break;
                            case "Volkswagan":
                                cost = (distance0 / 7.57768293) * 11.50;
                                cost11 = (d / 7.57768293) * 11.50;
                                cost2 = (d2 / 7.57768293) * 11.50;


                                break;
                            case "Chevrolet":
                                cost = (distance0 / 10.35616666666667) * 11.50;
                                cost11 = (d / 10.35616666666667) * 11.50;
                                cost2 = (d2 / 10.35616666666667) * 11.50;


                                break;
                            case "Suzuki":
                                cost = (distance0 / 11.94942307692308) * 11.50;
                                cost11 = (d / 11.94942307692308) * 11.50;
                                cost2 = (d2 / 11.94942307692308) * 11.50;


                                break;
                            case "Mitsubishi lancer":
                                cost = (distance0 / 8.876714285714286) * 11.50;
                                cost11 = (d / 8.876714285714286) * 11.50;
                                cost2 = (d2 / 8.876714285714286) * 11.50;


                                break;
                            case "Mini Copper":
                                cost = (distance0 / 10.90122807017544) * 11.50;
                                cost11 = (d / 10.90122807017544) * 11.50;
                                cost2 = (d2 / 10.90122807017544) * 11.50;


                                break;
                            case "Rang Rover":
                                cost = (distance0 / 4.435189150606709) * 11.50;
                                cost11 = (d / 4.435189150606709) * 11.50;
                                cost2 = (d2 / 4.435189150606709) * 11.50;

                                break;
                            case "Rolls Royce":
                                cost = (distance0 / 4.087960526315789) * 11.50;
                                cost11 = (d / 4.087960526315789) * 11.50;
                                cost2 = (d2 / 4.087960526315789) * 11.50;


                                break;
                            case "Porsche":
                                cost = (distance0 / 5.051788617886179) * 11.50;
                                cost11 = (d / 5.051788617886179) * 11.50;
                                cost2 = (d2 / 5.051788617886179) * 11.50;

                                break;
                            case "1000 cc":
                                cost = (distance0 / 28.968192) * 11.50;
                                cost11 = (d / 28.968192) * 11.50;
                                cost2 = (d2 / 28.968192) * 11.50;


                                break;
                            case "1500 cc":
                                cost = (distance0 / 19.3121) * 11.50;
                                cost11 = (d / 19.3121) * 11.50;
                                cost2 = (d2 / 19.3121) * 11.50;

                                break;
                            case "2000 cc":
                                cost = (distance0 / 13.6794) * 11.50;
                                cost11 = (d / 13.6794) * 11.50;
                                cost2 = (d2 / 13.6794) * 11.50;

                                break;
                            case "2500 cc":
                                cost = (distance0 / 11.2654) * 11.50;
                                cost11 = (d / 11.2654) * 11.50;
                                cost2 = (d2 / 11.2654) * 11.50;

                                break;
                            case "3000 cc":
                                cost = (distance0 / 9.65606) * 11.50;
                                cost11 = (d / 9.65606) * 11.50;
                                cost2 = (d2 / 9.65606) * 11.50;

                                break;
                            case "3500 cc":
                                cost = (distance0 / 8.85139) * 11.50;
                                cost11 = (d / 8.85139) * 11.50;
                                cost2 = (d2 / 8.85139) * 11.50;

                                break;
                            case "4000 cc":
                                cost = (distance0 / 7.24205) * 11.50;
                                cost11 = (d / 7.24205) * 11.50;
                                cost2 = (d2 / 7.24205) * 11.50;

                                break;
                            case "4500 cc":
                                cost = (distance0 / 6.43738) * 11.50;
                                cost11 = (d / 6.43738) * 11.50;
                                cost2 = (d2 / 6.43738) * 11.50;

                                break;
                            case "5000 cc":
                                cost = (distance0 / 6.11551) * 11.50;
                                cost11 = (d / 6.11551) * 11.50;
                                cost2 = (d2 / 6.11551) * 11.50;

                                break;
                            case "5500 cc":
                                cost = (distance0 / 5.6327) * 11.50;
                                cost11 = (d / 5.6327) * 11.50;
                                cost2 = (d2 / 5.6327) * 11.50;

                                break;
                            case "6000 cc":
                                cost = (distance0 / 4.82803) * 11.50;
                                cost11 = (d / 4.82803) * 11.50;
                                cost2 = (d2 / 4.82803) * 11.50;

                                break;
                            case "6500 cc":
                                cost = (distance0 / 4.02336) * 11.50;
                                cost11 = (d / 4.02336) * 11.50;
                                cost2 = (d2 / 4.02336) * 11.50;

                                break;
                            case "7000 cc":
                                cost = (distance0 / 3.21869) * 11.50;
                                cost11 = (d / 3.21869) * 11.50;
                                cost2 = (d2 / 3.21869) * 11.50;

                                break;
                            case "7500 cc":
                                cost = (distance0 / 2.41402) * 11.50;
                                cost11 = (d / 2.41402) * 11.50;
                                cost2 = (d2 / 2.41402) * 11.50;

                                break;
                            case "8000 cc":
                                cost = (distance0 / 1.60934) * 11.50;
                                cost11 = (d / 1.60934) * 11.50;
                                cost2 = (d2 / 1.60934) * 11.50;

                                break;
                            case "8500 cc":
                                cost = (distance0 / 1.28748) * 11.50;
                                cost11 = (d / 1.28748) * 11.50;
                                cost2 = (d2 / 1.28748) * 11.50;

                                break;
                            case "9000 cc":
                                cost = (distance0 / 0.804672) * 11.50;
                                cost11 = (d / 0.804672) * 11.50;
                                cost2 = (d2 / 0.804672) * 11.50;
                                break;
                            default:
                                break;
                        }


                        resText.setText("");
                        resText.append("\n " + addText.getText().toString() + "  \n" + " الي " + add2Text.getText().toString() + "\n");
//                            resText.append(" عدد الكيلو متر: "+Math.round(d)+" كيلو متر "+"\n");
                        resText.append("السعر تقريبا من  " + Math.round(cost11) + " الي " + Math.round(cost11 * 1.25) + " جنيه " + "\n");
                        resText.append("\n " + add2Text.getText().toString() + "  \n" + " الي " + Add3Text.getText().toString() + "\n");
//                            resText.append(" عدد الكيلو متر: "+Math.round(d2)+" كيلو متر "+"\n");
                        resText.append("السعر تقريبا من  " + Math.round(cost2) + " الي " + Math.round(cost2 * 1.25) + " جنيه " + "\n");
                        resText.append("\n " + addText.getText().toString() + "\n  الي  " + add2Text.getText().toString() + "\n  الي  " + Add3Text.getText().toString() + "\n");
//                            resText.append("عدد الكيلو متر= " + Math.round(distance0)+" كيلو ");
                        resText.append("\n السعر تقريبا من  \n" + Math.round(cost) + " جنيه " + "الي :" + Math.round(cost * 1.25) + "جنيه ");
                        pr.setVisibility(View.GONE);
                    }

                } else {
                    if (addText.getText().toString().isEmpty() || add2Text.getText().toString().isEmpty()) {

                        Toast.makeText(this, "املا الاماكن المسبقه من فضلك", Toast.LENGTH_SHORT).show();
                        pr.setVisibility(View.GONE);
                        newa.setText("");
                        return;
                    } else {
                        if (address4.equals(address) || address4.equals(addresses2) || address4.equals(address3)) {
                            Toast.makeText(this, "هذا المكان تم كتابته من قبل لرجاء مراجعه الاماكن المدخله", Toast.LENGTH_SHORT).show();
                            pr.setVisibility(View.GONE);
                            return;
                        } else {

                            if (addresses == null || addresses.size() == 0 || addresses.get(0).getAddressLine(0).equalsIgnoreCase("مصر")) {
                                Toast.makeText(this, "الرجاء التأكد من العنوان الاول", Toast.LENGTH_SHORT).show();
                                pr.setVisibility(View.GONE);
                                return;
                            } else {
                                latitude = addresses.get(0).getLatitude();
                                longitude = addresses.get(0).getLongitude();

                                loc1 = new Location("");

                                loc1.setLatitude(latitude);
                                loc1.setLongitude(longitude);
                            }
                            if (addresses2 == null || addresses2.size() == 0 || addresses2.get(0).getAddressLine(0).equalsIgnoreCase("مصر")) {
                                Toast.makeText(this, "الرجاء التأكد من العنوان التاني", Toast.LENGTH_SHORT).show();
                                pr.setVisibility(View.GONE);
                                return;
                            } else {
                                latitude2 = addresses2.get(0).getLatitude();
                                longitude2 = addresses2.get(0).getLongitude();
                                loc2 = new Location("");
                                loc2.setLatitude(latitude2);
                                loc2.setLongitude(longitude2);

                            }
                            if (addresses3 == null || addresses3.size() == 0 || addresses3.get(0).getAddressLine(0).equalsIgnoreCase("مصر")) {
                                Toast.makeText(this, "الرجاء التأكد من العنوان الثالث", Toast.LENGTH_SHORT).show();
                                pr.setVisibility(View.GONE);
                                return;
                            } else {


                                latitude3 = addresses3.get(0).getLatitude();
                                longitude3 = addresses3.get(0).getLongitude();
                                loc3 = new Location("");
                                loc3.setLatitude(latitude3);
                                loc3.setLongitude(longitude3);
                            }

                            if (addresses4 == null || addresses4.size() == 0 || addresses4.get(0).getAddressLine(0).equalsIgnoreCase("مصر")) {
                                Toast.makeText(this, "الرجاء التأكد من العنوان الرابع", Toast.LENGTH_SHORT).show();
                                pr.setVisibility(View.GONE);
                                return;
                            } else {
                                latitude4 = addresses4.get(0).getLatitude();
                                longitude4 = addresses4.get(0).getLongitude();
                                loc4 = new Location("");
                                loc4.setLatitude(latitude4);
                                loc4.setLongitude(longitude4);
                            }
                            distance0 = loc1.distanceTo(loc2) + loc2.distanceTo(loc3) + loc3.distanceTo(loc4);
                            distance0 = distance0 / 1000;

                            d = loc1.distanceTo(loc2);
                            d = d / 1000;
                            d2 = loc2.distanceTo(loc3);
                            d2 = d2 / 1000;
                            d3 = loc3.distanceTo(loc4);
                            d3 = d3 / 1000;


                            String selectedCar = Com.getSelectedItem().toString();
                            switch (selectedCar) {
                                case "JEEP":
                                    cost = (distance0 / 4.37585211) * 11.50;
                                    cost11 = (d / 4.37585211) * 11.50;
                                    cost2 = (d2 / 4.37585211) * 11.50;
                                    cost3 = (d3 / 4.37585211) * 11.50;


                                    break;
                                case "FIAT":
                                    cost = (distance0 / 10.3561833) * 11.50;
                                    cost11 = (d / 10.3561833) * 11.50;
                                    cost2 = (d2 / 10.3561833) * 11.50;
                                    cost3 = (d3 / 10.3561833) * 11.50;

                                    break;
                                case "Peugeot":
                                    cost = (distance0 / 11.7239811) * 11.50;
                                    cost11 = (d / 11.7239811) * 11.50;
                                    cost2 = (d2 / 11.7239811) * 11.50;
                                    cost3 = (d3 / 11.7239811) * 11.50;


                                    break;
                                case "Reno":
                                    cost = (distance0 / 10.9452292) * 11.50;
                                    cost11 = (d / 10.9452292) * 11.50;
                                    cost2 = (d2 / 10.9452292) * 11.50;
                                    cost3 = (d3 / 10.9452292) * 11.50;

                                    break;
                                case "BMW":
                                    cost = (distance0 / 8.06974026) * 11.50;
                                    cost11 = (d / 8.06974026) * 11.50;
                                    cost2 = (d2 / 8.06974026) * 11.50;
                                    cost3 = (d3 / 8.06974026) * 11.50;

                                    break;
                                case "Mg":
                                    cost = (distance0 / 5.17808333) * 11.50;
                                    cost11 = (d / 5.17808333) * 11.50;
                                    cost2 = (d2 / 5.17808333) * 11.50;
                                    cost3 = (d3 / 5.17808333) * 11.50;

                                    break;
                                case "Verna":
                                    cost = (distance0 / 6.0918627451) * 11.50;
                                    cost11 = (d / 6.0918627451) * 11.50;
                                    cost2 = (d2 / 6.0918627451) * 11.50;
                                    cost3 = (d3 / 6.0918627451) * 11.50;

                                    break;
                                case "Mercedes":
                                    cost = (distance0 / 10.3561666667) * 11.50;
                                    cost11 = (d / 10.3561666667) * 11.50;
                                    cost2 = (d2 / 10.3561666667) * 11.50;
                                    cost3 = (d3 / 10.3561666667) * 11.50;

                                    break;
                                case "Citreon":
                                    cost = (distance0 / 12.6810204082) * 11.50;
                                    cost11 = (d / 12.6810204082) * 11.50;
                                    cost2 = (d2 / 12.6810204082) * 11.50;
                                    cost3 = (d3 / 12.6810204082) * 11.50;

                                    break;
                                case "Nissan":
                                    cost = (distance0 / 12.1837254902) * 11.50;
                                    cost11 = (d / 12.1837254902) * 11.50;
                                    cost2 = (d2 / 12.1837254902) * 11.50;
                                    cost3 = (d3 / 12.1837254902) * 11.50;

                                    break;
                                case "Toyota":
                                    cost = (distance0 / 9.00536231884) * 11.50;
                                    cost11 = (d / 9.00536231884) * 11.50;
                                    cost2 = (d2 / 9.00536231884) * 11.50;
                                    cost3 = (d3 / 9.00536231884) * 11.50;

                                    break;
                                case "Lada":
                                    cost = (distance0 / 6.3379862) * 11.50;
                                    cost11 = (d / 6.3379862) * 11.50;
                                    cost2 = (d2 / 6.3379862) * 11.50;
                                    cost3 = (d3 / 6.3379862) * 11.50;


                                    break;
                                case "Kia Spotrage":
                                    cost = (distance0 / 6.4622604) * 11.50;
                                    cost11 = (d / 6.4622604) * 11.50;
                                    cost2 = (d2 / 6.4622604) * 11.50;
                                    cost3 = (d3 / 6.4622604) * 11.50;


                                    break;
                                case "Volvo":
                                    cost = (distance0 / 4.040117035110533) * 11.50;
                                    cost11 = (d / 4.040117035110533) * 11.50;
                                    cost2 = (d2 / 4.040117035110533) * 11.50;
                                    cost3 = (d3 / 4.040117035110533) * 11.50;


                                    break;
                                case "Volkswagan":
                                    cost = (distance0 / 7.57768293) * 11.50;
                                    cost11 = (d / 7.57768293) * 11.50;
                                    cost2 = (d2 / 7.57768293) * 11.50;
                                    cost3 = (d3 / 7.57768293) * 11.50;


                                    break;
                                case "Chevrolet":
                                    cost = (distance0 / 10.35616666666667) * 11.50;
                                    cost11 = (d / 10.35616666666667) * 11.50;
                                    cost2 = (d2 / 10.35616666666667) * 11.50;
                                    cost3 = (d3 / 10.35616666666667) * 11.50;


                                    break;
                                case "Suzuki":
                                    cost = (distance0 / 11.94942307692308) * 11.50;
                                    cost11 = (d / 11.94942307692308) * 11.50;
                                    cost2 = (d2 / 11.94942307692308) * 11.50;
                                    cost3 = (d3 / 11.94942307692308) * 11.50;


                                    break;
                                case "Mitsubishi lancer":
                                    cost = (distance0 / 8.876714285714286) * 11.50;
                                    cost11 = (d / 8.876714285714286) * 11.50;
                                    cost2 = (d2 / 8.876714285714286) * 11.50;
                                    cost3 = (d3 / 8.876714285714286) * 11.50;


                                    break;
                                case "Mini Copper":
                                    cost = (distance0 / 10.90122807017544) * 11.50;
                                    cost11 = (d / 10.90122807017544) * 11.50;
                                    cost2 = (d2 / 10.90122807017544) * 11.50;
                                    cost3 = (d3 / 10.90122807017544) * 11.50;


                                    break;
                                case "Rang Rover":
                                    cost = (distance0 / 4.435189150606709) * 11.50;
                                    cost11 = (d / 4.435189150606709) * 11.50;
                                    cost2 = (d2 / 4.435189150606709) * 11.50;
                                    cost3 = (d3 / 4.435189150606709) * 11.50;

                                    break;
                                case "Rolls Royce":
                                    cost = (distance0 / 4.087960526315789) * 11.50;
                                    cost11 = (d / 4.087960526315789) * 11.50;
                                    cost2 = (d2 / 4.087960526315789) * 11.50;
                                    cost3 = (d3 / 4.087960526315789) * 11.50;


                                    break;
                                case "Porsche":
                                    cost = (distance0 / 5.051788617886179) * 11.50;
                                    cost11 = (d / 5.051788617886179) * 11.50;
                                    cost2 = (d2 / 5.051788617886179) * 11.50;
                                    cost3 = (d3 / 5.051788617886179) * 11.50;

                                    break;
                                case "1000 cc":
                                    cost = (distance0 / 28.968192) * 11.50;
                                    cost11 = (d / 28.968192) * 11.50;
                                    cost2 = (d2 / 28.968192) * 11.50;
                                    cost3 = (d3 / 28.968192) * 11.50;


                                    break;
                                case "1500 cc":
                                    cost = (distance0 / 19.3121) * 11.50;
                                    cost11 = (d / 19.3121) * 11.50;
                                    cost2 = (d2 / 19.3121) * 11.50;
                                    cost3 = (d3 / 19.3121) * 11.50;

                                    break;
                                case "2000 cc":
                                    cost = (distance0 / 13.6794) * 11.50;
                                    cost11 = (d / 13.6794) * 11.50;
                                    cost2 = (d2 / 13.6794) * 11.50;
                                    cost3 = (d3 / 13.6794) * 11.50;

                                    break;
                                case "2500 cc":
                                    cost = (distance0 / 11.2654) * 11.50;
                                    cost11 = (d / 11.2654) * 11.50;
                                    cost2 = (d2 / 11.2654) * 11.50;
                                    cost3 = (d3 / 11.2654) * 11.50;

                                    break;
                                case "3000 cc":
                                    cost = (distance0 / 9.65606) * 11.50;
                                    cost11 = (d / 9.65606) * 11.50;
                                    cost2 = (d2 / 9.65606) * 11.50;
                                    cost3 = (d3 / 9.65606) * 11.50;

                                    break;
                                case "3500 cc":
                                    cost = (distance0 / 8.85139) * 11.50;
                                    cost11 = (d / 8.85139) * 11.50;
                                    cost2 = (d2 / 8.85139) * 11.50;
                                    cost3 = (d3 / 8.85139) * 11.50;

                                    break;
                                case "4000 cc":
                                    cost = (distance0 / 7.24205) * 11.50;
                                    cost11 = (d / 7.24205) * 11.50;
                                    cost2 = (d2 / 7.24205) * 11.50;
                                    cost3 = (d3 / 7.24205) * 11.50;

                                    break;
                                case "4500 cc":
                                    cost = (distance0 / 6.43738) * 11.50;
                                    cost11 = (d / 6.43738) * 11.50;
                                    cost2 = (d2 / 6.43738) * 11.50;
                                    cost3 = (d3 / 6.43738) * 11.50;

                                    break;
                                case "5000 cc":
                                    cost = (distance0 / 6.11551) * 11.50;
                                    cost11 = (d / 6.11551) * 11.50;
                                    cost2 = (d2 / 6.11551) * 11.50;
                                    cost3 = (d3 / 6.11551) * 11.50;

                                    break;
                                case "5500 cc":
                                    cost = (distance0 / 5.6327) * 11.50;
                                    cost11 = (d / 5.6327) * 11.50;
                                    cost2 = (d2 / 5.6327) * 11.50;
                                    cost3 = (d3 / 5.6327) * 11.50;

                                    break;
                                case "6000 cc":
                                    cost = (distance0 / 4.82803) * 11.50;
                                    cost11 = (d / 4.82803) * 11.50;
                                    cost2 = (d2 / 4.82803) * 11.50;
                                    cost3 = (d3 / 4.82803) * 11.50;

                                    break;
                                case "6500 cc":
                                    cost = (distance0 / 4.02336) * 11.50;
                                    cost11 = (d / 4.02336) * 11.50;
                                    cost2 = (d2 / 4.02336) * 11.50;
                                    cost3 = (d3 / 4.02336) * 11.50;

                                    break;
                                case "7000 cc":
                                    cost = (distance0 / 3.21869) * 11.50;
                                    cost11 = (d / 3.21869) * 11.50;
                                    cost2 = (d2 / 3.21869) * 11.50;
                                    cost3 = (d3 / 3.21869) * 11.50;

                                    break;
                                case "7500 cc":
                                    cost = (distance0 / 2.41402) * 11.50;
                                    cost11 = (d / 2.41402) * 11.50;
                                    cost2 = (d2 / 2.41402) * 11.50;
                                    cost3 = (d3 / 2.41402) * 11.50;

                                    break;
                                case "8000 cc":
                                    cost = (distance0 / 1.60934) * 11.50;
                                    cost11 = (d / 1.60934) * 11.50;
                                    cost2 = (d2 / 1.60934) * 11.50;
                                    cost3 = (d3 / 1.60934) * 11.50;

                                    break;
                                case "8500 cc":
                                    cost = (distance0 / 1.28748) * 11.50;
                                    cost11 = (d / 1.28748) * 11.50;
                                    cost2 = (d2 / 1.28748) * 11.50;
                                    cost3 = (d3 / 1.28748) * 11.50;

                                    break;
                                case "9000 cc":
                                    cost = (distance0 / 0.804672) * 11.50;
                                    cost11 = (d / 0.804672) * 11.50;
                                    cost2 = (d2 / 0.804672) * 11.50;
                                    cost3 = (d3 / 0.804672) * 11.50;

                                    break;
                                default:
                                    break;
                            }


                            resText.setText("");
                            resText.append("\n " + addText.getText().toString() + "  \n" + " الي " + add2Text.getText().toString() + "\n");
//                                resText.append(" عدد الكيلو متر: "+Math.round(d)+" كيلو متر "+"\n");
                            resText.append("السعر تقريبا من  " + Math.round(cost11) + " الي " + Math.round(cost11 * 1.25) + " جنيه " + "\n");
                            resText.append("\n " + add2Text.getText().toString() + "  \n" + " الي " + Add3Text.getText().toString() + "\n");
//                                resText.append(" عدد الكيلو متر: "+Math.round(d2)+" كيلو متر "+"\n");
                            resText.append("السعر تقريبا من  " + Math.round(cost2) + " الي " + Math.round(cost2 * 1.25) + " جنيه " + "\n");
                            resText.append("\n " + Add3Text.getText().toString() + "  \n" + " الي " + Add4Text.getText().toString() + "\n");
//                                resText.append(" عدد الكيلو متر: "+Math.round(d3)+" كيلو متر "+"\n");
                            resText.append("السعر تقريبا من  " + Math.round(cost3) + " الي " + Math.round(cost3 * 1.25) + " جنيه " + "\n");
                            resText.append("\n " + addText.getText().toString() + "\n  الي \n " + add2Text.getText().toString() + "\n  الي \n " + Add3Text.getText().toString() + "\n الي \n  " + Add4Text.getText().toString() + "\n");
//                                resText.append("عدد الكيلو متر= " + Math.round(distance0)+" كيلو ");
                            resText.append("\n السعر تقريبا من  \n" + Math.round(cost) + " جنيه " + "الي :" + Math.round(cost * 1.25) + "جنيه ");
                            pr.setVisibility(View.GONE);
                        }
                    }


                }


                Location currentUserLocation = new Location("");
                currentUserLocation.setLatitude(latitude);
                currentUserLocation.setLongitude(longitude);

                List<DistanceToStation> distancesToStations = new ArrayList<>();

                float totalDistance = 0;
                double totalCost = 0;

                for (name_stashion<String, Double, Double> station : gas) {
                    String stationName = station.getFirst();
                    double stationLatitude = station.getSecond();
                    double stationLongitude = station.getThird();

                    Location stationLocation = new Location("");
                    stationLocation.setLatitude(stationLatitude);
                    stationLocation.setLongitude(stationLongitude);

                    float distance = currentUserLocation.distanceTo(stationLocation);


                    totalDistance += distance;

                    distancesToStations.add(new DistanceToStation(stationName, distance));


                }
                boolean a = false;

                Collections.sort(distancesToStations, new DistanceComparator());
                if (addText.getText().toString().isEmpty() && add2Text.getText().toString().isEmpty() && Add3Text.getText().toString().isEmpty() && Add4Text.getText().toString().isEmpty()) {

                } else if (Add3Text.getText().toString().isEmpty() && Add4Text.getText().toString().isEmpty()) {


                } else {
                    newa.setText("لو مشيت كده هتوفر فلوس وبنزين:");
                    float fi = 0;
                    double cost1;


                    for (int i = 0; i < Math.min(4, distancesToStations.size()); i++) {
                        DistanceToStation distanceToStation = distancesToStations.get(i);
                        newa.append("\n" + distanceToStation.stationName + "\n");

                        fi = Math.round(distanceToStation.distance);
                        fi = fi / 1000;
                        if (Add4Text.getText().toString().isEmpty()) {

                            if (i == 2) {
                                if (distanceToStation.stationName.equals(Add3Text.getText().toString())) {
                                    newa.setText("");
                                    return;

                                }
                            }
                        } else if (!Add4Text.getText().toString().isEmpty()) {
                            if (i == 2 && distanceToStation.stationName.equals(Add3Text.getText().toString())) {
                                a = true;
                            }
                        }
                        if (a == true) {
                            if (i == 3) {
                                if (distanceToStation.stationName.equals(Add4Text.getText().toString())) {
                                    newa.setText("");
                                    return;
                                }
                            }
                        }
                    }
                    if (Com.getSelectedItem().equals("JEEP")) {
                        cost1 = (fi / 4.37585211) * 11.50;
                        totalCost += cost1;
//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("FIAT")) {
                        cost1 = (fi / 10.3561833) * 11.50;
                        totalCost += cost1;
//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("Peugeot")) {
                        cost1 = (fi / 11.7239811) * 11.50;
                        totalCost += cost1;

//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("Reno")) {
                        cost1 = (fi / 10.9452292) * 11.50;
                        totalCost += cost1;

//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("BMW")) {
                        cost1 = (fi / 8.06974026) * 11.50;
                        totalCost += cost1;

//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("Mg")) {
                        cost1 = (fi / 5.17808333) * 11.50;
                        totalCost += cost1;
//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("Verna")) {
                        cost1 = (fi / 6.0918627451) * 11.50;
                        totalCost += cost1;
//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("Mercedes")) {
                        cost1 = (fi / 10.3561666667) * 11.50;
                        totalCost += cost1;
//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("Citreon")) {
                        cost1 = (fi / 12.6810204082) * 11.50;
                        totalCost += cost1;
//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("Nissan")) {
                        cost1 = (fi / 12.1837254902) * 11.50;
                        totalCost += cost1;
//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("Toyota")) {
                        cost1 = (fi / 9.00536231884) * 11.50;
                        totalCost += cost1;

//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");


                    } else if (Com.getSelectedItem().equals("Lada")) {
                        cost1 = (fi / 6.3379862) * 11.50;
                        totalCost += cost1;

//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("Kia Spotrage")) {
                        cost1 = (fi / 6.4622604) * 11.50;
                        totalCost += cost1;

//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("Volkswagan")) {
                        cost1 = (fi / 7.57768293) * 11.50;
                        totalCost += cost1;
//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("Chevrolet")) {
                        cost1 = (fi / 10.35616666666667) * 11.50;
                        totalCost += cost1;
//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("Mini Copper")) {
                        cost1 = (fi / 10.90122807017544
                        ) * 11.50;
                        totalCost += cost1;

//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("Mitsubishi lancer")) {
                        cost1 = (fi / 8.876714285714286) * 11.50;
                        totalCost += cost1;

//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("Suzuki")) {
                        cost1 = (fi / 11.94942307692308) * 11.50;
                        totalCost += cost1;

//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("Rang Rover")) {
                        cost1 = (fi / 4.435189150606709) * 11.50;
                        totalCost += cost1;
//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("Volvo")) {
                        cost1 = (fi / 4.040117035110533) * 11.50;
                        totalCost += cost1;
//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("Porsche")) {
                        cost1 = (fi / 5.051788617886179) * 11.50;
                        totalCost += cost1;

//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("1000 cc")) {
                        cost1 = (fi / 28.968192) * 11.50;
                        totalCost += cost1;

//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("1500 cc")) {
                        cost1 = (fi / 19.3121) * 11.50;
                        totalCost += cost1;

//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("2000 cc")) {
                        cost1 = (fi / 13.6794) * 11.50;
                        totalCost += cost1;

//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("2500 cc")) {
                        cost1 = (fi / 11.2654) * 11.50;
                        totalCost += cost1;

//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("3000 cc")) {
                        cost1 = (fi / 9.65606) * 11.50;
                        totalCost += cost1;

//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("3500 cc")) {
                        cost1 = (fi / 8.85139) * 11.50;
                        totalCost += cost1;

//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("4000 cc")) {
                        cost1 = (fi / 7.24205) * 11.50;
                        totalCost += cost1;

//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("4500 cc")) {
                        cost1 = (fi / 6.43738) * 11.50;
                        totalCost += cost1;

//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("5000 cc")) {
                        cost1 = (fi / 6.11551) * 11.50;
                        totalCost += cost1;

//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("5500 cc")) {
                        cost1 = (fi / 5.6327) * 11.50;
                        totalCost += cost1;

//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("6000 cc")) {
                        cost1 = (fi / 4.82803) * 11.50;
                        totalCost += cost1;

//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("6500 cc")) {
                        cost1 = (fi / 4.02336) * 11.50;
                        totalCost += cost1;

//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("7000 cc")) {
                        cost1 = (fi / 3.21869) * 11.50;
                        totalCost += cost1;

//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("7500 cc")) {
                        cost1 = (fi / 2.41402) * 11.50;
                        totalCost += cost1;

//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("8000 cc")) {
                        cost1 = (fi / 1.60934) * 11.50;
                        totalCost += cost1;

//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("8500 cc")) {
                        cost1 = (fi / 1.28748) * 11.50;
                        totalCost += cost1;

//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");
                    } else if (Com.getSelectedItem().equals("9000 cc")) {
                        cost1 = (fi / 0.804672) * 11.50;
                        totalCost += cost1;

//                        newa.append("\n\n  عدد الكيلو متر : " + Math.round(totalDistance / 1000) + " كيلو متر ");
                        newa.append("\n  السعر تقريبا من  " + Math.round(totalCost) + " جنيه " + " الي " + Math.round(totalCost * 1.25) + "جنيه ");

                    }
                }
            } catch (Exception e) {

                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
                pr.setVisibility(View.GONE);
            }


        } catch (Exception e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            pr.setVisibility(View.GONE);
        }
    }


    @Override
    public void onFailure(@NonNull AirLocation.LocationFailedEnum locationFailedEnum) {
        Toast.makeText(this, "فشل في الحصول على الموقع", Toast.LENGTH_SHORT).show();
        pr.setVisibility(View.GONE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }


    private class DistanceToStation {
        public float distance0;
        String stationName;
        float distance;

        DistanceToStation(String stationName, float distance) {
            this.stationName = stationName;
            this.distance = distance;
        }
    }

    private class DistanceComparator implements Comparator<DistanceToStation> {
        @Override
        public int compare(DistanceToStation o1, DistanceToStation o2) {
            return Float.compare(o1.distance, o2.distance);
        }


    }

    public void about(View view) {

        Intent i = new Intent(this, MainActivity3.class);
        startActivity(i);

    }

    public void usage(View view) {
        Intent i = new Intent(this, usage1.class);
        startActivity(i);


    }

    public void iformationBtn(View view) {
        Intent i = new Intent(this, MainActivity3.class);
        startActivity(i);

    }

    public void infobtn(View view) {
        Intent i = new Intent(this, usage1.class);
        startActivity(i);
    }

    @Override
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);

        if (!hasWindowFocus) {
            pr.setVisibility(View.GONE);
        }
    }
}
