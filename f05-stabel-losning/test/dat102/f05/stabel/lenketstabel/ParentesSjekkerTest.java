package dat102.f05.stabel.lenketstabel;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ParentesSjekkerTest {

    @Test
    public void testGyldigeParenteser() {
        assertTrue(ParentesSjekker.sjekkParanteser("{[()]}"));
        assertTrue(ParentesSjekker.sjekkParanteser("class Hello { public static void main() { System.out.println(\"Hi\"); } }"));
        assertTrue(ParentesSjekker.sjekkParanteser("(([[{{}}]]))"));
    }

    @Test
    public void testUgyldigeParenteser() {
        assertFalse(ParentesSjekker.sjekkParanteser("{[(])}")); // Feil rekkefølge
        assertFalse(ParentesSjekker.sjekkParanteser("{[()}")); // Mangler sluttparentes
        assertFalse(ParentesSjekker.sjekkParanteser("[(])")); // Feil nestet struktur
        assertFalse(ParentesSjekker.sjekkParanteser("]")); // Sluttparentes uten startparentes
    }
}
