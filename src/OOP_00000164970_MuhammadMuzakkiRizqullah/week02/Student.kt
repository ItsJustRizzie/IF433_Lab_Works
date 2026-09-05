package OOP_00000164970_MuhammadMuzakkiRizqullah.week02

class Student(
    val name: String,
    val nim: String,
    var major: String
){
    init{
        if(nim.length != 5) {
            println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
            println("Data mahasiswa $name mungkin bermasalah di sistem.")
        } else {
            println("LOG: Objek student $name berhasil dialokasikan di Memory.")
        }
    }
}