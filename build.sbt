lazy val root = (project in file(".")).
  settings(
    name := "hello",
    version := "1.0",
    scalaVersion := "2.11.7"
  )

lazy val printBaseDirectory: TaskKey[Unit] = TaskKey[Unit]("printBaseDirectory", "Print baseDirectory for the project", KeyRanks.ATask)
printBaseDirectory <<= streams map Tasks.printBaseDirectory



