package kun.hee.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class NextActivity :BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        setupEvents()
        setValues()

        Log.d("NextActivity","onCreate실행됨")
//       Main 화면에서 버튼 눌러질때마다 Create된다~!
//        버튼 누르기 전에는 Oncreate되지 않아~!
//        왜냐면 뒤로가기 버튼 >>> onDestroy
    }

    override fun onResume() {
        super.onResume()
        Log.d("NextActivity","onResume실행됨")
    }

    override fun setupEvents() {

    }

    override fun setValues() {

    }

}
