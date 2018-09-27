/*
Criar um programa que receba um valor inicial em reais. O programa deve permitir sacar, depositar valores a conta e
mostrar o saldo da conta atualizado:
1- Pedir o nome do Cliente e iniciar a conta com 500 reais
2- Mostrar o menu:
    1 - Ver saldo
    2 - Sacar
    3 - Depositar
    4 - Sair
 */

import javax.swing.*

fun main(args: Array<String>) {
    var saldo: Double = 500.0
    var valor: String
    val texto = "1 – Ver saldo\n" +
                "2 – Sacar\n" + "" +
                "3 – Depositar\n" +
                "4 – SAIR"

    do {
        val option = JOptionPane.showInputDialog(null, "Bem vindo. Selecione uma opção\n$texto")

        when (option) {
            // ver saldo
            "1" -> {
                JOptionPane.showMessageDialog(null,"Saldo: $saldo")
            }
            "2" -> {
                valor = JOptionPane.showInputDialog(null, "Digite o valor")
                if (valor.toDouble() > saldo)
                    JOptionPane.showMessageDialog(null,"Saldo insuficiente!")
                else
                    saldo -= valor.toDouble()
                    JOptionPane.showMessageDialog(null,"Saldo: $saldo")
            }
            "3" -> {
                valor = JOptionPane.showInputDialog(null, "Digite o valor")
                saldo += valor.toDouble()
                JOptionPane.showMessageDialog(null,"Saldo: $saldo")
            }
            "4" -> {
                JOptionPane.showMessageDialog(null,"Muito obrigado por usar nossos serviços\n"+"Volte sempre!")
            }
            else -> { // Note the block
                JOptionPane.showMessageDialog(null,"Opção inválida")
            }
        }

    } while (option != "4")
}