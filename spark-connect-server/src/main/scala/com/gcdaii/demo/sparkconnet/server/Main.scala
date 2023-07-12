package com.gcdaii.demo.sparkconnet.server

import org.apache.spark.sql.SparkSession

object Main {
  def main(args: Array[String]): Unit = {
    SparkConnectDemoCluster.initialize()

    val spark = SparkSession.getActiveSession.get
    spark.range(10).show
  }
}