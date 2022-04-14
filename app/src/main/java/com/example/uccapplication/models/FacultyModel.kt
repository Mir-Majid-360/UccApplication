package com.example.uccapplication.models

class FacultyModel {
    var name: String? = null
    var phone: String? = null
    var email: String? = null


    constructor() {}
    constructor(name: String?, phone: String?, email: String?) {
        this.name = name
        this.phone = phone
        this.email = email
    }


}