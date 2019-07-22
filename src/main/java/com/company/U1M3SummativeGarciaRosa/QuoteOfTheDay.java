package com.company.U1M3SummativeGarciaRosa;

public class QuoteOfTheDay {
    private String author;
    private String quote;

    public QuoteOfTheDay(){}

    public QuoteOfTheDay(String author, String quote) {
        this.author = author;
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
