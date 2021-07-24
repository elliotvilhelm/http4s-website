package com.example.http4swebsite

import cats.effect.{ExitCode, IO, IOApp}

object Main extends IOApp {
  def run(args: List[String]) =
    Http4swebsiteServer.stream[IO].compile.drain.as(ExitCode.Success)
}
