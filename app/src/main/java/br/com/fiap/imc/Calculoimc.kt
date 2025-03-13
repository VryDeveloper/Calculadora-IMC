package br.com.fiap.imc

import kotlin.math.pow

fun calcularIMC(peso: Double, altura: Double): Double {
    var imc = peso / (altura / 100).pow(2)
    return imc
}

fun definirStatusIMC(imc: Double): String{
    var statusIMC = if(imc < 18.5){
        "Abaixo do Peso"
    } else if (imc >= 18.5 && imc < 25.0){
        "Peso Ideal"
    } else if (imc >= 25.0 && imc < 30.0){
        "Sobrepeso"
    } else if (imc >= 30.0 && imc < 35.0){
        "Obesidade Grau I"
    } else if (imc >= 35.0 && imc < 40.0){
        "Obsedidade Grau II"
    }else {"Obsedidade Grau III"}
    return statusIMC
}

fun corStatusIMC(statusIMC: String): Int{
    return when(statusIMC){
        "Abaixo do Peso" -> R.color.vermelho
        "Peso Ideal" -> R.color.verde
        "Sobrepeso" -> R.color.laranja
        "Obesidade Grau I" -> R.color.vermelho
        "Obsedidade Grau II" -> R.color.vermelho
        "Obsedidade Grau III" -> R.color.vermelho
        else -> R.color.white
    }
}