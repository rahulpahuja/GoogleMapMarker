package rahulpahuja.com.markersapplication;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        //LatLng sydney = new LatLng(-34, 151);

        LatLng location1=new LatLng(41.8507300,-87.6512600);
        LatLng location2=new LatLng(41.8525800,-87.6514100);
        LatLng location3=new LatLng(35.4675602,-97.5164276);
        LatLng location4=new LatLng(34.0522342,-118.2436849);
        LatLng location5=new LatLng(34.0523600,-118.2435600);
        LatLng location6=new LatLng(41.8781100,-87.6297900);



        mMap.addMarker(new MarkerOptions().position(location1).title("Marker at location1")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_icon1)));
        mMap.addMarker(new MarkerOptions().position(location2).title("Marker at location2")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_icon2)));
        mMap.addMarker(new MarkerOptions().position(location3).title("Marker at location3")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_icon3)));
        mMap.addMarker(new MarkerOptions().position(location4).title("Marker at location4")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_icon4)));
        mMap.addMarker(new MarkerOptions().position(location5).title("Marker at location5")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_icon5)));
        mMap.addMarker(new MarkerOptions().position(location6).title("Marker at location6")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_icon6)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(location1));
    }
}
