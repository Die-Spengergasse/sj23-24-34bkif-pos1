# POS (Java), 3ABIF Übungsblatt zu Klassen, Testklassen und Berechnungen

## Sept. 2023

## Implementierung der Klasse `Person`

Implementieren Sie die Klasse `Person` wie folgt. 1) In der Print-Methode sollen
die vier Eigenschaften in der folgenden Form ausgegeben werden:

    Franz Maier (m), Groesse: 181 cm, Gewicht: 78 kg

oder

    Cecilia Tischler (w), Groesse: 172 cm, Gewicht: 67 kg

Das Gewicht muss zwischen 30 und 150 kg liegen, die Größe zwischen 110 und 220
cm (jeweils inklusive). Stellen Sie weiters sicher, dass keine `null`-Werte für
den Namen der Person verwendet werden.

Testklasse

Erstellen Sie eine Testklasse zur Klasse `Person` und testen Sie alle
Konstruktoren und Get-/Set-Methoden in der Methode `testPersonErzeugen()`.

Berechnung des Body-Mass-Index (BMI)

Der _Body-Mass-Index_ (BMI) berechnet sich anhand der Größe $g [m]$ und Gewicht
$w [kg]$ mittels $$bmi = \frac{w}{g^2}.$$

Berechnen Sie diesen Wert in der Methode `bmiBerechnen()` der Klasse `Person`
und geben Sie den Wert als Rückgabewert zurück.

Abhängig vom Geschlecht kann wie folgt klassifiziert werden:

                  BMI Frauen       BMI Männer

---

Untergewicht $<19$ $<20$ Normalgewicht $19 \hdots 24$ $20 \hdots 25$ Übergewicht
$>24$ $> 25$

Entwickeln Sie nun die Methode `bmiAusgeben()`, welche den BMI selbst, und die
Interpretation des BMIs zum Objekt auf die Konsole ausgibt. Diese Methode soll
die Methode `bmiBerechnen()` verwenden, und mit `if`-Bedingungen die
entsprechenden Fallunterscheidungen vornehmen.
