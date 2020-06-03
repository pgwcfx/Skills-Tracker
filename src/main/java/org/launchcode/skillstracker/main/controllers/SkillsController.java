package org.launchcode.skillstracker.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @GetMapping(value = "")
    @ResponseBody
    public String programmingLanguages(){
        return "<html>" +
                "<h1>Skills Tracker</h1>" +
                "<body>" +
                "<h2>Possible Programming languages</h2>" +
                "<ol>" +
                    "<li>Linux</li>" +
                    "<li>c++</li>" +
                    "<li>JavaScript</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping(value = "form")
    @ResponseBody
    public String favoriteLanguageForm(){
        return "<html>" +
                "<body>" +
                "<form method='post' action='form'>" +
                "<h1>Name:</h1>" +
                "<input type='text' name='name'/>" +
                "<label for='language-select'></label>" +
                "</label>" +
                "<h1>My favorite language:</h1>" +
                "<select name='myFavoriteProgrammingLanguage' id='language-select'>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='C#'>C#</option>" +
                    "<option value='C'>C</option>" +
                    "<option value='C++'>C++</option>" +
                    "<option value='Python'>Python</option>" +
                    "<option value='Ruby'>Ruby</option>" +
                    "<option value='TypeScript'>TypeScript</option>" +
                    "<option value='Swift'>Swift</option>" +
                "</select>" +
                "<h1>My second favorite language:</h1>" +
                "<select name='mySecondFavoriteProgrammingLanguage' id='language-select'>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='JavaScript'>JavaScript</option> +" +
                    "<option value='C#'>C#</option> +" +
                    "<option value='C'>C</option>" +
                    "<option value='C++'>C++</option>" +
                    "<option value='Python'>Python</option>" +
                    "<option value='Ruby'>Ruby</option>" +
                    "<option value='TypeScript'>TypeScript</option>" +
                    "<option value='Swift'>Swift</option>" +
                "</select>" +
                "<h1>My third favorite language:</h1>" +
                "<select name='myThirdFavoriteProgrammingLanguage' id='language-select'>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='C#'>C#</option>" +
                    "<option value='C'>C</option>" +
                    "<option value='C++'>C++</option>" +
                    "<option value='Python'>Python</option>" +
                    "<option value='Ruby'>Ruby</option>" +
                    "<option value='TypeScript'>TypeScript</option>" +
                    "<option value='Swift'>Swift</option>" +
                "</select>" +
                "\n" +
                "<input type='submit' value='submit'/>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping(value = "form")
    @ResponseBody
    public String getFavoriteLanguageFromForm(@RequestParam String name,@RequestParam String
                                              myFavoriteProgrammingLanguage,@RequestParam String
                                              mySecondFavoriteProgrammingLanguage,@RequestParam String
                                              myThirdFavoriteProgrammingLanguage){
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                    "<li>" + myFavoriteProgrammingLanguage + "</li>" +
                    "<li>" + mySecondFavoriteProgrammingLanguage + "</li>" +
                    "<li>" + myThirdFavoriteProgrammingLanguage + "</li>" +
                "</ol>";
    }
}
