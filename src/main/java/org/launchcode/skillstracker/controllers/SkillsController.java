package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
public class SkillsController {
    @GetMapping("")
    @ResponseBody
    public String skillSet(){
        String html = "<html>" +
                "<body>" +
                "<h1> SKILLS TRACKER</h1> "+
                "<h2> We have few skills we would like to learn. Here is the List!</h2>" +
                "<ol> <li> Java</li> <li> Javacript</li> <li> Python</li></ol>"+
                "</body>"+"</html>";
        return html;

    }

    //display form in ordered list
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST},value = "form")
//    @PostMapping("/form")
//    @ResponseBody
//    public String displayForm(@RequestParam String name, String skill1,String skill2,
//                                          String skill3 ){
//        String html= "<html>" +
//                "<h1>" +name + "</h1>"+
//                "<ol><b>"+
//                "<li>" + skill1 +"</li>"+"<li>" + skill2 +"</li>"+"<li>" + skill3 +"</li></b></ol>"+
//            "</form>"    +"</body>"+
//                "<html>";
//        return html;
//    }

    @GetMapping("/form")
    @ResponseBody
    public String skillForm(){
        String html = "<html>" +
                "<body>" +
               "<form method = 'post' action='/form'>" +
                "<label><b>Name:</b></label> <br>" +
                "<input type = 'text' name= 'name' />"  +
                 "<label><h2> My Favourite language:</label></h2>" +
                "<select name ='skill1'>" +
                "<option value =''>Select Skill</option>" +
                "<option value ='Java'> Java</option>" +
                "<option value='JavaScript'> JavaScript</option>" +
                "<option value='Python'> Python</option>" +
                "</select>" + " " + "<br/>" +
                "<label><h2> My Second Favourite language:</label></h2>" +
                "<select name ='skill2'>" +
                "<option value =''>Select Skill</option>" +
                "<option value ='Java'> Java</option>" +
                "<option value='JavaScript'> JavaScript</option>" +
                "<option value='Python'> Python</option>" +
                "</select>" + " " + "<br/>" +
                "<label><h2> My Third Favourite language:</label></h2>" +
                "<select name ='skill3'>" +
                "<option value =''>Select Skill</option>" +
                "<option value ='Java'> Java</option>" +
                "<option value='JavaScript'> JavaScript</option>" +
                "<option value='Python'> Python</option>" +
                "</select>" + " " + "<br/>" +
                "<input type = 'submit' value = 'Favourite'/>" +
                "</form>" +
                "</body>" +
                "<html>";
        return html;

    }
    // display form in table structure
    @PostMapping("form")
    @ResponseBody
    public String form(@RequestParam String skill1,String skill2,String skill3, String name ){
        String html ="<html><style>table, th, td {" +
                "  border: 1px solid black;" +
                "  border-collapse: collapse;" +
                "background-color: #f1f1c1;" +
                "}" +
                "th{" +
                "color:blue;}</style> <body>"+
                "<table><caption><b>Skill Tracker List </b></caption>" +
                "<tr><th>Name</th> <th>First Language</th><th>Second Language</th><th>Third Language</th></tr>"+
                "<tr> "+
                "<td>"+name+"</td>" +
                "<td>"+skill1+"</td><td>"+skill2+"</td><td>"+skill3+"</td></tr></table></body></html>";
        return html;

    }
}
