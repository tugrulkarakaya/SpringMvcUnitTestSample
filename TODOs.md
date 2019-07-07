# Projektarbeit Schwerpunkt Backend

REST-Schnittstelle, Formularaufbau, Validierung

# Vorab

* Es sind mehr TODOs als an einem Tag zu schaffen sind. Das "wie" und "warum" ist im Zweifelsfall wichtiger als die
Vollständigkeit. 
* Das Layout muss nicht schön sein, es sollte nur funktionieren. 
* Das Projekt sollte zum Schluss vollständig durchlaufen. Der Aufruf `mvn clean verify` muss erfolgreich sein.

# Aufgabe

Die Web-Applikation kann mit `mvn tomcat7:run` gestartet werden. Sie ist aufrufbar mittels: [http://localhost:8080/klt](http://localhost:8080/klt)
Die Seite umfasst ein Anmeldeformular mit Vor- und Nachnamen. Die Anwendung soll in dieser Aufgabe Schritt für Schritt erweitert werden.

1. Es soll möglich sein das Formular abzusenden. Steht in allen Feldern etwas drin, so soll eine Information erscheinen:
   "Vielen Dank für ihre Angaben". Im Fehlerfall soll wieder das Formular erscheinen und die fehlerhaften Felder markiert werden.

2. Es soll ein neuer REST-Service hinzugefügt werden. 

  1. Unter der Adresse GET /klt/rest/rest/age/{age} (wobei {age} eine Zahl ist) sollen folgende Status zurückgegeben werden:

     * Werte < 18 resultieren in der Meldung "zu jung"
     * Werte > 67 resultieren in der Meldung "zu alt"
     * Ist der Wert eine Primzahl kommt die Meldung: "lustig"
     * Sonst "OK"
  2. Zu der Methode im REST-Service soll ein neuer JUnit-Test geschrieben werden, der im Build-Prozess auch ausgeführt wird.

3. Dem Formular auf der Startseite ein neues Feld hinzufügen mit dem Label "Age". Es soll eine Instant-AJAX/REST-Validierung mittels 
   obenigem REST-Service durchgeführt werden, wenn der User das Feld verlässt und der ensprechende Status angezeigt werden. 
   Ein Abspeichern des Formulars ist nicht möglich, wenn der Status nicht "OK" oder "lustig" ist.

4. Die erfolgreich abgespeicherten Anfragen sollen irgendwie abgespeichert werden

5. Es soll einen neuen REST-Service geben, der alle gespeicherten Anfragen ausgibt

6. Es soll eine neue Webseite geben, die alle gespeicherten Anfragen anzeigt. 

7. In der Liste der gespeicherten Anfragen soll zusätzlich bei jeder Anfrage ein Button erscheinen, der es ermöglicht,
   diese spezifische Anfrage via REST-Service wieder zu löschen. Der REST-Service ist analog zu den anderen umzusetzen.
