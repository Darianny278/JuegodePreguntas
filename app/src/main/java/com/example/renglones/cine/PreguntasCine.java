package com.example.renglones.cine;


public class PreguntasCine {

    private String mQuestions [] = {
            "¿Quién dirigió la película Origen en el 2010? ",
            "¿Cuántas películas conforman la saga cinematográfica Harry Potter?",
            "¿Qué padre e hijo protagonizaron la película En Busca de la Felicidad?",
            "¿Qué actor da vida a Batman de Christopher Nolan?",
            "¿Por qué película ganó Leonardo DiCaprio su primer Óscar?",
            "¿En qué película podemos encontrar a un payaso asesino llamado Pennywise?",
            "¿Qué actor interpretó a El Joker?",
            "¿Qué actor interpretó a Jack Dawson en la película Titanic?",
            "¿En qué película podemos encontrar al león Mufasa y a su hijo Simba?",
            "¿En qué película un pez payaso pierde a su hijo y emprende una aventura para buscarlo?",
            "¿En qué película animada un ogro se hace amigo de un burro?",
            "¿Quién protagoniza la serie de películas Misión Imposible?",
            "¿Quién dirigió la saga de películas Transformers?",
            "¿De qué país es la actriz Emma Thompson?",
            "¿Quién es esta actriz de cine, considerada ícono pop?",
            "¿Cómo se llamaba el personaje que interpretaba John Travolta en Grease",
            "¿En qué año se estrenó la película de Disney 'Pinocho'?",
            "¿Qué director de cine norteamericano aterrorizó a los Estados Unidos con su adaptación radiofónica de La guerra de los mundos?",
            "¿Quién es Bella en la saga Crepúsculo?",
            "¿Quién dirigió la película Los lunes al sol?",
            "¿Cómo se llamaba el personaje que interpretaba Al Pacino en Scarface?",
            "¿Por cuál de estas películas ganó Clint Eastwood el premio Oscar al mejor director?",
            "¿A qué película de Disney pertenece la canción Un mundo ideal?",
            "¿Qué actor rechazó el papel de Michael Corleone en la película El Padrino finalmente interpretado por Al Pacino?",
            "¿Qué actor interpretaba a Hache en la película 3MSC?",
            "¿Cómo se llama el protagonista de la saga Indiana Jones?",
            " ¿Qué actriz sale en La mano que mece la cuna?",
            "¿Cómo se llama el actor protagonista de Solo en casa?",
            "¿Cómo se llama la actriz que protagoniza ¡Carly?",
            "¿Cómo se llama el pájaro símbolo de los Juegos del Hambre?",
            "¿Qué personaje de Disney perdió su zapato de cristal ?",
            "¿Qué actor ha hecho más películas como James Bond?",
            "¿Cuál de las siguientes películas NO fue dirigida por los hermanos Coen?",
            "¿De qué famosa película de Disney es el personaje Jafar ?",
            "¿Quién es el profesor del colegio Hogwarts que se convierte en Hombre lobo?",
            "¿Quién protagonizo la pelicula Descubriendo nunca jamás?",
            "¿Cómo se llama la princesa de Disney conocida como La Sirenita?",
            "¿Qué actor protagonizó la película Grease?",
            "¿A qué familia pertenece Dobby,el elfo doméstico en la historia de Harry Potter?",
            "¿Qué personaje histórico interpreta Daniel Day-Lewis en una película de Steven Spielberg?",
            "¿Cómo se llama el actor que interpreta a Michael en la película El padrino?",
            " ¿Por qué película obtuvo Sofía Loren un Oscar?",
            "¿Quién de los siguientes actores salía en la película 'El otro lado de la cama'?",
            "¿Cómo se llama el personaje malvado de Aladdin?",
            "¿Quién resulta ser el príncipe mestizo en la sexta película de Harry Potter?"

    };




