package com.example.coroutinessample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coroutinessample.experiment.CoroutineTest

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        runExperiments()
    }

    private fun runExperiments(){
        CoroutineTest.apply {
//            runBlockingExample()
//            runBlockingInWorkerThread()
//            launchExample()
//            sampleTest()
            testMultipleScopes()
        }

    }
}