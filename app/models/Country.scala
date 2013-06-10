package models

import anorm.Pk

/**
 * Created with IntelliJ IDEA.
 * User: urballex
 * Date: 2013-05-19
 * Time: 01:48
 * To change this template use File | Settings | File Templates.
 */
case class Country(id: Pk[Long],shortCode:String,name:String) {

}
