package com.rezoo.sealedenum

sealed class HttpError(val code:Int){
    object Unauthorized:HttpError(401)
    object NotFound:HttpError(404)
}

enum class HttpErrorEnum(val code:Int){
    Unauthorized(401),
    NotFound(404)

}
