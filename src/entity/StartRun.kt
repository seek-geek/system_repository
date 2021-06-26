package entity

fun main() {
    println("main====>");
    var stu: Student = Student();
    stu.name = "小米";
    stu.age = 20;

    var al : Student = Student();
    al.name = "阿里";
    al.age = 19;

    var list : MutableList<Student> = mutableListOf();
    list.add(stu);
    list.add(al);
    list.forEach{
        println("it = ${it.toString()}")
    }

}