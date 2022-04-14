package com.example.uccapplication.models

class CourseModel {
   private var code: String? = null
   private var name: String? = null
   private var credits: String? = null
   private var preRequests: String? = null
   private var description: String? = null

    constructor(
        code: String?,
        name: String?,
        credits: String?,
        preRequests: String?,
        description: String?
    ) {
        this.code = code
        this.name = name
        this.credits = credits
        this.preRequests = preRequests
        this.description = description
    }


}