package com.example.materialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.materialdesign.databinding.ActivityViewBinding

class ViewActivity : AppCompatActivity() {

    var binding: ActivityViewBinding? = null
    var adapter: FactAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setUpFact()
    }

    private fun setUpFact() {
        adapter = FactAdapter(this,DummyData.funFacts)
        binding?.factListView?.adapter = adapter
    }

    fun oneDestroy() {
        super.onDestroy()
        binding = null
    }
}
