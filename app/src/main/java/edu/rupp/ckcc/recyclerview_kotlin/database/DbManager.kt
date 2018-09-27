package edu.rupp.ckcc.recyclerview_kotlin.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import edu.rupp.ckcc.recyclerview_kotlin.Weather

class DbManager(context: Context) : SQLiteOpenHelper(context, "mydbweather", null, 1){

    override fun onCreate(db: SQLiteDatabase?) {
        db!!.execSQL("Create table tblweather(id integer primary key autoincrement,province text,max text,min text)")

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun getAllEvent(): Array<Weather> {
        val database = readableDatabase
        //select database
        val cursor = database.query("tblweather", null, null, null, null, null, "id desc")
        //Cursor cursor1=database.rawQuery("select * from tblEvent order by id desc",null);

        val weathers = arrayListOf<Weather>()
        //var index = 0
//        while (cursor.moveToNext()) {
//            val id:Int=cursor.getInt(0)
//            val province=cursor.getString(1)
//            val max=cursor.getString(2)
//            val  min=cursor.getString(3)
//            var weather=Weather(id,province,max,min)
//            weathers[index]=weather
//
//
//
        while (cursor.moveToNext()) {
            val id = cursor.getInt(0)
            val province = cursor.getString(1)
            val max = cursor.getString(2)
            val min = cursor.getString(3)

            val event = Weather(id, province, max, min)
            //weathers[index] = event
            weathers.add(event)
            //index++
            //Free up cursor
            cursor.close()
        }
        return weathers.toTypedArray()
    }

        fun InsertData() {
            val database = writableDatabase
            for (i in 0..9) {
                database.execSQL("insert into tblweather(title,date,imageurl,location) values('event$i','','14 April','RUPP')")
            }
        }

    }