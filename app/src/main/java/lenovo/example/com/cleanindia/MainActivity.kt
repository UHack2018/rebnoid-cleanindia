package lenovo.example.com.cleanindia

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var c = findViewById<ImageButton>(R.id.imageButton7)
    c.setOnClickListener {
        var intent = (this, ::class.java)
        startActivity(intent)
}
