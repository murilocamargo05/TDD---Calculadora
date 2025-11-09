import br.com.exemplo.calculadora.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testes da Calculadora")
class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    // =============== TESTES DA SOMA ===============
    @Test
    @DisplayName("Somar dois números positivos deve retornar a soma correta")
    void somar_numerosPositivos_retornaSomaCorreta() {
        // Arrange
        int a = 10;
        int b = 5;
        int esperado = 15;

        // Act
        int resultado = calculadora.somar(a, b);

        // Assert
        assertEquals(esperado, resultado, "10 + 5 deveria resultar em 15");
    }

    @Test
    @DisplayName("Somar número positivo e negativo deve retornar resultado correto")
    void somar_positivoENegativo_retornaSomaCorreta() {
        // Arrange
        int a = 8;
        int b = -3;
        int esperado = 5;

        // Act
        int resultado = calculadora.somar(a, b);

        // Assert
        assertEquals(esperado, resultado, "8 + (-3) deveria resultar em 5");
    }

    @Test
    @DisplayName("Somar com zero deve retornar o próprio número")
    void somar_comZero_retornaMesmoNumero() {
        // Arrange
        int a = 7;
        int b = 0;
        int esperado = 7;

        // Act
        int resultado = calculadora.somar(a, b);

        // Assert
        assertEquals(esperado, resultado, "7 + 0 deveria resultar em 7");
    }

    // =============== TESTES DA SUBTRAÇÃO ===============
    @Test
    @DisplayName("Subtrair dois números positivos com resultado positivo")
    void subtrair_resultadoPositivo_retornaValorCorreto() {
        // Arrange
        int a = 10;
        int b = 3;
        int esperado = 7;

        // Act
        int resultado = calculadora.subtrair(a, b);

        // Assert
        assertEquals(esperado, resultado, "10 - 3 deveria resultar em 7");
    }

    @Test
    @DisplayName("Subtrair resultando em número negativo")
    void subtrair_resultandoNegativo_retornaValorNegativo() {
        // Arrange
        int a = 2;
        int b = 5;
        int esperado = -3;

        // Act
        int resultado = calculadora.subtrair(a, b);

        // Assert
        assertEquals(esperado, resultado, "2 - 5 deveria resultar em -3");
    }

    @Test
    @DisplayName("Subtrair zero não altera o valor")
    void subtrair_zero_naoAlteraValor() {
        // Arrange
        int a = 9;
        int b = 0;
        int esperado = 9;

        // Act
        int resultado = calculadora.subtrair(a, b);

        // Assert
        assertEquals(esperado, resultado, "9 - 0 deveria resultar em 9");
    }

    // =============== TESTES DA MULTIPLICAÇÃO ===============
    @Test
    @DisplayName("Multiplicar dois números positivos")
    void multiplicar_numerosPositivos_retornaProdutoCorreto() {
        // Arrange
        int a = 4;
        int b = 6;
        int esperado = 24;

        // Act
        int resultado = calculadora.multiplicar(a, b);

        // Assert
        assertEquals(esperado, resultado, "4 * 6 deveria resultar em 24");
    }

    @Test
    @DisplayName("Multiplicar por zero resulta em zero")
    void multiplicar_porZero_retornaZero() {
        // Arrange
        int a = 100;
        int b = 0;
        int esperado = 0;

        // Act
        int resultado = calculadora.multiplicar(a, b);

        // Assert
        assertEquals(esperado, resultado, "100 * 0 deveria resultar em 0");
    }

    @Test
    @DisplayName("Multiplicar dois números negativos resulta em positivo")
    void multiplicar_doisNegativos_retornaPositivo() {
        // Arrange
        int a = -3;
        int b = -4;
        int esperado = 12;

        // Act
        int resultado = calculadora.multiplicar(a, b);

        // Assert
        assertEquals(esperado, resultado, "(-3) * (-4) deveria resultar em 12");
    }

    // =============== TESTES DA DIVISÃO ===============
    @Test
    @DisplayName("Divisão exata de inteiros")
    void dividir_divisaoExata_retornaResultadoInteiroComoDouble() {
        // Arrange
        int a = 20;
        int b = 4;
        double esperado = 5.0;

        // Act
        double resultado = calculadora.dividir(a, b);

        // Assert
        assertEquals(esperado, resultado, 0.001, "20 / 4 deveria resultar em 5.0");
    }

    @Test
    @DisplayName("Divisão com resto deve retornar decimal")
    void dividir_comResto_retornaDecimal() {
        // Arrange
        int a = 10;
        int b = 3;
        double esperado = 10.0 / 3;

        // Act
        double resultado = calculadora.dividir(a, b);

        // Assert
        assertEquals(esperado, resultado, 0.001, "10 / 3 deveria resultar em aproximadamente 3.333...");
    }

    @Test
    @DisplayName("Dividir número negativo por positivo")
    void dividir_negativoPorPositivo_retornaNegativo() {
        // Arrange
        int a = -15;
        int b = 3;
        double esperado = -5.0;

        // Act
        double resultado = calculadora.dividir(a, b);

        // Assert
        assertEquals(esperado, resultado, 0.001, "-15 / 3 deveria resultar em -5.0");
    }

    @Test
    @DisplayName("Dividir por zero deve lançar IllegalArgumentException")
    void dividir_porZero_deveLancarExcecao() {
        // Arrange
        int a = 10;
        int b = 0;

        // Act & Assert
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> calculadora.dividir(a, b),
                "Divisão por zero deve lançar IllegalArgumentException"
        );

        // Assert adicional: verificar mensagem
        assertTrue(exception.getMessage().contains("zero"),
                "A mensagem deve mencionar 'zero'");
    }
}