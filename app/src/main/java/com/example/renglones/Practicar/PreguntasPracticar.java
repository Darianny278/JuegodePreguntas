package com.example.renglones.Practicar;


public class PreguntasPracticar {

    private String mQuestions [] = {
            "¿Cómo se llama el horrible vecino de Toy Story? ",
            "¿Cómo se llamaban los ladrones de Solo en casa?",
            "¿Cuál de estas películas animadas fue la primera en obtener una nominación a los Oscar como Mejor Película?",
            "¿Qué se usó originalmente en la icónica escena de la ducha de 'Psicosis' para simular la sangre de Janet Leigh?",
            "¿Cuál de estas películas está en el top ten de las diez peores películas según IMDB?",
            "¿Qué son las enzimas?",
            "¿Con qué suele arreglarse un diente con caries",
            "¿Cuál es la ciencia que estudia la aplicación de la informática y las comunicaciones al hogar?",
            "¿El proceso por el que una célula se divide para formar dos células hijas se llama?",
            "¿La información genética en las células se localiza?",
            "El gran desierto de Gobi se ubica en...",
            "¿Cuál de estos países no tiene acceso al Mar Mediterráneo?",
            "¿Cuál de estos países es bañado únicamente por un océano?",
            "¿Cuál de estos países es el más grande en África?",
            "¿Cuál es la parte más seca de la Tierra?",
            "¿Cómo se llamaba el cañón alemán más famoso de la I Guerra Mundial ?",
            "¿En qué equipo de la NBA jugó Kobe Bryant desde 1996?",
            "¿Quién es el líder en hits de todos los tiempos de los New York Yankees?",
            "¿En que deporte se otorga el Balón de Oro?",
            "¿El mejor jugador de la actualidad?",
            "¿Cual fue el equipo ganador la NBA en la temporada 2013?",
            "¿Cual era la capital del Imperio Inca?",
            "¿Cuándo se produjo principalmente el Siglo de Oro?",
            "¿Quién fue el primer emperador romano?",
            "¿Qué Rey encargó 'Las Meninas'?",
            "¿Cómo se llamaba el cañón alemán más famoso de la I Guerra Mundial ?"

    };


    private String mChoices [][] = {
            {"Max", "Said", "Tommy"},
            {"Harry y Marv", "Barry y mark", "Harvey y marvin"},
            {"Aladdin", "Toy story", "La bella y la bestia"},
            {"Almidon de maiz", "Salsa de chocolate", "Sirope de fresa"},
            {"Batman y Robin" ,"Disaster movie","Glitter"},
            {"Células","Glúcidos", "Proteinas"},
            {"Extrayendolo","Empaste","Limpieza bucal"},
            {"Robotica","Domotica","Casatica"},
            {"Mitosis","Meiosis","Segregacion"},
            {"El la menbrana","En el citoplasma","Ninguna"},
            {"Africa", "Asia", "Sudamerica"},
            {"Eslovenia", "Egipto", "Serbia"},
            {"Mexico", "Gran Bretaña", "Rusia"},
            {"Argelia", "Tanzania", "Namibia"},
            {"La Antartida", "Asia", "America Del Norte"},
            {"Los Angeles Lakers","Chicago Bulls","Cleveland Cavaliers"},
            {"Alex Rodriguez","Robinson Cano","Derek Jeter"},
            {"Baseball ","Futbol","Tenis"},
            {"Lebron James", "Kevin Durant", "Kawhai Leonard"},
            {"Dallas Mavericks", "San Antonio Spurs", "Miami Heat"},
            {"Machu Picchu","Cuzco","Lima"},
            {"Siglo XVI","Siglo XVII","Siglo XIV"},
            {"Neron","Caligula","Cesar Augusto"},
            {"Carlos III","Felipe IV","Felipe II"},
            {"Luftwaffe","Enola Gay","Gran Berta"}

    };



    private String mCorrectAnswers[] = {"Said", "Harry y marv", "La bella y la bestia", "Salsa de chocolate",
            "Disaster movie","Proteinas","Empaste","Domotica","Mitosis","En el citoplasma",
            "Asia", "Serbia", "Gran Bretaña", "Argelia", "La Antartida",
            "Los Angeles Lakers", "Derek Jeter", "Futbol", "Lebron James", "Miami Heat",
            "Cuzco", "Siglo XVI", "Cesar Augusto", "Felipe IV", "Gran Berta"};



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
