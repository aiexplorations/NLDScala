import scala.collection.mutable.ArrayBuffer

/**
  * Created by Rajesh Sampathkumar on 2/12/2017.
  */

class fixedPoint ( f: Double => Double ) {
  //Initializing the function and variables
  val func = f
  val size = 10000

  //Defining the domain of the function
  val domain = new ArrayBuffer[Double](size)
  for (i <- 0 to size) {
    domain.append(math.random)
  }

  //Calculating domain and range of function
  val range = domain.map(x => func(x))
  val fixedPoints = domain.zip(range).map(x => if( math.abs(x._1 - x._2) < 0.001) x._1 else None)
  fixedPoints.filter(x => (x != None)).foreach(println)


}
