#Oefening week 4

1. Maak een JEE project met maven aan. Het artifactid = Stringer
2. Zorg dat als je in de browser naar http://localhost:8081/stringer gaat, dat de tekst "Mijn eigen stringer" wordt getoond.
3. Download de klasse Stringer. Deze heeft als attributen "string" en "reverse". Gebruik de methodes uit deze klasse in deze opdracht.
4. Als je http://localhost:8081/stringer/reverse?string=hallo aanroept, dan wordt er ollah naar de browser geschreven. Implementeer hiervoor een reverse functie in de klasse Stringer.
5. Als je een POST doet naar //localhost:8081/stringer/reverse dan krijg je op basis van een meegegeven string het hele object in json terug. Inclusief de http Ok status.
6. Als je je end points hebt geschreven in de klasse Stringer, verplaats deze dan naar een controller. Als je het al direct in een controller had geplaatst, dan ben je dus nu klaar met deze stap.
7. Waarschijnlijk heb je ergens in je controller een New staan om een instantie van Stringer te initialiseren. Gebruik setter injection en CDI om deze "new" weg te werken.
8. Zorg ervoor dat als je http://localhost:8081/stringer/reverse/27+5 aanroept, de reverse van de optelling in json terug wordt gestuurd. Het bericht ziet er als volgt uit: {"Reverse calced":"23"}
9. Controleer of er in de bij 8 gebruikte parameter wel een +, - of * zit. Zo niet, retourneer dan een error code 400.
10. Schrijf een unit tests die aantoont dat deze 400 wordt gegooid.
11. Schrijf unit tests die aantonen dat de reverse methode van de klasse Stringer werkt.
12. Schrijf een unit test voor de endpoint uit opdracht 4. De kans is dat je nu een null pointer exception krijgt. Werk deze weg.

