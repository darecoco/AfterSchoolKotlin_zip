fun main() {
    var notNull : int = null //오류
    var okNull : Int? = null //정상
    //뒤에 물음표를 붙이면 null값도 포함된다
    
    var ary = ArrayList<int>(1)//1개짜리 배열 리스트
    ary!!.add(100)//값 100을 추가
    //느낌표 두 개면 절대 null값이 아니게 된다.
}
