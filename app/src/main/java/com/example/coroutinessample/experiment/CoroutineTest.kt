package com.example.coroutinessample.experiment

import kotlinx.coroutines.*
import kotlin.random.Random

object CoroutineTest {

    const val TAG = "##"

    /**
     * What does run blocking do?
     * completely blocks the thread
     *
     */
    fun runBlockingExample(){
        runBlocking {
            //Thread.sleep(10000)
            //delay(10000)
            println("$TAG This is inside run blocking $TAG")
        }
        kotlin.run {
            println("$TAG This is run after blocking $TAG")
        }
    }

    /**
     * Run blocking example with another thread
     */
    fun runBlockingInWorkerThread(){
        runBlocking(Dispatchers.IO){
            println("$TAG Before delay or sleep $TAG")
            delay(2000)
            //Thread.sleep(1000)
            println("$TAG After delay or sleep $TAG")
        }
        kotlin.run {
            println("$TAG This is after run blocking")
        }
    }

    /**
     * This runs exactly like thread.start()
     *
     */
    fun launchExample(){
        GlobalScope.launch{
            println("$TAG This is launch scope before delay $TAG")
            //delay(3000)
            Thread.sleep(3000)
            println("$TAG This is launch scope after delay $TAG")
        }
        kotlin.run {
            println("$TAG This is normal scope before delay $TAG")
            Thread.sleep(2000)
            println("$TAG This is normal scope after delay $TAG")
        }
    }

    fun sampleTest(){
        runBlocking {
            launch {
                println("$TAG This is a launch scope before delay $TAG")
                //delay(400)
                //Thread.sleep(300)
                val ans = testSuspended()
                print("$TAG $ans")
                println("$TAG This is a launch scope after delay $TAG")
            }
            kotlin.run {
                println("$TAG This is normal scope before delay $TAG")
                delay(20)
                //Thread.sleep(200)
                println("$TAG This is normal scope after delay $TAG")
            }
        }
    }

    private suspend fun testSuspended():Unit{
        withContext(Dispatchers.IO) {
            delay(10000)
        }
        //return Random(1).nextInt()
    }

    fun testMultipleScopes() = runBlocking { // this: CoroutineScope
        launch {
           delay(200L)
            println("$TAG Task from runBlocking")
        }

        coroutineScope { // Creates a new coroutine scope
            launch {
                delay(500L)
                println("$TAG Task from nested launch")
            }

            delay(100L)
            println("$TAG Task from coroutine scope") // This line will be printed before nested launch
        }

        println("$TAG Coroutine scope is over") // This line is not printed until nested launch completes
    }

}