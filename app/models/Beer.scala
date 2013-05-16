package models

/**
 * Created with IntelliJ IDEA.
 * User: urballex
 * Date: 2013-05-09
 * Time: 23:05
 * To change this template use File | Settings | File Templates.
 */
case class Beer (id:Long,name:String,sort:String,description:String,country:String,region:String)
      object Beer{
        var beers = Set(
          Beer(1,"Amarillo","ale","Smakrik öl av ale typ","Sverige","Dalarna"),
          Beer(2,"Landsorts lager","lager","Lager öl med stark sötma och beska","Sverige","Nynäshamn"),
          Beer(3,"Nils Oscars kalasöl","lager","Smakrik öl av ale typ","Sverige","Södermanland")
        )
        def findAll = this.beers.toList.sortBy(_.id)
        def findById(id:Long) = this.beers.find(_.id == id)
      }
 case class Brewery(id:Long,name:String,country:String,region:String,beers:Set)
     object breweries {
       var breweries = Set(Brewery)
     }
