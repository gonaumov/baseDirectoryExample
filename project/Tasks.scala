import sbt.Keys.TaskStreams
import sbt._

object Tasks {
  def printBaseDirectory(streams: TaskStreams): Unit = {
    streams.log.info("Here I want to print the value of baseDirectory")
  }
}
