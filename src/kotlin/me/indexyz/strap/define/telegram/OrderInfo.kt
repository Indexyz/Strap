package me.indexyz.strap.define.telegram

data class OrderInfo (
    val name: String?,
    val phone_number: String?,
    val email: String?,
    val shipping_address: ShippingAddress?
)