fun main()
{
    println("Базовый класс")
    val Taskaev = Sportsmen("Тасакаев",100.0,20.0)
    println(Taskaev.printInfo())
    println("Класс потомка")
    val TaskaevChild= SportsmenChild("Тасакаев",100.0,20.0,false)
    println(TaskaevChild.printInfo())
}


