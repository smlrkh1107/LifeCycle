package kun.hee.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun setupEvents() {
        nextBtn.setOnClickListener {
            val myIntent = Intent(mContext,NextActivity::class.java)
            startActivity(myIntent)
        }
    }

    override fun setValues() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
        Log.d("MainActivity","onCreate실행됨")
    }
}
