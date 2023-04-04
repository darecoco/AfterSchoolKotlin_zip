fun main() {
     var one = Array<Int>(4,{0})
     one[0] = 10
     one[3] = 20
     for(i in one.indices)
     	println(one[i])
     println("----------------------------------")
     var two = Array<IntArray>(3, {IntArray(4,{2})})
     //3행 4열의 2차원 배열
     //row의 index: 0~2
     //col의 index: 0~3
     two[1][2] = 100
     two[2][3] = 200
    
 	for(i in two.indices){
         for(j in two[i].indices){
             print("${two[i][j]} ")
         }
         println()
     }
  println("----------------------------------")
     //쌤버전
     for((i, row) in two.withIndex()){
         for((j, col) in row.withIndex()){ //j열에 해당하는 값이 col에 저장
             print("($i, $j) = $col\t")
         }
         println();
     }
    println("----------------------------------")
    var one2 = ArrayList<Int>(4)
    one2.add(10)
    one2.add(20)
    var hap = one2.get(0) + one2.get(1)
    //첫 번째 값 + 두 번째 값
    
    var arrList = ArrayList<Int>(3)
    arrList.add(10)
    arrList.add(20)
    arrList.add(30)
    arrList.add(40)
    arrList.add(50)

    var sum = 0
    for(num in arrList){
        sum += num
    }
    println(sum)
    println("----------------------------------")
    for(i in 1..10 step 2){
        print("$i ")
    }
    println("\n----------------------------------")
    var leng = 5
    for(j in 1..leng)
    	print("$j |")
    //윗 문장: 1 <= 5, 아랫문장: 1 < 5
    println("\n----------------------------------")
    for(i in 1 until leng)
    	print("$i /")
    println("\n----------------------------------")
    
    var two2 : Array<String> = arrayOf("하나", "둘", "셋")
    for(i in 0..2 step 1){
        print("${two2[i]} ")
    }
    println()
    var k : Int = 0
    while (k < two2.size){
      	print("${two2[k]} ")
		k++
    }
}
