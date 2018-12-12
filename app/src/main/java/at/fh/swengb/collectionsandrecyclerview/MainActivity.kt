package at.fh.swengb.collectionsandrecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {





    val liste1 = listOf<Student>(
            Student("Tom",3),
            Student("Mac",1),
            Student("Alis",2),
            Student("Rob",4),
            Student("Anton",4)

    )
    val liste = mutableListOf<Student>(
            Student("Tom",3),
            Student("Mac",1),
            Student("Alis",2),
            Student("Rob",4),
            Student("Anton",4)

    )

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)


            Log.i("MainActivity","Student: " + liste1[2].name)

            //Can we add a student?   NO
            //liste1.add(Student("Bob",5))

            //Add to mutable List?    YES
            liste.add(Student("Bob",5))


            // Change student ind 3
            Log.i("MainActivity","Student: " + liste[3].name)
            liste[3]=Student("Rupert",3)
            Log.i("MainActivity","Student: " + liste[3].name)

            liste.add(Student("Martina",2))


            for (Student in liste){
                Log.i("MainActivity", Student.name)
            }


            val set = setOf<Student>(Student("Rob",26),
                    Student("Rob", 27),
                    Student("Lisa", 25),
                    Student("Maria",20),
                    Student("Rob",27),
                    Student("Lisa",25)
            )
            Log.i("MainActivity", "SETSIZE: " + set.size )
            for (Student in set){
                Log.i("MainActivity", "SET: " + Student.name + "  " + Student.currentSemester)

                //// HELP it is double ROB!! What is missing?
            }


            //create 2 list
            val ima18List = listOf(Student("Tyrion", 1), Student("Jon", 1))
            val ima17List = mutableListOf(Student("Sansa", 3), Student("Arya", 3), Student("Bran", 3))

            val studentMap = mapOf<String,List<Student>>("IMA18" to ima18List, "IMA17" to ima17List)

            Log.i("MainActivity", " ")
            Log.i("MainActivity", "    --------------    ")
            Log.i("MainActivity", "          MAP    ")
            Log.i("MainActivity", "    --------------    ")
            Log.i("MainActivity", " ")

            for ((key, value) in studentMap){
                for (Student in value){
                    Log.i("MainActivity", key + " " + Student.name)
                }
            }

            Log.i("MainActivity", " ")
            Log.i("MainActivity", "    --------------    ")
            Log.i("MainActivity", "     mutuable Map    ")
            Log.i("MainActivity", "    --------------    ")
            Log.i("MainActivity", " ")


            ima17List.add(Student("Gandalf",3))

            for ((key, value) in studentMap){
                for (Student in value){
                    Log.i("MainActivity", key + " " + Student.name)
                }
            }
            Log.i("MainActivity", " ")
            Log.i("MainActivity", "    --------------    ")
            Log.i("MainActivity", "     mutuable Map    ")
            Log.i("MainActivity", "    --------------    ")
            Log.i("MainActivity", " ")

            val studentMapMutable = studentMap.toMutableMap()
            val ima16List = mutableListOf(Student("Bitch", 3), Student("Lasagna", 3))
            studentMapMutable["IMA16"] = ima16List
            for ((key, value) in studentMapMutable){
                for (Student in value){
                    Log.i("MainActivity", key + " " + Student.name)
                }
            }





        }







}
