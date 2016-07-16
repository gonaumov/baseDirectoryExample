import sbt.Keys.TaskStreams
import sbt._

object Tasks {
  def printBaseDirectory(streams: TaskStreams, dir: File): Unit = {
    streams.log.info("This is the value of baseDirectory: " + dir.getAbsolutePath)
  }
}
