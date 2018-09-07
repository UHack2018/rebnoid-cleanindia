package lenovo.example.com.cleanindia

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        img1.setOnClickListener {
            val intent = Intent(this, developer::class.java)
            startActivity(intent)
        }
        img2.setOnClickListener {
            val intent = Intent(this, developer::class.java)
            startActivity(intent)
        }
        img3.setOnClickListener {
            val intent = Intent(this, developer::class.java)
            startActivity(intent)
        }
        img4.setOnClickListener {
            val intent = Intent(this, developer::class.java)
            startActivity(intent)
        }

        img5.setOnClickListener {
            val intent = Intent(this, developer::class.java)
            startActivity(intent)
        }
        img6.setOnClickListener {
            val intent = Intent(this, developer::class.java)
            startActivity(intent)
        }
    }
}
