fun main () {
   var myList = getStringAt(listOf("Susan","Mary" , "Brena","Joyce","Salama","John"))
    println(myList)
   println( peopleHeights(listOf(4.5,5.7,5.8,9.6)))

    var Grace = Person("Grace",21,4.3,56.7)
    var Susan = Person("Susan",22,4.5,54.6)
    var Esther = Person("Esther",20,5.5,60.7)
    var peopleList = mutableListOf<Person>(Grace,Susan,Esther)
   // println(peopleList)
     println(sortList(peopleList))
    //Adding more objects into Person class
    var anotherlist =(mutableListOf((Person("Pascaline",12,5.4,43.5))
        ,Person("Effence",20,4.4,60.0)))
    peopleList.addAll(anotherlist)
    println(peopleList)
    addPerson()

    var Subaru = Car("KCT 234R",234)
    var Vitz = Car("KCB 256T",134)
    var opel = Car("KCE 435Y",756)
    var cars = listOf(Subaru,Vitz,opel)
    println(getAverage(cars))

}
fun getStringAt (names:List<String>):List<String> {
    var new = mutableListOf<String>()
     names.forEachIndexed { index, name ->
         if (index%2==0){
              new.add(name)
         }
     }
    return new
}
fun peopleHeights (height:List<Double>):String{
    var x = height.sum()
    var y = height.average()


      return ("The total height is $x metres, and Average is $y metres")
}
data  class Person (var name:String, var age:Int, var height:Double ,var weight:Double)
    fun sortList(agesort: List<Person>): List<Person> {
      var mine = agesort.sortedByDescending { person -> person.age  }
        return mine
}
fun addPerson () {
    var people = mutableListOf<Person>()
    people.addAll(mutableListOf( Person("Effence",20,3.8,67.0),
    Person("Pascaline",21,3.6,67.0)))
}

//how to solve no.3


data class Car (var Registration:String, var mileage:Int)
 fun getAverage (avgmileage:List<Car>): Double{
     var sum = 0.0
     avgmileage.forEach { car ->
         sum+=car.mileage


     }
     var avg = sum/avgmileage.count()
     return avg

 }
