package ru.ruslan.learn.city.objects

//import ru.ruslan.learn.city.interfaces.DEFAULT_CAPACITY
import ru.ruslan.learn.city.interfaces.IFlat
import java.util.*

// квартира
class Flat(override var number: Int) : IFlat {

    override var settlerList = ArrayList<Settler>() // список жителей квартиры (сразу создаем пустую коллекцию)

    // добавление жителя в квартиру
    override fun addSettler(settler: Settler) {
        if (settlerList.size < Constants.DEFAULT_CAPACITY) { // если еще есть свободное место в квартире
            settlerList.add(settler)
        } else {
            println("Нельзя заселить более 2-х жителей в квартиру $number")
        }
    }



}
