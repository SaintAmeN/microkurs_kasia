package pl.kasia.microkursik.mock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class NaszProgramTest {

    @Test
    public void test_emptyJesliSerwisNiedostepny() {
        Serwis serwis = mock(Serwis.class);
        when(serwis.jestDostepny()).thenReturn(false);

        NaszProgram naszProgram = new NaszProgram(serwis);

        // jeśli serwis jest niedostepny to stan konta powinien być pusty
        assertTrue(naszProgram.sprawdzStanKonta().isEmpty());
    }

    @Test
    public void test_zwracaStanKontaJesliJestDostepny() {
        final int stanKonta = 30;
        Serwis serwis = mock(Serwis.class);
        when(serwis.jestDostepny()).thenReturn(true);
        when(serwis.getStanKonta()).thenReturn(stanKonta);

        NaszProgram naszProgram = new NaszProgram(serwis);

        assertFalse(naszProgram.sprawdzStanKonta().isEmpty());
        assertEquals(stanKonta, naszProgram.sprawdzStanKonta().get());
    }

    @Test
    public void test_nieWykrzaczaSieJakSerwisRzuciException() {
        Serwis serwis = mock(Serwis.class);
        when(serwis.jestDostepny()).thenReturn(true);
        when(serwis.getStanKonta()).thenThrow(new RuntimeException("ugabuga bug"));

        NaszProgram naszProgram = new NaszProgram(serwis);
        assertThrows(NaszException.class, () -> {
            naszProgram.sprawdzStanKonta();
        });
    }
}