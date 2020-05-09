package com.urbanclap.loki


class LokiConfig private constructor(
    val lokiCustomTheme: Int) {


   companion object{
       @JvmStatic
       var instance : LokiConfig = LokiConfig{}
   }


    constructor(builder: Builder) : this(
        builder.lokiCustomTheme){
        instance = this
    }



    class Builder() {

        constructor(init: Builder.() -> Unit) : this() {
            init()
        }

        var lokiCustomTheme: Int = R.style.LokiTheme


        fun setLokiCustomTheme(init: Builder.() -> Int) = apply { lokiCustomTheme = init() }


        fun build(): LokiConfig {
           return LokiConfig(this)
        }
    }
}

fun LokiConfig(block: LokiConfig.Builder.() -> Unit): LokiConfig =
    LokiConfig.Builder().apply(block).build()