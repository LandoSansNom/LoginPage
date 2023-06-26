package com.example.Assignment1

//fun main() {
//    var creditCardNumber: String = "1121-0000-0000-0398"
//    var expirationDate: String = "03/98"
//    val companies = mutableMapOf<String, String>()
//
//    companies["ACME"] = "1121"
//    companies["ALFA"] = "1111"
//    companies["AMEX"] = "3796"
//
//    println(checkCreditCard(creditCardNumber,expirationDate,companies))
//
//}

fun checkCreditCard(creditCardNumber: String,expirationDate: String, companies: Map<String,String>): Boolean{

    val formattedExpirationDate: String = expirationDate.replace(Regex("[^0-9]"), "")
    val creditCardNumberFirstFourDigits: String = creditCardNumber.substring(0,4)
    val creditCardNumberLastFourDigits: String = creditCardNumber.substring(15,19)
    return companies.containsValue(creditCardNumberFirstFourDigits) && creditCardNumberLastFourDigits == formattedExpirationDate

}