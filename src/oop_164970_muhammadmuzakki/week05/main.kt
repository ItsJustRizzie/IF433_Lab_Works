package oop_164970_muhammadmuzakki.week05

/**fun main() {
    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("------------------------------")
    }
}**/

fun main() {
    println("=== MATH TEST ===")
    val mathHelper = mathHelper()
    println("Area of a square (side: 5): ${mathHelper.areaCalculator(5)}")
    println("Area of a rectangle (4*6): ${mathHelper.areaCalculator(4, 6)}")
    println("Area of a circle (radius: 7.0): ${mathHelper.areaCalculator(7.0)}")
    println()
}