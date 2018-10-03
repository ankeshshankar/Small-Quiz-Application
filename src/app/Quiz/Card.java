package app.Quiz;

abstract class Card {
    private String subject;
    private String question;
    private String answers;

    Card() {
    }

    void setter(String subject, String question, String answers) {
        this.subject = subject;
        this.question = question;
        this.answers = answers;

    }

    String getSubject() { return this.subject; }
    String getQuestion(){
        return this.question;
    }
    String getAnswer(){
        return this.answers;
    }
}
