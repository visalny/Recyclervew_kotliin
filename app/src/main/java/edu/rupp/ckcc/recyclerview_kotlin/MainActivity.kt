package edu.rupp.ckcc.recyclerview_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import edu.rupp.ckcc.recyclerview_kotlin.database.DbManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        var eventAdapter=EventAdapter(this)

        val dbManager = DbManager(this)
        dbManager.InsertData()
        //create tempory data
        val events = dbManager.getAllEvent()

//        var weather = Weather("k","1","2")
//        var weather2=Weather("p","","")
        //var weathers= arrayOf(weather,weather2)
//        var weathers= arrayOf<Weather>()
//        weathers[0]=Weather("k","1","2")
//        weathers[1]=Weather("p","","")
//        weathers[2]=Weather("kk","2","3")
        eventAdapter.data=events
        recyclerView.adapter=eventAdapter

    }
}
