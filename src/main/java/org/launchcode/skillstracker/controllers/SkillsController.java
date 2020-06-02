package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @RequestMapping(method=RequestMethod.GET,value = "")
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

    @RequestMapping(method = {RequestMethod.GET,RequestMethod.POST},value = "form")
    @ResponseBody
    public String favoriteLanguageForm(@RequestParam String name,@RequestParam String programmingLanguages){
        return "<html>" +
                "<body>" +
                "<form method='post' action='/form'>" +
                "<input type='text' name='name'/>" +
                "<input type='submit' value='submit'/>" +
                "<label for='language-select'>Choose your " +
                "favorite programming languages:</label" +
                "<ol>" +
                    "<li>" +
                            "<select name='My Favorite Programming language' id='language-select'>" +
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
                        "<select name='My Second Favorite Programming language' id='language-select'>" +
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
                    "<li>" +
                        "<select name='My Third Favorite Programming language' id='language-select'>" +
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
