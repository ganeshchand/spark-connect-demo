package com.gcdaii.demo.sparkconnet.server

import org.apache.spark.sql.SparkSession


object SparkConnectDemoCluster {

  def initialize(): Unit = {
    // create a local Apache Spark session
    val spark = SparkSession.builder()
      .appName("spark-connect-demo-cluster")
      .master("local[*]")
      .config("spark.plugins", "org.apache.spark.sql.connect.SparkConnectPlugin")
      .getOrCreate()

    // keep the spark running until manually stopped
    while(true) {
      Thread.sleep(1000)
    }
  }

  def terminate(): Unit = {
    // stop the spark session
    SparkSession.getActiveSession.get.stop()
  }
}
