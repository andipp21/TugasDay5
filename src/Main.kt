fun main() {
    val intMax = Int.MAX_VALUE
    val intMin = Int.MIN_VALUE
    IntegerValues().values(intMax, intMin)
    longValues()
    floatValues()
    doubleValues()
    stringValues()
}

class IntegerValues {
    fun values(intMax: Int, intMin: Int) {
        println("Tipe Data Int")
        println("Int Max Values: $intMax")
        println("Int Min Values: $intMin")
    }
}

fun longValues() {
    val longMax: Long = Long.MAX_VALUE
    val longMin: Long = Long.MIN_VALUE
    println("Tipe Data Long")
    println("Long Max Values: $longMax")
    println("Long Min Values: $longMin")
}

fun floatValues() {
    val floatMax: Float = Float.MAX_VALUE
    val floatMin: Float = Float.MIN_VALUE
    println("Tipe Data Float")
    println("Float Max Values: $floatMax")
    println("Float Min Values: $floatMin")
}

fun doubleValues() {
    val doubleMax: Double = Double.MAX_VALUE
    val doubleMin: Double = Double.MIN_VALUE
    println("Tipe Data Double")
    println("Double Max Values: $doubleMax")
    println("Double Min Values: $doubleMin")
}

fun stringValues() {
    val stringVal = StringBuilder()
    val stringMax = stringVal.capacity()

    //max string di dapatkan dari total kapasitas ram yang dapat digunakan.

    println("Tipe Data String")
    println("String Max Values : $stringMax")
    println("String Min Values : 0")
}