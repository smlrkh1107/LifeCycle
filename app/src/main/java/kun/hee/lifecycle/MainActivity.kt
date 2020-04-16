package kun.hee.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
        Log.d("MainActivity","onCreate실행됨")
        // 로그가 한번만 실행됨. 다른곳 다녀왔다고해서 다시 로그 찍히지 않아.
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume실행됨")
//        해당화면으로 return하면 다시 로그 찍히지. 다른화면 갔다오면 다시불러옴.
//        게시글을 쓰고 다시 돌아왔을 때, 새로운 게시글도 다시 불러오게 해준다.
    }

    override fun setupEvents() {
        nextBtn.setOnClickListener {
            val myIntent = Intent(mContext,NextActivity::class.java)
            startActivity(myIntent)
        }
    }

    override fun setValues() {

    }


}
