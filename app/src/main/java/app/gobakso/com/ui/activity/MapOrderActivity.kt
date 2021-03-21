package app.gobakso.com.ui.activity

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.NonNull
import androidx.constraintlayout.widget.ConstraintLayout
import app.beelabs.com.codebase.base.BaseActivity
import app.beelabs.com.codebase.support.rx.RxTimer
import app.gobakso.com.App
import app.gobakso.com.R
import app.gobakso.com.databinding.ActivityLoginBinding
import app.gobakso.com.databinding.ActivityMapOrderBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetBehavior.*
import kotlinx.android.synthetic.main.content_order_bottom_sheet_dialog.*


class MapOrderActivity : BaseActivity(), OnMapReadyCallback {

    private lateinit var builder: LatLngBounds.Builder
    private lateinit var bottomSheetBehavior: BottomSheetBehavior<ConstraintLayout>
    private lateinit var binding: ActivityMapOrderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as? SupportMapFragment
        mapFragment?.getMapAsync(this)

        openBottomSheetDialog()
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

    fun openBottomSheetDialog(){
        bottomSheetBehavior = from(findViewById(R.id.bottom_sheet))

        RxTimer.doTimer(3000, false, object: RxTimer(){
            override fun onCallback(along: Long?) {
                bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
            }
        })

        //#3 Listening to State Changes of BottomSheet
        bottomSheetBehavior.setBottomSheetCallback(object :
            BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(bottomSheet: View, slideOffset: Float) {

            }

            override fun onStateChanged(p0: View, state: Int) {
                when(state){
                    STATE_COLLAPSED -> bottomSheetBehavior.state = STATE_COLLAPSED
                }
            }
        })

        button_order_address.setOnClickListener {
            App.getNavigationComponent().homeNavigation()
                .navigateToSearchAddress(this@MapOrderActivity)
        }

        button_order_detail.setOnClickListener {
            App.getNavigationComponent().homeNavigation()
                .navigateToSearchAddress(this@MapOrderActivity)
        }
    }
}