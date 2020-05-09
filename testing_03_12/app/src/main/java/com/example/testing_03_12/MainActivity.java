package com.example.testing_03_12;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
//import android.support.v4.app.ActivityCompat;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity implements LocationListener  {
    private LocationManager locationManager;
    private Location My_Lost_Location =null;
    private TextView GetSpeed,CalSpeed,Time,LastTime,GpsEnable,TimeDif,DistDif;
    private double speed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetSpeed = (TextView) findViewById(R.id.GetSpeed);
        CalSpeed = (TextView) findViewById(R.id.CalSpeed);
        Time = (TextView) findViewById(R.id.Time);
        LastTime = (TextView) findViewById(R.id.LastTime);
        GpsEnable = (TextView) findViewById(R.id.GpsEnable);
        TimeDif = (TextView) findViewById(R.id.TimeDif);
        DistDif = (TextView) findViewById(R.id.DistDif);

        //checking of Permission

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        Location last_know_location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
        if (last_know_location != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            String format_date = sdf.format(new Date(last_know_location.getTime()));
            Time.setText(": " + format_date);//시간!

        }
        //GPS사용가능 여부
        boolean is_Eable = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
        GpsEnable.setText(": " + is_Eable);
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000, 0, this);
        //이게 뭘까???
    }

    @Override
    public void onLocationChanged(Location location) {
        SimpleDateFormat temp = new SimpleDateFormat("HH:mm:ss");
        double deltaTime = 0;

        //getSpeed()함수를 사용하여 속도를 계산
        double getSpeed = Double.parseDouble(String.format("%.3f", location.getSpeed()));
        GetSpeed.setText(": " + getSpeed);//speed를 표현
        String formateDate = temp.format(new Date(location.getTime()));
        Time.setText(": " + formateDate);//시간을 표현

        //위치변경이 두번째로 변경된 경우 ! 속도 계산!
        if (My_Lost_Location != null) {
            //시간 간격
            deltaTime = (location.getTime() - My_Lost_Location.getTime()) / 1000.0;
            TimeDif.setText(": " + deltaTime + " sec");//시간차!
            DistDif.setText(": " + My_Lost_Location.distanceTo(location) + "m");//거리 계산

            //속도 계산
            speed = My_Lost_Location.distanceTo(location) / deltaTime;

            String format_lastData = temp.format(new Date(My_Lost_Location.getTime()));
            LastTime.setText(": " + format_lastData);//마지막 시간

            double calSpeed = Double.parseDouble(String.format("%.3f", speed));
            CalSpeed.setText(": " + calSpeed);//속도 계삭ㄴ

        }
        My_Lost_Location = location;//현재위치를 지난위치로 변경
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }
    @Override
    public void onProviderDisabled(String provider){

    }
    @Override
    public void onProviderEnabled(String provider) {
        //권한 확인
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }

        //위치정보 업데이트
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000, 0, this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        //위치정보 가져오기 제거
        locationManager.removeUpdates(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            //권한이 없을 경우 최초 권한 요청 또는 사용자에의한 재요청 확인
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.ACCESS_FINE_LOCATION) &&
                    ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.ACCESS_COARSE_LOCATION)) {
                //권한 재요청
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION}, 100);
                return;
            } else {
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION}, 100);
                return;
            }

        }
    }
}
