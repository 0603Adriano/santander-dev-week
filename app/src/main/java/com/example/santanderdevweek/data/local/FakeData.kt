package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta

class FakeData {

    fun getLocalData(): Conta {
        val cliente = Cliente("Adriano")
        val cartao = Cartao("8473")
        return Conta("732941-4", "7363-1", "R$ 12.866,75", "R$ 30.000,00", cliente, cartao);
    }
}