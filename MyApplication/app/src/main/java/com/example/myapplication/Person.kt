package com.example.myapplication

class Person (var name: String, var age: Int){



    fun sortByAge(list: List<Person>): List<Person>{
     val temp: MutableList<Person> = mutableListOf()

     for(j in 0 < until < list.count()){
          var minPerson = Person("",0)
          for(i in 0 <= until <list.count()){
            if(minPerson.age < list[i].age && !temp.contains(list[i])){
                minPerson = list[i]
              }
          }
          temp.add(0, minPerson)
     }
     return temp
    }


    val items = listOf("Kotlin", "Java", "Javascript")
    val sorteditems = items.sorted()


    val alpha = items.sortedWith(compareBy { it.length })
}