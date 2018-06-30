package com.example.jones.educationalapp;

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


    };

    private String mCorrectAnswers[]={"Nnamdi Azikwe", "1963", "Chinyere Onyemucheya","Strength","Calabar","6","Flora Shaw",
            "Theresa May","Pluto","NNDP"};

    public String getQuestions(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }
    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }
    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswers(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}


