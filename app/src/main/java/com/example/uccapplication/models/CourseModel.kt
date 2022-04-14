package com.example.uccapplication.models

class CourseModel {
    var code: String? = null
    var name: String? = null
    var credits: String? = null
    var pre_requisites: String? = null
    var description: String? = null

    constructor(
        code: String?,
        name: String?,
        credits: String?,
        pre_requisites: String?,
        description: String?
    ) {
        this.code = code
        this.name = name
        this.credits = credits
        this.pre_requisites = pre_requisites
        this.description = description
    }

    constructor(code: String?, name: String?, credits: String?) {
        this.code = code
        this.name = name
        this.credits = credits
    }
}