# Educational-App
An Android Application developed for an educational quiz consisting of current Affairs 
An android project to use for different types of multiple-answer quiz applications.
The questions come randomly and can be repeated
the user really has to focus when giving an answer and try to memorize the correct answers and as you click the correct answers it displays your score above the quiz App
If the wrong answer is given,the app tells you either to exit the quiz or start a new quiz
so the user have the possibility to answer correctly the next time (and learn!)
i Created my own Questions.The most important thing in a quiz is a question, which is made of a question text, a list of answers (at least one shoul be correct) and a list of options to choose from.here is an example:
public class Questions {
    public String mQuestions[] ={
            "Who was the first president in Nigeria?",
            "When did Nigeria become a republic?",
            "Who was the first woman to be a pilot in Nigeria?",
            "What does the eagle in the Nigeria coat of arm represent?",
            "What was the first capital city in Nigeria?",
            "Nigeria is divided into how many geopolitical zones?",
            "Who gave Nigeria her name?",
            "Who is the Prime Minister of United Kingdom?",
            "Which is the Ninth planet in the solar system?",
            "What was the first political party in Nigeria?",


    };
    and the multiple answers to pick from
    private String mChoices[][]={
            {"Nnamdi Azikwe", "Akinkunmi Taiwo", "Funmi Kuti","Kemi Adeosun"},
            {"1958", "1990", "1963","1960"},
            {"Stella Obasanjo", "Chinyere Onyemucheya", "Dora Akunyili","Stella Ameyo"},
            {"Unity", "Peace","Progress","Strength"},
            {"Lagos","Calabar","Abuja", "PortHarcourt"},
            {"1","5", "6","8"},
            {"Akinkunmi Taiwo","Wole Soyinka","Flora Shaw", "Nnamdi Azikwe"},
            {"Jeremy Corbyn", "Theresa May", "David Cameron","Angela Merkel"},
            {"Earth", "Mars", "Pluto","Uranus"},
            {"APC", "PDP", "NNDP", "AD"}
    i also used buttons for the options, textview for the scores and i used a relative layout
    The quiz is basically a simple quiz created for students who want to know more about the world, nigeria and people.
