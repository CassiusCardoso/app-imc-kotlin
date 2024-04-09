package br.com.fiap.projetoimc

import kotlin.math.pow

// Função responsável por calcular o IMC de acordo com o peso e altura do usuário. Dados fornecidos em kg e cm
fun calcularIMC(altura: Double, peso: Double) : Double{
    return peso / (altura / 100).pow(2.0)
}

//Função responsável por exibir o Status do IMC do usuário
fun determinarClasseIMC(imc: Double): String {
    return if (imc < 18.5) {
        "Abaixo do peso"
    } else if (imc >= 18.5 && imc < 25.0) {
        "Peso Ideal"
    } else if (imc >= 25.0 && imc < 30.0) {
        "Levemente acima do peso"
    } else if (imc >= 30 && imc < 35.0) {
        "Obesidade Grau I"
    } else if (imc >= 35.0 && imc < 40.0) {
        "Obesidade Grau II"
    } else {
        "Obesidade Grau III"
    }
}