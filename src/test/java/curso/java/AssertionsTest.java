package curso.java;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    void assertEquals_SameObject(){
        int i1 = 5;
        int i2 = 5;

        assertEquals(i1, i2);
    }

    class Punto {
        int x;
        int y;

        public Punto(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Punto punto = (Punto) o;
            return x == punto.x && y == punto.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    @Test
    void assertEquals_MismoPunto_True(){
        Punto p1 = new Punto(1,2);
        Punto p2 = new Punto(1,2);

        assertEquals(p1,p2);
    }

    @Test
    void assertNotEquals_PuntoDiferente_False(){
        Punto p1 = new Punto(1,2);
        Punto p2 = new Punto(2,2);

        assertNotEquals(p1,p2);
    }

    @Test
    void assertNull_NullObject(){
        Punto p1 = null;

        assertNull(p1);
    }
    @Test
    void assertNotNull_NotNullObject(){
        Punto p1 = new Punto(1,2);

        assertNotNull(p1);
    }

    int divide(int d1, int d2){
        return d1 /d2;
    }

    @Test
    void divide_DivideByZero_ShouldThrowException(){
        int d1 = 4;
        int d2 = 0;
        try {
            int result = divide(d1,d2);
            fail();
        } catch (Exception e){
            System.out.println("División por 0");
        }
    }

    @Test
    void divide_DivideByZero_ShouldThrowArithmeticException(){
        int d1 = 5;
        int d2 = 0;

        assertThrows(ArithmeticException.class, () -> divide(d1,d2));

    }
    @Test
    void runSeveralAsserts(){
        assertTrue(true);
        assertTrue(true);
        assertFalse(false);
    }
    @Test
    void assertAllTest(){
        assertAll(
                () -> assertTrue(true),
                () -> assertTrue(true),
                () -> assertFalse(false)
        );
    }
}
