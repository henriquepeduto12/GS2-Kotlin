package com.example.gs2_kotlin

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun TelaIMC(navController: NavController) {

    var nome by remember { mutableStateOf("") }
    var peso by remember { mutableStateOf("") }
    var altura by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text("Calculadora IMC", fontSize = 26.sp)

        OutlinedTextField(
            value = nome,
            onValueChange = { nome = it },
            label = { Text("Seu nome") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp)
        )

        OutlinedTextField(
            value = peso,
            onValueChange = { peso = it },
            label = { Text("Seu peso") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp)
        )

        OutlinedTextField(
            value = altura,
            onValueChange = { altura = it },
            label = { Text("Sua altura") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp)
        )

        Button(
            onClick = {
                try {
                    val p = peso.toFloat()
                    val a = altura.toFloat()
                    val imc = p / (a * a)
                    resultado = "Olá $nome, seu IMC é %.2f".format(imc)
                } catch (e: Exception) {
                    resultado = "Valores inválidos"
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        ) {
            Text("Calcular")
        }

        if (resultado.isNotEmpty()) {
            Text(
                resultado,
                modifier = Modifier.padding(top = 20.dp),
                fontSize = 18.sp
            )
        }

        Button(
            onClick = { navController.navigate("menu") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 22.dp)
        ) {
            Text("Voltar")
        }
    }
}
