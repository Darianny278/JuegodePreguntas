package com.example.renglones.Ciencia;


public class PreguntasCiencia {

    private String mQuestions [] = {
            "¿Cuál de las sisguientes enfermedades ataca al higado?",
            "¿Cómo tomarías la sustancia alucinógena natural llamada ayahuasca? ",
            "¿Cuál es la función principal del instestino grueso?| ",
            "¿Qué hay en la boca del estómago?",
            "¿Qué cambio de estado ocurre en la sublimación? ",
            "¿Qué órgano del cuerpo humano produce la bilis?",
            "¿De qué color es la sange de los peces?",
            "¿Cuál de los siguientes órganos NO es parte del sistema inmunológico? ",
            "¿De donde de saca la sacarina?",
            "¿Cuántas caras tiene un icosaedro?",
            "¿Qué es el calostro?",
            "¿Cuál es el hueso más pequeño del cuerpo?",
            "¿Dónde vive el delfín rosado",
            "¿Qué estudia la icitología?",
            "¿Cuál es el mamífero más grande conocido hasta la actualidad?",
            "¿Qué es un equino?",
            "¿Qué causa furor en Internet?",
            "¿Con qué otro nombre se conoce el ciclo del agua?",
            "¿En qué parte del cuerpo tienen rayas el okapi?",
            "¿Cuántas cavidades estomacales tiene una vaca?",
            "¿Por qué los cocodrilos mantienen la boca abierta durante largo rato?",
            "¿Donde están los meniscos?",
            "¿Qué función cumplen los bigotes del gato?",
            "¿Qué hace la cochinilla de la humedad si la tocamos?",
            " ¿Qué es lo que transforma la leche en yogourt?",
            "¿Con qué abren las ostras las nutrias de mar?",
            "¿Qué tipo de mamífero es un conejo?",
            "¿Cuántos rayos gamma hay en una neurona? ",
            "¿Qué es Plutón? ",
            "¿En qué lugar del cuerpo se produce la insulina?",
            "¿Cómo se llama a los electrones que se encuentran en la última capa del átomo? ",
            "¿Cómo se llama a la sensibilidad dolorosa de los sonidos?| ",
            "¿Cuál de estas redes sociales es de ámbito laboral?",
            "¿Cómo se llama la parte de la estructura de una cúpula que la sostiene?",
            "¿Cómo se llama el nivel más alto de la marea?",
            " ¿Como debería estar una persona para que le fuera practicada una autopsia?",
            "¿Con que parte del cuerpo hacen el zumbido las abejas?| ",
            "¿Cómo se llama el incremento en el volumen,fluidez o frecuencia de las deposiciones?",
            "¿Cómo se mide la fuerza del viento en el mar?",
            "¿Cuál es el órgano que tiene como única función el placer?",
            "¿Qué droga de diseño,también conocida como MDMA, es análoga a la metanfetamina?"

    };


    private String mChoices [][] = {
            {"Hepatitis", "Diabetes", "Artrosis"},
            {"Esnifada", "Inyectada", "ingerida"},
            {"La absorcion de nutrientes", "La digestion mecanica de los alimentos", "La absorcion de agua"},
            {"El piloro", "El cardias", "Los acidos gastricos"},
            {"De solido a liquido" ,"De solido a gaseoso","De gaseoso a liquido"},
            {"Higado" ,"Pancreas","Intestino delgado"},
            {"Verde oscuro" ,"Marron oscuro","Rojo"},
            {"Esofago","Medula osea","Bazo"},
            {"Del aceite de girasol","Del azucar","Del carbon"},
            {"20","16","8"},
            {"MDMA","Salvia" ,"Mesclina"},
            {"El bulbo raquideo","La pituitaria","El nervio optico"},
            {"El alce","El corzo","El ciervo"},
            {"Una hormona" ,"Una parte del instestino grueso","La primera leche materna"},
            {"El yunque","La falnge","El estribo"},
            {"En Brasil","En Oceania","Solo en aguas calidas"},
            {"Las erupciones cutaneas ","Las rocas","Los peces"},
            {"Ballena Azul","Cachalote","Elefante"},
            {"Un antilope","Una oveja","Un caballo"},
            {"Ciclo natural","Ciclo hidroponico","Ciclo hidrologico"},
            {"La cabeza","El torso","La patas"},
            {"Dos","Tres","Cuatro"},
            {"Para calentarse","Para hacer la digestion","Para beber agua"},
            {"En la rodillas","En los codos","En la punta del pie"},
            {"Son un organo tactil","Son un organo auditivo","Son un organo olfativo"},
            {"Corre","Se muere","Se enrolla"},
            {"Un virus","Un musgo","Una bacteria"},
            {"Con un palo","Con los dientes","Con una piedra"},
            {"Roedor","Lagomorfo","Marsupial"},
            {"Dos","De dos a tres","Ninguno"},
            {"Un satelite","Un planeta","Un plutoide"},
            {"Pancreas","Higado","Intestino"},
            {"Iones","Electrones","Electrones de valencia"},
            {"Hipocusia","Hiperacusia","Micropsia"},
            {"Tuenti","Jobfire","Linkedin"},
            {"Nervaduras","Contrafuerte","Tambor"},
            {"Pleamar" ,"Bajamar","Repunte"},
            {"Sedada" ,"En coma","Muerta"},
            {"Con las patas", "Con las alas", "Con la boca"},
            {"Diverticulosis" ,"Hemorroides","Diarrea"},
            {"Pies" ,"Nudos","Zancadas"},
            {"Clitoris", "Vulva","Pene"},
            {"Crack", "Extasis","Popper"}
    };



    private String mCorrectAnswers[] = {"Hepatitis", "ingerida", "La absorcion de agua", "El cardias","", "De solido a gaseoso",
            "Higado", "Rojo", "Esofago", "Del carbon", "20","Mescalina","El nervio optico", "El alce", "La primera leche materna",
            "El estribo","En brasil","Los peces","Balleza Azul","Un caballo","Los gatos","Ciclo hidrologico", "Las patas",
            "Cuatro","Para calentarse","En las rodillas","Son un organo tactil","Se enrolla",  "Una bacteria",
            "Con una piedra","Lagomorfo","Ninguno","Un planeta","Pancreas","Electrones de valencia","Hiperacusia","Linkedln","Tambor",
            "Pleamar","Muerta","Con las alas","Diarrea","Nudos","Clitoris", "Extasis"};





    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
