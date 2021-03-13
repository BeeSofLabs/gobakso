package app.gobakso.com.ui.activity

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import app.beelabs.com.codebase.base.BaseActivity
import app.gobakso.com.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.MarkerOptions


class MapOrderActivity : BaseActivity(), OnMapReadyCallback {

    private lateinit var builder: LatLngBounds.Builder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map_order)
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as? SupportMapFragment
        mapFragment?.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap?) {
        builder = LatLngBounds.Builder()
        drawMarker(LatLng(-6.249321, 106.7824544), "#1", googleMap)
        drawMarker(LatLng(-6.2779666, 106.7805447), "#2", googleMap)
        var bounds = builder.build()
        googleMap?.animateCamera(CameraUpdateFactory.newLatLngBounds(bounds, 0))

    }

    private fun drawMarker(point: LatLng, text: String, googleMap: GoogleMap?) {
        val markerOptions = MarkerOptions()
        markerOptions.position(point).title(text)
            .icon(BitmapDescriptorFactory.fromBitmap(generateSmallIcon(this)))
        googleMap?.addMarker(markerOptions)
        builder.include(markerOptions.position)
    }

    fun generateSmallIcon(context: Context): Bitmap {
        val height = 120
        val width = 120
        val bitmap = BitmapFactory.decodeResource(context.resources, R.drawable.bike)
        return Bitmap.createScaledBitmap(bitmap, width, height, false)
    }
}