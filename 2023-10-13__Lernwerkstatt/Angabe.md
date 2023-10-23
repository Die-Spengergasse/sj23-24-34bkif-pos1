# Aufgabe in der Lernwerkstatt

## Implementierung der Klasse "Wohnung"

-   groesseQM (int) Erlaubt (25-250m²)
-   kategorie (char) Erlaubt 'A', 'B' oder 'C'
-   lage (String) Erlaubt: "grün", "urban"
-   adresse (String) nicht null, nicht empty!

*   float berechneMiete () .. Monatsmiete
*   toString ("Wohnung Kategorie A, 65qm, Mietpreis: 1100€")

Berechnung der Miete:

Basispreis pro m²:

-   15€ für Kat A
-   3€ für Kat B
-   11€ für "C"

Wenn lage grün, dann soll der Preis mit dem Faktor 1.3 multipliziert werden.

Implementierung

-   getter
-   Setter
-   Testklasse, welche möglichst viel testet
