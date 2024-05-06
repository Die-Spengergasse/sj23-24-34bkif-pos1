# 4BKIF

#### Themen: HashSet, HashMap, FileReader, CSV, streams()

### Einleitung

In der Datei "geschenke.csv" findet sich in jeder Zeile ein Bauklotz, welcher in Klaras Baukasten
aufgenommen werden soll. Manche Zeilen sind fehlerhaft. Diese mögen mit entsprechender Fehlermeldung
nach Sytem.err ausgegeben werden.

Der Baukasten hat "Abteilungen" für die unterschiedlichen Objekte, eine Abteilung mit
Würfeln, eine mit Zylindern, eine mit Quadern, und eine mit Kugeln.

Innerhalb dieser Abteilungen werden die Körper sortiert. Siehe Aufgabe 5!

### Aufgabe 1: Einlesen der CSV Datei

Lesen sie die "geschenke.csv" mithilfe des Stream-API's ein!

Tipp: BufferedReader.lines() als stream-Quelle

### Aufgabe 2: Implentierung der Klasse `KoerperParameter`

Im Konstruktor dieser Klasse werden aus dem übergebenen Parameter (`line`) die einzelnen
Felder befüllt. Beachten Sie hier, daß nicht jede Zeile 6 Spalten hat (Würfel, Kugel: 4 Spalten,
Zylinder: 5, Quader: 6). Führen Sie eine gründliche Parameterprüfung durch, welche bei
allen möglichen Fehlern eine neue `IllegalArgumentException` wirft!

(6 Punkte)

### Aufgabe 3: Konstruktor von `Baukasten` - einordnen in Abteilungen

Im Konstruktor von `Baukasten` wurde der Code entfernt, welcher die Körper in die
jeweilige Abteilung einordnet. Die Abteilung eines Körpers wird durch
`koerper.getClass().getSimpleName()` ermittelt.

(7 Punkte)

### Aufgabe 4: Gesamtgewicht des Baukastens

Das Gewicht wird aus Eigengewicht + Summe aller Körpergewichte ermittelt. Vervollständigen
Sie die vorhandene Methode!

(2 Punkte)

### Aufgabe 5: `compareTo` in `Koerper`

Wie in der Einleitung erwähnt, sind innerhalb der Abteilungen des Baukastens die Körper
nach Farbe zu sortieren (alphabetisch), und bei Gleichheit nach Gewicht (absteigend)

Gutes Gelingen!




