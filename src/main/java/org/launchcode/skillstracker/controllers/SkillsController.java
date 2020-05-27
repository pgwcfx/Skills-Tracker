package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping(value = "favorite")
public class SkillsController {

    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST},value = "")
    public String programmingLanguages(@RequestParam String name, @RequestParam String programmingLanguages){
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

    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST},value = "form")
    public String favoriteLanguageForm(){
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" +
                "<input type='text' name='name" +
                "<input type='submit' value='submit'>" +
                "<label for='language-select'>Choose your " +
                "favorite programming languages:" +
                "</label>" +
                "<ol>" +
                    "<li>" +
                        "<select name='Favorite Programming language' id='language-select'>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='JavaScript'>JavaScript</option>" +
                            "<option value='C#'>C#</option>" +
                            "<option value='C'>C</option>" +
                            "<option value='C++>C++</option>" +
                            "<option value='Python'>Python</option>" +
                            "<option value='Ruby'>Ruby</option>" +
                            "<option value='TypeScript'>TypeScript</option>" +
                            "<option value='Swift'>Swift</option>" +
                        "</select>" +
                    "</li>" +
                    "<li>" +
                        "<select name='Second Favorite Programming language' id='language-select'>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='JavaScript'>JavaScript</option> +" +
                            "<option value='C#'>C#</option> +" +
                            "<option value='C'>C</option>" +
                            "<option value='C++>C++</option>" +
                            "<option value='Python'>Python</option>" +
                            "<option value='Ruby'>Ruby</option>" +
                            "<option value='TypeScript'>TypeScript</option>" +
                            "<option value='Swift'>Swift</option>" +
                        "</select>" +
                    "</li>" +
                    "<li>" +
                        "<select name='Third Favorite Programming language' id='language-select'>" +
                            "<option value='Java'>Java</option>" +
                            "<option value='JavaScript'>JavaScript</option>" +
                            "<option value='C#'>C#</option>" +
                            "<option value='C'>C</option>" +
                            "<option value='C++>C++</option>" +
                            "<option value='Python'>Python</option>" +
                            "<option value='Ruby'>Ruby</option>" +
                            "<option value='TypeScript'>TypeScript</option>" +
                            "<option value='Swift'>Swift</option>" +
                        "</select>" +
                    "</li>" +
                "</ol>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
