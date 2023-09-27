package com.example.mad_21012021098_practical_8

import android.app.AlarmManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun SetAlarm(militime:Long,action:String){
       val intentalarm = Intent(applicationContext,AlarmBroadcastReceiver::class.java)
        intentalarm.putExtra(AlarmBroadcastReceiver.ALARMKEY,action)
        val pandingintent = PandingIntent.get
            val manager = getSystemService(ALARM_SERVICE) as AlarmManager
            if (action==AlarmBroadcastReceiver.ALARMSTART){
                manager.setExact(AlarmManager.RTC_WAKEUP,militime,pandingintent)
            }
        else{
            manager.cancel(pandingintent)
                sendBroadcast(intentalarm)
        }
    }
}