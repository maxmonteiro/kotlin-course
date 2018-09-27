// Exemplo interface gráfica com Swing
import javax.swing.*

fun main(args: Array<String>) {
    val nome = JOptionPane.showInputDialog("Olá, insira seu nome")
    JOptionPane.showMessageDialog(null, "Bem vindo $nome")
}