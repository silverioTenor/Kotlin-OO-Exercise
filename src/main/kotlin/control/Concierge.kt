package control

import business.GuestBusiness
import entity.Guest

class Concierge {

    private val guestBusiness = GuestBusiness()

    init {
        println("Portaria inicializada!")
        println(control())
    }

    private fun control(): String {
        val age = Console.readInt("Qual a sua idade? ")
        val guest = Guest(age = age)

        if (!guestBusiness.ofLegalAge(guest.age)) {
            return "Negado. Menores de idade não são permitidos."
        }

        guest.type = Console.readString("Qual é o tipo de convite? ")
        if (!guestBusiness.typeValid(guest.type)) {
            return "Negado. Convite inválido."
        }

        guest.code = Console.readString("Qual o código do convite? ")
        if (!guestBusiness.invitationValid(guest)) {
            return "Negado. Convite inválido."
        }

        return "Welcome! :)"
    }
}