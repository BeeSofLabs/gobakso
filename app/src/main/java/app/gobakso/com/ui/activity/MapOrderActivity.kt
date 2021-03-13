package app.gobakso.com.ui.activity

import android.os.Bundle
import app.beelabs.com.codebase.base.BaseActivity
import app.gobakso.com.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions


class MapOrderActivity : BaseActivity(), OnMapReadyCallback {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map_order)
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as? SupportMapFragment
        mapFragment?.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap?) {
        googleMap?.apply {
            val australiaBounds = LatLngBounds(
                LatLng((-44.0), 113.0),  // SW bounds
                LatLng((-10.0), 154.0) // NE bounds
            )
            moveCamera(CameraUpdateFactory.newLatLngBounds(australiaBounds, 0))
        }


    }
}