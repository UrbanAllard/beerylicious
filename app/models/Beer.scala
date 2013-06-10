package models

import java.util.Date


import anorm._
import play.api.db.DB
import play.api.Play.current


case class Beer (id: Long,name:String,sort:String,description:String,country:String,region:String)
      object Beer{

        val sql: SqlQuery = SQL("select * from beers order by name asc")

        def findAll :List [Product ] =  DB.withConnection {
          implicit connection =>
            sql().map ( row =>
              Beer(row [Long]("id"), row[String]("sort"),
                row[String]("name"), row[String]("description"),row[String]("country"),row[String]("region"))
            ).toList
        }


        def insert(beer: Beer): Boolean = {
          DB.withConnection { implicit connection =>
            SQL("""insert into beers values ({id}, {name}, {sort},{description},{country},{region})""").on(
              "id" -> beer.id,
              "name" -> beer.name,
              "sort" -> beer.sort,
              "description" -> beer.description,
            "country" -> beer.country,
            "region" -> beer.region
            ).executeUpdate() == 1
          }
        }

        def create (beer: Beer) = {}

        def update(beer: Beer) = {}

        def delete (id: Long) = {}

        def findProductById (id:Long)={}
      }
