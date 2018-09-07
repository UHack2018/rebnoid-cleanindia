package lenovo.example.com.cleanindia

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_developer.*

class developer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_developer)
        submit.setOnClickListener{
            Toast.makeText(this,"THANK YOU FOR YOUR COMPLAIN",Toast.LENGTH_SHORT).show()
        }
        history.setOnClickListener{
            val intent = Intent(this,History::class.java)
            startActivity(intent)
        }
    }
}
