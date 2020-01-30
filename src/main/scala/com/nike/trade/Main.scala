package com.nike.trade

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import com.nike.trade.controller.StockTradeApiController
import com.nike.trade.repository.ItemRepositoryImpl

import scala.io.StdIn

object StockTradeApplication extends StockTradeApplication with App {
}

class StockTradeApplication {

  implicit val system = ActorSystem("tradeapi")
  implicit val materializer = ActorMaterializer()
  implicit val executionContext = system.dispatcher

  val repo = new ItemRepositoryImpl()

  val routes = new StockTradeApiController(repo).route

  val bindingFuture = Http().bindAndHandle(routes, "localhost", 9099)

  println("Server online")
  StdIn.readLine()
  bindingFuture.flatMap(_.unbind()).onComplete(_ => system.terminate())

}
