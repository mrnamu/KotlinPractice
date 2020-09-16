package chap05.section6.association


// Association 연관 관계
class Patient(val name:String) {
    fun printDoctor(d:Doctor) {
        println("Patient: $name, Doctor: ${d.name}")
    }
}

class Doctor(val name: String) {
    fun printPatient(p:Patient) {
        println("Doctor: $name, Patient: ${p.name}")
    }
}

fun main() {
    val doc1 = Doctor("KimSabu")
    val patient1 = Patient("GilDong")
    doc1.printPatient(patient1)
    patient1.printDoctor(doc1)
}