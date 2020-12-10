package com.example.renglones.Geografia;


public class PreguntasGeografia {

    private String mQuestions [] = {
            "¿Dónde desemboca el río Amazonas?",
            "¿En qué país puedes visitar Machu Picchu?",
            "¿Cuál es la isla más grande del mar Caribe?",
            "¿Cuál es el principal río que recorre el Gran Cañón de Estados Unidos?",
            "¿Qué país tiene más volcanes?",
            "¿Cuál es el rio mas caudaloso del mundo?",
            "¿Dónde se encuentra el río Támesis?",
            "¿Cuál es el continente más grande de la tierra?",
            "¿Qué vía artificial conecta el océano Pacífico con el océano Atlántico?",
            "¿Cuál es la capital de Australia?",
            "¿De qué país es capital la ciudad de Viena?",
            "¿Cuál es el idioma oficial de Brasil?",
            "¿Cuál es el país más poblado de África?",
            "¿Qué país tiene más costa?",
            "¿Qué nombre de país se origina a partir de una línea de latitud?",
            "¿En qué cordillera se encuentra el Monte Everest?",
            "¿Qué nombre se la da a la parte norte de China?",
            "¿Cuál es el país más grande de Sudamérica?",
            "En que cordillera se encuentra el pico Duarte?",
            "En que Region se encuentra ubicada la Provincia Santiago",
            "¿Cuál es la isla más grande del mundo?",
            "¿Qué país se parece a una bota?",
            "¿Qué mar rodea a la isla mexicana de Cozumel?",
            "Que provincia se le conoce como el granero del sur?",
            "En que provincia se encuentra el principal polo turístico de la República Dominicana?",
            "De estos rios cual es el mas largo de la Republica Dominicana?",
            "¿Qué país europeo se encuentra más al oeste?",
            "En que Region se encuentra ubicado el Distrito Nacional?",
            "Cual es el lago mas grande de la Republica Dominicana?",
            "En que region se encuentra el lago Enriquillo?",
            "¿Qué nación africana tiene más pirámides?",
            "En que cordillera nace el rio Yaque del norte?",
            "¿En qué estado de Estados Unidos se encuentra la ciudad de Metropolis?",
            "¿Cuál es el país más pequeño de Suramérica?",
            "¿Qué canal conecta el mar Mediterráneo y el mar Rojo?",
            "¿Cuál es la Isla más grande del mar Mediterráneo?",
            "¿Qué país tiene más lagos naturales?",
            "¿En qué monte acabó el arca de Noé de acuerdo a la Biblia?",
            "¿Cuál es el océano más grande del mundo en superficie?",
            "¿Cuál es el punto más alto de Colombia?",
            "¿Cuál es el estado más pequeño de los Estados Unidos?",
            "¿Qué océano rodea Hawai?",
            "¿Cuál es la península más grande del mundo?",
            "¿Cuáles son las cataratas más altas del mundo?",
            "¿Qué países comparten la frontera más larga del mundo?"

    };


    private String mChoices [][] = {
            {"En el Océano Atlántico", "En el Océano Pacifico", "En el Mediterráneo"},
            {"Argentina", "Brasil", "Perú"},
            {"Puerto Rico", "Cuba", "Republica Dominicana"},
            {"El Colorado", "Amazonas", "Nilo"},
            {"China" ,"México","Estados Unidos"},
            {"El Amazonas" ,"Misisipi","Amarillo"},
            {"En Londres, Reino Unido " ,"Paris, Francia","Pekin, China"},
            {"America","Asia","Oceania"},
            {"El Canal de Kiel","El canal de la Mona","El Canal de Panama"},
            {"Camberra","Londres","Nueva Australia"},
            {"Venecia","Italia" ,"Austria"},
            {"Brasileño","Portugués","Español"},
            {"Nigeria","Oman","Alemania"},
            {"Canadá" ,"República Dominicana","Jamaica"},
            {"Rusia","El Ecuador","Hondura"},
            {"En el Himalaya","Cordillera Central","Cordillena Norte"},
            {"China Norte","Hong Kong","Manchuria"},
            {"Brasil","Venezuela","Peru"},
            {"Cordillera Oriental","Cordillera Central","Sierra de Bahoruco"},
            {"Region Sureste","Region Norte o Cibao","Provincia Sto Dgo"},
            {"Groenlandia","Catalina","Saona"},
            {"Rusia","China","Italia"},
            {"Mar Rojo","Mar Caribe","Mar Mediterraneo"},
            {"San Juan de la Maguana","La Vega","Hato Mayor"},
            {"La Romana","Barahona","Puerto Plata"},
            {"Yaque del Norte","Rio Ozama","Rio Higuamo"},
            {"Venecia","Holanda","Islandia"},
            {"En la Region Norte o Cibao","En la Region Sureste","En la Provincia Santo Domingo"},
            {"Lago Enriquillo","Laguna Salada","Ninguno"},
            {"Region Sureste","Region Norte o Cibao","Region Suroeste"},
            {"Sudafrica","Sudan","Nairobi"},
            {"Cordillera Oriental","Cordillera Central","Cordillera Septentrional"},
            {"Illinois","Amsterdam","New York"},
            {"Peru","Colombia","Surinam"},
            {"El Canal de Suez","El canal de la Mona","El Canal de Panama"},
            {"Groenlandia","Sicilia","Isla de la Tortuga"},
            {"Canadá" ,"Venecia","Jamaica"},
            {"Monte Alto" ,"En el monte Everest","En el monte Ararat"},
            {"El Océano Atlántico", "El Océano Pacifico", "El Mediterráneo"},
            {"El Pico Colon" ,"El pico Duarte","Alto Colon"},
            {"Filadelfia" ,"Rhode Island","Bronx"},
            {"Pacifico", "Mediterráneo","Atlántico"},
            {"La Península Italica", "La Península Iberica","La Península Arábiga"},
            {"Cataratas del Iguazú", "El salto del ángel","Cataratas Del Niagara"},
            {"Estados Unidos y Canadá", "RD y Haiti","Colombia y Venezuela"}
    };



    private String mCorrectAnswers[] = {"En el Océano Atlántico", "Perú", "Cuba", "El Colorado","Estados Unidos", "El Amazonas",
            "En Londres, Reino Unido", "Asia", "El Canal de Panama", "Camberra", "Austria","Portugués","Nigeria", "Canadá", "El Ecuador",
            "En el Himalaya","Manchuria","Brasil","Cordillera Central","Region Norte o Cibao","Groenlandia","Italia", "Mar Caribe",
            "San Juan de la Maguana","Puerto Plata","Yaque del Norte","Islandia","En la Region Sureste",  "Lago Enriquillo",
            "Region Suroeste","Sudan","Cordillera Central","Illinois","Surinam","El Canal de Suez","Sicilia","Canadá","En el monte Ararat",
            "El Océano Pacifico","El Pico Colon","Rhode Island","Pacifico","La Península Arábiga","El salto del ángel",
            "Estados Unidos y Canadá"};




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
