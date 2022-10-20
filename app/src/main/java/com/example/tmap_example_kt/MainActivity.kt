package com.example.tmap_example_kt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tmap_example_kt.databinding.ActivityMainBinding
import com.skt.Tmap.TMapView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    // findViewById 생략 하는 함수
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* API KEY
        l7xx6c11a7128c354fa4a9944f2cab668afd */
        val tmapview = TMapView(baseContext)
        tmapview.setSKTMapApiKey("l7xx6c11a7128c354fa4a9944f2cab668afd")
        fuckingMap.addView(tmapview) // 앱에 지도 보여주게하는 기능

    }
}