package com.company.U1M3SummativeGarciaRosa;

import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

public class Magic8Ball {
    @NotEmpty
    private String question;
    private String answer;

    public Magic8Ball(){}

    public Magic8Ball(String answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;

    }

}
