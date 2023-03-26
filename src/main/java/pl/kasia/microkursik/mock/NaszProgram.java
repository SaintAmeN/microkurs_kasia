package pl.kasia.microkursik.mock;

import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class NaszProgram {
    private final Serwis serwis;

    public Optional<Integer> sprawdzStanKonta() {
        if (serwis.jestDostepny()) {
            try{
                int stanKonta = serwis.getStanKonta();
                return Optional.of(stanKonta);
            }catch (RuntimeException re){
                throw new NaszException("mesedż");
            }
        }
        return Optional.empty();
    }
}
