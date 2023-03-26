package pl.kasia.microkursik.strumienie.klasy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Obywatel {
    private String imie;
    private int wiek;
}
