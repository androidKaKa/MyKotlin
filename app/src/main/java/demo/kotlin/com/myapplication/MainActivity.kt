package demo.kotlin.com.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import demo.kotlin.com.myapplication.demo.kotlin.com.Person
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        message.text="test kotlin"
        var musician:Artist
        message.text="sub "+sub(1,3)

        toast("test toast fun")

        var person=Person()
        person.name="tom"
        person.address="gd"
        person.age=12
        person.sex=0

        var name =person.name
        var listArr = ArrayList<String>()
        var i:Int=0



        val mRunnable = Runnable {
            run {
                Thread.sleep(5000)
                println("5s后打印输出")
                while(i<30000*20)
                {i++
                    listArr.add(person.name)
                }

            }
        }


        Thread(mRunnable).start()
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