    private String mChoices [][] = {
            {"Christopher Nolan", "Guillermo del Toro", "Steven Spielberg"},
            {"5", "12", "8"},
            {"Eric Roberts y su hija Emma Roberts", "Will Smith y su hijo Jaden Smith", "James Brolin y su hijo Josh Brolin"},
            {"Chris Bale", "Chris Evans", "Chris Hemsworth"},
            {"Titanic" ,"Atrapame si puedes","El renacido"},
            {"It" ,"Happiness","Glown"},
            {"Heath Ledger " ,"Tom Cruise","Leonardo DiCaprio"},
            {"Will Smith","Leonardo DiCaprio","Tom Hanks"},
            {"Timon y Pumba","Mundo Jurasico","El rey Leon"},
            {"Buscando a Nemo","Buscando a Doris","El hijo"},
            {"Malefica","El gato con botas" ,"Shrek"},
            {"Scarlett Johansson","Tom Cruise","Johnny Depp"},
            {"Michael Bay","Harrison Ford","Ryan Reynolds"},
            {"Reinos Unidos" ,"Francia","Canadá"},
            {"Nicole Kidman","Marilyn Monroe","Anne Hathaway"},
            {"Danny Puño","Danny Zuko","Danny Grease"},
            {"1940","1950","1952"},
            {"Alfred Hitchcockl","Orson Welles","Stanley Kubrik"},
            {"Kristen Stewart","Cristina Ricci","Emma Watson"},
            {"Fernando León de Aranoa","Pedro Almodóvar","Alejandro Amenábar"},
            {"Sonny Montana","Tony Montana","Michael Corleonea"},
            {"Million Dollar Baby","Cartas desde Iwo Jima","Los puentes de Madison"},
            {"Aladdín","Pocahontas","Mulán"},
            {"Jack Nicholson","Anthony Hopkins","Robert DeNiro"},
            {"Hugo Silva","Dani Martín","Mario Casas"},
            {"Michael Fox","Harrison Ford","Robin Williams"},
            {"Rebecca de Mornay","Vanessa Paradis","Milla Jovovich"},
            {"Macaulay Culkin","Keanu Reeves","Johnny Depp"},
            {"Victoria Justice","Miranda Cosgrove","Jennette McCurdy"},
            {"1969","1958","1961"},
            {"Lechuza","Sinsajo","Llamas "},
            {"Blancanieves","La Sirenita","Cenicienta"},
            {"Pierce Brosnan","Sean Connery","Roger Moore"},
            {"Fargo ","Barton Fink","Four Rooms"},
            {"Vestida de gala ","Princesas ","Desayuno con Diamantes "},
            {"Remus Lupin","James Potter","Subill Trelawney"},
            {"Brad Pitt" ,"Johnny Deep","Leonardo Dicaprio"},
            {"Ariel" ,"Aurora","Estrella"},
            {"Barry Gibb", "Tom Cruise", "Jonh Travolta"},
            {"Malfoy" ,"Black","Weasley"},
            {"George Washington","Abraham Lincoln","John F.Kennedy"},
            {"James Caan", "Al Pacino","Robert Duvall"},
            {"Cleopatra", "Dos mujeres","Hermanitas"},
            {"Scar", "Lex","Jafar"},
            {"Lord Voldemort", "Albus Dumbuldore","Severus Snape"}
    };




    private String mCorrectAnswers[] ={"Christopher Nolan", "8", "Will Smith y su hijo Jaden Smith", "Chris Bale","El renacido",
            "It", "Heath Ledger", "Leonardo DiCaprio", "El rey Leon", "Buscando a Nemo", "Shrek",
            "Tom Cruise", "Michael Bay", "Reinos Unido", "Danny Zuko",
            "1940", "Orson Welles", "Kristen Stewart", "Fernando León de Aranoa", "Tony Montana",
            "Los puentes de Madison", "Aladdín", "Mario Casas", "Harrison Ford", "Rebecca de Mornay", "Macaulay Culkin",
            "Miranda Cosgrove", " 1940", "Cenicienta", "Roger Moore ", "Desayuno con Diamantes ", "Aladdin", "Remus Lupin", "Johnny Deep",
            "Ariel ", "Jonh Travolta", "Malfoy", "Al Pacino", "Dos mujeres",
            "Natalia Verbeke", "Jafar", "Severus Snape", "Jafar", "Severus Snape"};




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
