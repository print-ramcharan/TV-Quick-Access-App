package com.example.websites

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the ImageButtons by their IDs
        val imageButton1: ImageButton = findViewById(R.id.imageButton1)
        val imageButton2: ImageButton = findViewById(R.id.imageButton2)
        val imageButton3: ImageButton = findViewById(R.id.imageButton3)
        val imageButton4: ImageButton = findViewById(R.id.imageButton4)

        // Set the images from the drawable folder programmatically
        imageButton1.setImageResource(R.drawable.ibomma) // Replace with actual image resource
        imageButton2.setImageResource(R.drawable.popcornflix) // Replace with actual image resource
        imageButton3.setImageResource(R.drawable.tubi) // Replace with actual image resource
        imageButton4.setImageResource(R.drawable.popcornflix) // Replace with actual image resource

        // Set the background to ensure focus and highlight works
        imageButton1.setBackgroundResource(R.drawable.button_selector)
        imageButton2.setBackgroundResource(R.drawable.button_selector)
        imageButton3.setBackgroundResource(R.drawable.button_selector)
        imageButton4.setBackgroundResource(R.drawable.button_selector)
    }

    // Method that will be triggered when any image button is clicked
    fun onImageButtonClick(view: View) {
        when (view.id) {
            R.id.imageButton1 -> openUrl("https://ott.ibomma.games/telugu-movies/")
            R.id.imageButton2 -> openUrl("https://freeonlinehd.site/popcornflix/")
            R.id.imageButton3 -> openUrl("https://tubitv.com/home")
            R.id.imageButton4 -> openUrl("https://www.example4.com")
        }
    }

    // Open a URL in the browser
    private fun openUrl(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}
