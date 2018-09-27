package edu.rupp.ckcc.recyclerview_kotlin

class Weather{
    var province: String? = null
   var max: String? = null
     var min: String? = null

    constructor(province: String?, max: String?, min: String?) {
        this.province = province
        this.max = max
        this.min = min
    }
}