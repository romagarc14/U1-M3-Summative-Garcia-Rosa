package com.company.U1M3SummativeGarciaRosa;

import com.sun.org.apache.xpath.internal.operations.Quo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@RestController
public class OfTheDayController {
    private List<QuoteOfTheDay> quoteList = new ArrayList<>();
    private List<WordOfTheDay> wordList = new ArrayList<>();
    private List<Magic8Ball> magicList = new ArrayList<>();

    Random random = new Random();

    public OfTheDayController() {
        quoteList.add(new QuoteOfTheDay("C.S. Lewis", "You are never too old to set another goal or to dream a new dream."));
        quoteList.add(new QuoteOfTheDay("Winston Churchill", "The pessimist sees difficulty in every opportunity. The optimist sees the opportunity in every difficulty."));
        quoteList.add(new QuoteOfTheDay("Maya Angelou", "We may encounter many defeats but we must not be defeated."));
        quoteList.add(new QuoteOfTheDay("Franklin D. Roosevelt", "The only limit to our realization of tomorrow will be our doubts of today."));
        quoteList.add(new QuoteOfTheDay("Confucius", "To see what is right and not do it is a lack of courage."));
        quoteList.add(new QuoteOfTheDay("Helen Keller", "The best and most beautiful things in the world cannot be seen or even touched—they must be felt with the heart."));
        quoteList.add(new QuoteOfTheDay("William Shakespeare", "We know what we are, but know not what we may be."));
        quoteList.add(new QuoteOfTheDay("Ralph Waldo Emerson", "What lies behind you and what lies in front of you, pales in comparison to what lies inside of you."));
        quoteList.add(new QuoteOfTheDay("Mahatma Gandhi", "Be the change that you wish to see in the world."));
        quoteList.add(new QuoteOfTheDay("Walt Whitman", "Keep your face always toward the sunshine, and shadows will fall behind you"));
        wordList.add(new WordOfTheDay("lionize(v.)", "to treat as an object of great interest or importance"));
        wordList.add(new WordOfTheDay("circumspect(adj.)", "careful to consider all circumstances and possible consequences"));
        wordList.add(new WordOfTheDay("asperity(n.)", "roughness of manner or of temper"));
        wordList.add(new WordOfTheDay("prodigious(adj.)", "extraordinary in bulk, quantity, or degree"));
        wordList.add(new WordOfTheDay("connive(v.)", "to cooperate secretly or have a secret understanding"));
        wordList.add(new WordOfTheDay("inexorable(adj.)", "not to be persuaded, moved, or stopped"));
        wordList.add(new WordOfTheDay("obviate(v.)", "to anticipate and prevent something, such as a situation"));
        wordList.add(new WordOfTheDay("nonpareil(adj.)", "having no equal"));
        wordList.add(new WordOfTheDay("recidivism(n.)", "a tendency to relapse into a previous condition or mode of behavior"));
        wordList.add(new WordOfTheDay("churlish(adj.)", "marked by a lack of civility or graciousness"));
        magicList.add(new Magic8Ball("Signs point to yes."));
        magicList.add(new Magic8Ball("As I see it, yes."));
        magicList.add(new Magic8Ball("Ask again later."));
        magicList.add(new Magic8Ball("Don't count on it."));
        magicList.add(new Magic8Ball("Outlook not so good."));
        magicList.add(new Magic8Ball("Very doubtful."));
    }

    @RequestMapping(value = "/quote/{quote}", method = RequestMethod.GET)
    public QuoteOfTheDay getRandomQuote(@PathVariable String quote){
       return quoteList.get(random.nextInt(quoteList.size()));
}
    @RequestMapping(value = "/word/{word}", method = RequestMethod.GET)
    public WordOfTheDay getRandomWord(@PathVariable String word) {
        return wordList.get(random.nextInt(wordList.size()));
    }

    @RequestMapping(value = "/magic/{question}", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Magic8Ball addQuestion(@RequestBody @Valid Magic8Ball question){
        this.magicList.add(question);
        return magicList.get(random.nextInt(magicList.size()));
    }
}

