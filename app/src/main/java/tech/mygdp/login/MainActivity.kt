package tech.mygdp.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val registerButton: Button = findViewById(R.id.register_button)
        registerButton.setOnClickListener{
            Toast.makeText(this,"user is already registered", Toast.LENGTH_SHORT).show()
        }
    }
}