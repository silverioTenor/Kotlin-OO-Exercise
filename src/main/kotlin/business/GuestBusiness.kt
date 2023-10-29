package business

import entity.Guest
import entity.GuestType

class GuestBusiness {
    fun typeValid(type: String): Boolean {
        return (
            type.uppercase() == GuestType.COMUM.name ||
            type.uppercase() == GuestType.PREMIUM.name ||
            type.uppercase() == GuestType.LUXO.name
        )
    }

    fun ofLegalAge(age: Int) = age >= 18

    fun invitationValid(guest: Guest): Boolean {
        return when (guest.type.uppercase()) {
            GuestType.COMUM.name -> guest.code.startsWith("xt")
            GuestType.PREMIUM.name, GuestType.LUXO.name -> guest.code.startsWith("xl")
            else -> false
        }
    }
}