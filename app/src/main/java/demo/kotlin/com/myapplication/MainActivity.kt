package demo.kotlin.com.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        message.text="test kotlin"
        var musician:Artist
        message.text="sub "+sub(1,3)

        toast("test toast fun")

    }

    data class Artist(var id: Long,
                      var name: String,
                      var url:  String,
                      var age: Int)

    fun add(x:Int,y:Int):Int=x+y

    fun sub(x:Int,y:Int):Int=x-y


    fun toast(str:String,time:Int= Toast.LENGTH_LONG)
    {
        Toast.makeText(this,str,time)
    }

}
