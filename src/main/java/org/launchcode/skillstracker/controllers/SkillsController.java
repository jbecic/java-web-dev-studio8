package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping
public class SkillsController {

    @GetMapping
    public String hello() {
        return "<html>" +
                "<h1>SkillsTracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</html>";
    }

    @GetMapping("form")
    public String helloForm() {
        String formAction = "<form action='language' method='post'>";
        String divOpen = "<div class = \"main\"><div class = \"wrapper\">";
        String divClose = "</div></div>";
        String submit = "<input type='submit' value='Submit'>";

//        String form1 = divOpen +
//                "<p>My favorite language:</p>" +
//                formAction +
//                "<select name='language1'>" +
//                "<option value='Java'>Java</option>" +
//                "<option value='JavaScript'>JavaScript</option>" +
//                "<option value='Python'>Python</option>" +
//                "</select>" +
//                "</form>" +
//                divClose;
//        String form2 = divOpen +
//                "<p>My second favorite language:</p>" +
//                formAction +
//                "<select name='language2'>" +
//                "<option value='Java'>Java</option>" +
//                "<option value='JavaScript'>JavaScript</option>" +
//                "<option value='Python'>Python</option>" +
//                "</select>" +
//                "</form>" +
//                divClose;
//        String form3 = divOpen +
//                "<p>My third favorite language:</p>" +
//                formAction +
//                "<select name='language3'>" +
//                "<option value='Java'>Java</option>" +
//                "<option value='JavaScript'>JavaScript</option>" +
//                "<option value='Python'>Python</option>" +
//                "</select>" +
//                "</form>" +
//                divClose;
        String form =divOpen +
                "<p>My favorite language:</p>" +
                formAction +
                "<select name='language1'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<p>My second favorite language:</p>" +
                "<select name='language2'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<p>My third favorite language:</p>" +
                "<select name='language3'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                submit +
                "</form>" +
                divClose;

        String body = "<body>" +
                "<p>Name:</p>" +
                formAction +
                "<input type='text' name='name'>" +
                form +
                "</body>";

        return body;
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "language")
    public static String createMessage(String name, String language1, String language2, String language3) {
        String head = "<h1>" + name + "</h1>";
        String list = "<ol>" +
                        "<li>" + language1 + "</li>" +
                        "<li>" + language2 + "</li>" +
                        "<li>" + language3 + "</li>" +
                        "</ol>";

        return head +
                list;
    }
}
