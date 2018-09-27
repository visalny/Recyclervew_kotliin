package edu.rupp.ckcc.recyclerview_kotlin

class Weather{
    var id:Int?=null
    var province: String? = null
    var max: String? = null
     var min: String? = null

    constructor(id: Int?,province: String?, max: String?, min: String?) {
        this.id=id
        this.province = province
        this.max = max
        this.min = min
    }
}