package aufgaben.lösung_1;

// Das Strategieinterface deklariert alle Methoden, um die gewünschten Algorithmen in den konkreten Strategien umzusetzen.
// Der Kontext benutzt dieses Interface, um die Algorithmen der konkreten Strategien aufzurufen.
interface ArithmetischeStrategie
{
    int berechne(int zahl1, int zahl2);
}

//------------------------------------------------------------------------------------------------------------------------
// Konkrete Strategien implementieren ihren Algorithmus, indem sie den Vertrag
// des Interface erfüllen. Das Interface macht sie austauschbar in der Kontextklasse.
class KonkreteStrategieAddition implements ArithmetischeStrategie{

    @Override
    public int berechne(int zahl1, int zahl2) {

        return zahl1 + zahl2;
    }
}

//-------------------------------------------------------------------------------------------------------------------------

//Konkrete Strategien implementieren ihren Algorithmus, indem sie den Vertrag
//des Interface erfüllen. Das Interface macht sie austauschbar in der Kontextklasse.
class KonkreteStrategieDivision implements ArithmetischeStrategie{

    @Override
    public int berechne(int zahl1, int zahl2) {
        return zahl1/zahl2;
    }
}

//-------------------------------------------------------------------------------------------------------------------------
//Konkrete Strategien implementieren ihren Algorithmus, indem sie den Vertrag
//des Interface erfüllen. Das Interface macht sie austauschbar in der Kontextklasse.
class KonkreteStrategieMultiplikation implements ArithmetischeStrategie{

    @Override
    public int berechne(int zahl1, int zahl2) {
        return zahl1 * zahl2;
    }
}

//--------------------------------------------------------------------------------------------------------------------------
//Konkrete Strategien implementieren ihren Algorithmus, indem sie den Vertrag
//des Interface erfüllen. Das Interface macht sie austauschbar in der Kontextklasse.
class KonkreteStrategieSubtraktion implements ArithmetischeStrategie{

    @Override
    public int berechne(int zahl1, int zahl2) {

        return zahl1 - zahl2;
    }
}