package com.akirachix.myauthorlistapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.myauthorlistapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvAuthors.layoutManager = LinearLayoutManager(this)

         Displayauthors()

    }
    fun Displayauthors(){
        var author1 = authors_class("Nakato","The River Beyound","12/01/2020","MORE","The woman went to the market to buyt tomatoes and onins","","")
        var author2 = authors_class("Babirye","The Art of War","12/01/2020","MORE","The woman went to the market to buyt tomatoes and onins","","")
        var author3 = authors_class("Baraza","The Granary","12/01/2020","MORE","The woman went to the market to buyt tomatoes and onins","","")
        var author4 = authors_class("Samuel","The Post","12/01/2020","MORE","The woman went to the market to buyt tomatoes and onins","","")
        var author5 = authors_class("Sidney","Love blooms","12/01/2020","MORE","The woman went to the market to buyt tomatoes and onins","","")
        var author6 = authors_class("Okwonkwo","Samson","12/01/2020","MORE","The woman went to the market to buyt tomatoes and onins","","")

    val authorslists = listOf(author1,author2,author3,author4,author5,author6)
    val contactAdapters = ContactAdapter(authorslists)
    binding.rvAuthors.adapter = contactAdapters


}
}