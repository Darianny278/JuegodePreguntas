package com.example.renglones.deportes;


public class PreguntasDeportes {

    private String mQuestions [] = {
            "¿Cuáles son las siglas de la Liga de Béisbol Profesional de la República Dominicana?",
            "¿Cuantos campeonatos tienen los tigres del licey?",
            "¿Cual es el color del equipo los tigres del Licey?",
            "¿Cuantos home runs tiene Juan Francisco en Lidom?",
            "¿Cual es la mascota del equipo de los Gigantes del Cibao?",
            "¿Quien fue el primer jugador dominicano en llegar a la NBA?",
            "¿Que equipo de la NBA firmo al dominicano Luis Montero?",
            "¿Cuantos años tiene el equipo de Las Aguilas Cibaeñas?",
            "¿Cual es la capitana de las Reinas del Caribe?",
            "¿Cual dominicana se encuentra en el Top 5 de las mejores libero del mundo?",
            "¿Que gimnasta dominicana gano oro en uegos Centroamericanos y del Caribe?",
            "¿Quién fue el primer dominicano en jugar en Grandes Ligas?",
            "¿Cuál fue el primer atleta dominicano en participar en unos Juegos Olímpicos?",
            "¿Cuantos equipos conforman la LIDOM?",
            "¿Cual jugador de baloncesto dominicano pertenece al equipo de Philadelphia en la NBA?",
            "¿Quién inventó el arte marcial llamado Jeet Kune Do?",
            "¿De qué deporte es el longboard una de las modalidades?",
            "¿En qué deporte se destaca Jonny Wilkinson?",
            "¿De qué color es el cero en el cilindro de la ruleta?",
            "¿A qué barrio porteño pertenece el club de fútbol San Lorenzo?",
            "¿Cuánto pesa aproximadamente una bola de bolera?",
            "¿Cuántos puntos vale un tiro libre encestado en baloncesto?",
            "¿Cuál es el estadio de fútbol con mayor capacidad en América?",
            "¿Qué tipo de competición es el Giro de Italia?",
            "¿Cuánto dura un partido de fútbol?",
            "¿Cuál es el derbi más esperado en Andalucía?",
            "¿Cómo se llama la zona de hierba rasa donde está ubicado el hoyo en golf?",
            "¿Cuál de estas frases NO fue dicha por Diego Armando Maradona?",
            "¿Cuál de estos pilotos no es de F1?",
            "¿A qué tipo de billar se juega con más bolas?",
            "¿De qué nacionalidad es el entrenador de fútbol Tata Martino?",
            "¿En cuál de estos deportes no hay árbitro?",
            "¿Cuál es el país de origen del futbolista Lionel Messi?",
            "¿Cómo se llama la cantera del FC Barcelona?",
            "¿Cuál de los siguientes es un truco de skate?",
            "Cuándo el árbitro de fútbol hace sonar su silbato a los 90 minutos ¿Qué significa?",
            "¿Quién ganó el mundial de fútbol del año 2002?",
            "¿A la selección de rugby de qué país se los conoce como Los Pumas?",
            "¿Cómo se llama el estadio del Universidad de Las Palmas?",
            "¿En cuál de estas situaciones se sacará una bandera amarilla, o incluso roja, en las carreras de coches?",
            "¿Qué país ganó el Mundial de balonmano en el año 2013?",
            "¿En cuántos mundiales de fútbol participó la selección de Canadá?",
            "¿Dónde se inventó el tenis de mesa?",
            "¿Qué jugador francés ha ganado un balón de oro mientras jugaba en Italia?",
            "¿Qué país es campeón del mundo de balonmano masculino del 2013?"

    };


    private String mChoices [][] = {
            {"LBPRD", "LIPRORD", "LIDOM"},
            {"22", "19", "24"},
            {"Amarillo", "Azul", "Rojo"},
            {"55", "63", "70"},
            {"Toro" ,"Caballo","León"},
            {"Francisco Garcia" ,"Tito Horford ","Chalie Villanueva"},
            {"Golden State Warriors" ,"Boston Celtics","Portland Trail Brazers"},
            {"91 años","87 años","75 años"},
            {"Brenda Castillo","Gina Mambru","Bethania de la Cruz"},
            {"Gina Mambru","Brenda Castillo","Yonkaira Peña"},
            {"Alexa Moreno","Yamilet Peña" ,"Laurie Hernandez"},
            {"Guayubin Olivo","Tetelo Vargas","Osvaldo Virgil"},
            {"Alberto Torres","Felix Dias","Felix Sanchez"},
            {"6" ,"7","5"},
            {"Karl Towns","Al Horford","Luis Montero"},
            {"David Carradine","•Bruce Lee","Kato Mimoko"},
            {"Skateboard","Snowboard","Alpinismo"},
            {"Rugby","Fútbol","Atletismo"},
            {"Blanco","Negro","Verde"},
            {"Boedo","La Boca","Liniers"},
            {"Cuatro kilos y medio","Siete kilos y cuarto","5 kilos y cuarto"},
            {"Uno","Dos","Tres"},
            {"Estadio Azteca (México)","Estadio Maracaná (Brasil)","Estadio Morumbi (Brasil)"},
            {"Una carrera ciclista","Un maratón","Una competición de vela"},
            {"45 minutos","90 minutos","80 minutos"},
            {"Granada vs Málaga","Real Madrid vs At. Madrid","Betis vs Sevilla"},
            {"Green","Esplanada","Campo"},
            {"Pelé, debutó con un pibe","La pelota no se mancha","La pelota no dobla"},
            {"Richard Petty","Mark Webber","Sebastian Vettel"},
            {"Billar italiano","Billar español","Snooker"},
            {"España","Argentina","Italia"},
            {"Ultimate","Football","Basketball"},
            {"Brasil","España","Argentina"},
            {"La Masía","La Fábrica","La Depuradora"},
            {"Mollie","Ollie","Clop"},
            {"Finalización del partido","Falta","Tarjeta"},
            {"España" ,"Brasil","Francia"},
            {"Argentina" ,"Australia","Gales"},
            {"Maspalomas", "Los pajaricos", "Monumental"},
            {"Queda una vuelta" ,"La carrera va a empezar","Un peligro en la pista"},
            {"Francia" ,"España","Serbia"},
            {"0", "1","3"},
            {"Inglaterra", "Japón","China"},
            {"Platini", "Ribery","Zidane"},
            {"España", "Alemania","Francia"}
    };



    private String mCorrectAnswers[] = {"LIDOM", "22", "Azul", "70","Caballo", "Tito Horford",
            "Portland Trail Brazers", "87 años", "Bethania de la Cruz ", "Brenda Castillo", "Yamilet Peña","Osvaldo Virgil", "Alberto Torres", "6",
            "Al Horford","Bruce Lee","Skateboard","Rugby","Verde","Boedo","Siete kilos y cuarto", "Uno",
            "Estadio Azteca (México)","Una carrera ciclista","90 minutos","Betis vs Sevilla","Green",  "La pelota no dobla",
            "Richard Petty","Snooker","Argentina","Ultimate","Argentina","La Masía","Ollie","Finalización del partido","Brasil",
            "Argentina","Maspalomas","Un peligro en la pista","España","1","Inglaterra", "Zidane",
            "España"};




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
