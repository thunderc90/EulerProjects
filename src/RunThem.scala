/**
 * Created by buckl on 2/17/2016.
 */

import scala.concurrent._
import ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration


object RunThem {

  val projects = Map[Int, Future[Unit]](
      1 -> Future(Project1.run(1000)),
      2 -> Future(Project2.run(4000000)),
      3 -> Future(Project3.run(13195))
    )
  
  def main(args: Array[String]): Unit = {
    //build list of requested projects from command line
    val projectNums: List[Int] = args.toList.flatMap(stringToInt(_))

    //create list of futures that will run requested projects
    // if no projects are requested simply run them all
    val requestedProjects = projectNums.length match {
      case 0 => projects.keySet.flatMap(projects.get(_))
      case _ => projectNums.flatMap(projects.get(_))
    }
    
    Await.result(Future.sequence(requestedProjects), Duration.Inf)
  }

  //used for parsing command line args
  def stringToInt(s: String): Option[Int] = {
    try {
      Some(s.toInt)
    } catch {
      case e: NumberFormatException => None
    }
  }
}