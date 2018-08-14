package demo.kotlin.com.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        message.text="test kotlin"
        var musician:Artist

    }

    data class Artist(var id: Long,
                      var name: String,
                      var url:  String,
                      var age: Int)
}
