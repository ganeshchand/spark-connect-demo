package com.gcdaii.demo.sparkconnect.client

import org.apache.spark.sql.SparkSession
object Main {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().remote("sc://localhost").build()
    spark.range(10).show

    spark.range(10).explain(true)
  }
}