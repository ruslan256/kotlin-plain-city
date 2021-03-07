package ru.ruslan.learn.city.interfaces

/*
 Все действия и свойства объектов прописываем согласно условию задачи (называют "ТЗ" - техническое задание).
 В интерфейсе можем определять как свойства, так и функции (в отличие от Java, где свойства приходилось описать с помощью методов get).
*/

// дом для заселения
interface IHouse {

    var address: String // адрес квартиры

    var flatList: ArrayList<IFlat> // список всех квартир дома

    fun addFlat(flat: IFlat) // добавить квартиру в дом

}