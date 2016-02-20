package buckley.euler

/**
 * Object that Drives the execution of Euler Projects
 * Created by buckl on 2/17/2016.
 */

import buckley.euler.project._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration.Duration

object RunThem {

  val projects = Map[Int, (Project, BigInt)](
      1 -> (Project1.asInstanceOf[Project], BigInt(1000)),
      2 -> (Project2.asInstanceOf[Project], BigInt(4000000)),
      3 -> (Project3.asInstanceOf[Project], BigInt(600851475143L))
  )

  def main(args: Array[String]): Unit = {
    //build list of requested projects from command line
    val projectNums: List[Int] = args.toList.flatMap(stringToInt)

    //build list of (Project,BigInt) types based on requested project nums
    // if no projects build a list of them all
    val requestedProjects = projectNums.length match {
      case 0 => projects.keySet.flatMap(projects.get)
      case _ => projectNums.flatMap(projects.get)
    }

    //execute Futures and await they're completion
    Await.ready(Future.sequence(requestedProjects.map{
        case (project,num) => Future(project.run(num))
    }), Duration.Inf)
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