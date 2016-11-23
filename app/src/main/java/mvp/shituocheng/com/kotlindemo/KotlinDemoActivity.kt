package mvp.shituocheng.com.kotlindemo

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

/**
 * Created by shituocheng on 2016/11/23.
 */
class KotlinDemoActivity : AppCompatActivity() {

    var tx_view_kotlin : TextView ? = null
    var kotlinModel : KotlinDemoModel ? = null

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_kotlindemo)

        setUpView()

        setModelData()

        tx_view_kotlin?.text = kotlinModel!!.name
    }

    fun setUpView(){

        tx_view_kotlin = findViewById(R.id.tx_view_kotlinDemo) as TextView?


    }

    fun setModelData(){

        kotlinModel?.name = "Knotlin"

    }
}
