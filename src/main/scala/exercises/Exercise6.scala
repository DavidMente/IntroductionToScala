package exercises

import scala.io.Source

/* I/O Sandbox */

object Exercise6 {

  def main(args: Array[String]): Unit = {
    // val resourcesPath = getClass.getResource("/reddit.json")
    // println(resourcesPath.getPath)
    readFile("/reddit.json")
  }

  def readFile(resource: String): Unit = {

    val fileStream = getClass.getResourceAsStream(resource)
    val lines = Source.fromInputStream(fileStream).getLines
    lines.foreach(line => println(line))

  }

}
