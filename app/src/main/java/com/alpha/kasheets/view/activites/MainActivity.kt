package com.alpha.kasheets.view.activites

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alpha.kasheets.databinding.ActivityMainBinding
import com.alpha.kasheets.view.bottomsheets.pizzasheet.BottomSheetFragment

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnShowPizza.setOnClickListener {
            val bottomSheet = BottomSheetFragment()
            bottomSheet.show(supportFragmentManager, BottomSheetFragment.TAG)
        }
    }
}