import java.io.File
import java.io.InputStream
/*
* Advent of code day1 with bubble sort for part two
*/

class BubbleSort : SortAlgorithms<ArrayList<Int>> {
    override fun sort(arr: ArrayList<Int>) {
        val size = arr.size
        for (i in 0 until size) {
            for (j in 1 until size - i) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    arr.swap(j, j - 1)
                }
            }
        }
    }
}
fun main(args: Array<String>) {
    val filename = "/home/shifu/Documents/ideaProjects/adventofcode_D1_22/src/main/input1.txt"
    val inputStream: InputStream = File(filename).inputStream()
    val lineList = mutableListOf<String>()
    val sortAlgorithms: SortAlgorithms<ArrayList<Int>> = BubbleSort()

    var test1:Int = 0
    var win:Int=0
    var test2: Int=0
    var result: Int=0
    var second: Int = 0
    var third: Int = 0
    var counter: Int = 0
    var counter1: Int = 1
    var arraylist = ArrayList<Int>()
    var sort = ArrayList<Int>()


    inputStream.bufferedReader().forEachLine { lineList.add(it) }
    lineList.forEach{
        if(it.isNotBlank()){
            win = it.toInt()
            test1 += win
            //println("The number $win and the total $test1")
            if(test1 > test2){
                //println("Test1 $test1 and Test2 $test2")
                result = test1
                test2 = test1
                //println("TEST $result")
                //println(counter1)
                counter1++
            }
        }else{
            //println(it)
            arraylist.add(test1)
            //println(test1)
            test1 = 0
        }
    }

    sortAlgorithms.sort(arraylist)
    System.out.print("------result------- \n$arraylist")





    /*for(i in arraylist){
        println(i)
    }*/
    /*test1 = 1
    while(test1 < test2){
        test1 = arraylist[counter]
        while(test1 > second){

        }
        println(test1)
        println(test2)
        println("does it work")
        counter++

    }*/

    //println("The answer is $sum")
}



