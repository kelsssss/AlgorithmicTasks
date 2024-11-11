package solutions

fun num2(){
    //Строки:
    var h = 3
    //Пиксели в строках:
    var w = 4

    var pixelCount = w*h

    for(row_min in 0 .. h - 1){
        for(row_max in row_min .. h - 1){
            for(col_min in 0 .. w - 1){
                for(col_max in col_min .. w - 1){
//                    for each pixel in this rectangle increase
//                    value by one
                    pixelCount++

                }
            }
        }
    }
    println(pixelCount)




}