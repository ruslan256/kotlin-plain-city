package ru.ruslan.learn.city.objects

import ru.ruslan.learn.city.interfaces.IFlat
import ru.ruslan.learn.city.interfaces.IHouse

import java.util.*

// дом
class House(override var address: String) : IHouse {

    override var flatList = ArrayList<IFlat>() // список квартир в доме (обязательно сразу создаем пустую коллекцию)

    // добавляем квартиру в дом
    override fun addFlat(flat: IFlat) {
        flatList.add(flat)
    }

}
