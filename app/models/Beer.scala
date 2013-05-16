package models


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
