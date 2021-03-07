package ru.ruslan.learn.city

import ru.ruslan.learn.city.objects.City
import ru.ruslan.learn.city.objects.Flat
import ru.ruslan.learn.city.objects.House
import ru.ruslan.learn.city.objects.Settler

fun main() {

        // создаем город
        val city = City("Котлин")

        // дома для города
        val house1 = House("ул. Весенняя, д.7")
        val house2 = House("ул. Горная, д.29")
        val house3 = House("ул. Пушкина, д.105")
        val house4 = House("ул. Чехова, д.3")
        val house5 = House("ул. Королева, д.125")

        // создаем квартиры для домов
        val flat1 = Flat(1)
        val flat2 = Flat(2)
        val flat3 = Flat(3)
        val flat4 = Flat(4)
        val flat5 = Flat(5)
        val flat6 = Flat(6)
        val flat7 = Flat(7)
        val flat8 = Flat(8)
        val flat9 = Flat(9)
        val flat10 = Flat(10)

        // создаем жителей
        val settler1 = Settler("settler1")
        val settler2 = Settler("settler2")
        val settler3 = Settler("settler3")
        val settler4 = Settler("settler4")
        val settler5 = Settler("settler5")
        val settler6 = Settler("settler6")
        val settler7 = Settler("settler7")
        val settler8 = Settler("settler8")
        val settler9 = Settler("settler9")
        val settler10 = Settler("settler10")
        val settler11 = Settler("settler11")
//        val settler12 = Settler("settler12")
        val settler13 = Settler("settler13")
        val settler14 = Settler("settler14")
        val settler15 = Settler("settler15")
        val settler16 = Settler("settler16")
        val settler17 = Settler("settler17")
        val settler18 = Settler("settler18")

        // добавляем дома в город
        city.addHouse(house1)
        city.addHouse(house2)
        city.addHouse(house3)
        city.addHouse(house4)
        city.addHouse(house5)

        // добавляем квартиры в дома
        house1.addFlat(flat1)
        house1.addFlat(flat2)
        house2.addFlat(flat3)
        house2.addFlat(flat4)
        house3.addFlat(flat5)
        house3.addFlat(flat6)
        house4.addFlat(flat7)
        house4.addFlat(flat8)
        house5.addFlat(flat9)
        house5.addFlat(flat10)

        // добавляем жителей в квартиры
        flat1.addSettler(settler1)
        flat1.addSettler(settler2)
        flat2.addSettler(settler3)
        flat2.addSettler(settler4)
        flat2.addSettler(settler5) // пытаемся заселить в одну квартиру более 2-х человек - в консоли выводим ошибку
        flat3.addSettler(settler6)
        flat4.addSettler(settler7)
        flat4.addSettler(settler8)
        flat5.addSettler(settler9)
        flat5.addSettler(settler10)
        flat6.addSettler(settler11)
//        flat6.addSettler(settler12)
        flat7.addSettler(settler13)
        flat7.addSettler(settler14)
        flat8.addSettler(settler15)
        flat8.addSettler(settler16)
        flat9.addSettler(settler17)
        flat9.addSettler(settler18)

        city.showSettledList() // показать заселенных жителей
    }
