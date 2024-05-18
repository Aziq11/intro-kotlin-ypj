//Aziq Azmi 2024-05-18
fun main() {
    
    //print ->type tanpa enter
    println("Hello, Android ATC") //println print + new line
    
    //Creating const var
    val x = 1
    val y = 3
    
    println(x)
    
    val z = x+y
    println(z)
    
    val name = "Aziq"
    //name = "Aziq Azmi"
    println(name)
    
    var fullName = "Aziq"
    fullName = "Aziq Azmi"
    println(fullName)
    
    //Data type
     val address:String = "Kota Damansara"
    println(address)
    
    var jantina:Char = 'L'
    println(jantina)
    
    //Operation
    val message = "My name is " + name
    println(message)
    
    //String interpolation
    
    val anotherMessage = "My name is $name and I live in $address"
    println(anotherMessage)
    
    //Number
    var num1:Double = 300.5555
    var num2:Int = 92
    
    var sum = num1+num2
    println(sum)
    
    //Operation +, -, *, /, %
    var minus = num1-num2
    println(minus)
    
    var product = num1*num2
    println(product)
    
    var division = num1 / num2
    println(division)
    
    var modulo = num1 % num2
    println(modulo)
    
    //Boolean (true or false)
    var eaten = true
    var tired:Boolean = false
    
    //Boolean operation : && (AND), || (OR), ! (Reverse)
    println(eaten && tired)
    println(eaten || tired)
    println(!eaten)
    
    //Nullable
    var profession = null
    
    var newProfession:String? = null
    println(newProfession)
    println(profession)
    newProfession = "Trainer"
    println(newProfession)
    
    //Array
    var score = arrayOf(70,90,100,80,85,65)
    println(score[2])
    println(score.size)
    
    //Control flow in Kotlin
    var myAge = 16
    
    if(myAge < 18)
    println("You are underage")
    println("The End")
    
    if (myAge < 18)
    {
        println("You are underage")
    }

    else
    {
        println("You can watch the movie")
    }
    
    if(myAge < 13)
    {
        println("")
    }
    else if (myAge < 18)
    {
        println("You can watch with your parent (PG)")
    }
    else
    {
        println("You can watch the movie")
    }
    
    var childAge = 17
    var parent = true
    
    if(childAge < 18)
    {
        println("You cannot watch the movie")
    }
    else if(childAge <18 && parent == true)
    {
        println("You can watch the movie")
    }
    else
    {
        println("You can watch the movie")
    }
    
    //When
    var size23 = 1
    var price = 0

    when (size23) {
        1-> price = 5
        2-> price = 7
        3-> price = 10
        else-> println("We don't support other sizes23")
            
    }
    println(price)

    //For loop
    	println("Result:Menaik")
    for (i in 0..5)
    {
        println("i = $i")
    }
    
        println("Result:Menurun")
    for(i in 5 downTo 0)
    {
        println("i = $i")
    }
    
        println("Result:Menaik 2")
    for (i in 1..5 step 2)
    {
        println("i = $i")
    }
    
        println("Result:Menurun 2")
    for (i in 1 downTo 5 step 2)
    {
        println("i = $i")
    }
    
    var languages = arrayOf("Ruby", "Kotlin", "Java")
    for (item in languages)
    {
        println(item)
    }
    
    //While
    var x1 = 3
    while(x1 <= 5)
    {
        println("x1 = $x1")
        x1++ //Selagi nilai x1 kurang dari 5, keluarkan nilai x1 dan tambah 1 setiap kali
    }
    
    //Do While
    var x2 = 2
    do
    {
        println("x2 = $x2")
        x2++ //Ulang semula selagi x2 kurang sama dengan 5
    }
    while(x2<=5)
    
    //Break
    var x3 = 1
    do
    {
        println("x3 = $x3")
        x3++
        if(x3 == 3)
        break
    }
    while (x3 <= 5)
    
    //Continue
    var x4 = 0
    do
    {
        x4++
        if(x4==3)
        {
            continue
        }
        println("x4 = $x4")
    }
    while (x4 <= 5)
    
    sayHello() //Function invoke
    sayGoodBye("Abu")
    sayGoodBye("Ali")
    
    println(calculationBMI(170.0,80.0))
}


//Function
fun sayHello()
{
    println("Hello World -AziqAzmi")
}

fun sayGoodBye(namaku:String)
{
    println("Goodbye $namaku");
}

fun sum (a:Int, b:Int):Int
{
    return a + b
}

fun calculationBMI(height:Double, weight:Double): Double
{
    return weight / ((height/100) * (height/100))
}

