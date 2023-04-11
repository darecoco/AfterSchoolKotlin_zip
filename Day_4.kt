abstract class Animal{
    var name : String = ""
    abstract fun move()
}

interface IAnimal{
    abstract fun eat()
}

class ICat : IAnimal{
    override fun eat(){
        println("생선을 좋아한다.")
    }
}

class ITiger : Animal(), IAnimal{
    override fun move(){
        println("네 발로 이동한다.")
    }
    override fun eat(){
        println("호랑이는 육식을 좋아행")
    }
    fun catchDear(){
        println("호랑이가 토끼를 잡았다.")
    }
}

// class Tiger : Animal(){
//     var age : Int = 0
//     override fun move(){
//         println("네 발로 이동한다.")
//     }
// }

// class Eagle : Animal(){
//     var home : String = ""
//     override fun move(){
//         println("날개로 날아간다.")
//     }
// }

fun main() {
//     var tiger1 = Tiger()
//     var eagle1 = Eagle()
    
//     tiger1.move()
//     eagle1.move()
	var cat = ICat()
    var tiger = ITiger()
    
    cat.eat()
    tiger.move()
    tiger.eat()
}
