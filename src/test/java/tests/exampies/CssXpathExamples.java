package tests.exampies;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.attribute;

import static com.codeborne.selenide.Selectors.;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static org.openqa.selenium.bidi.script.LocalValue.setValue;

public class CssXpathExamples {

    void cssXpath(){
 //  <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-tesid="email">
        $("[data-tesid=email]").setValue("1");
        $(by("data-tesid", "email" )).setValue("1");

        $x( "//*[@data-tesid='email']").setValue("1");

        $("[id=email]").setValue("1");
        $(by("id", "email" )).setValue("1");
        $(byId("email")).setValue("1");
        $("#email").setValue("1");

        $x( "//*[@id='email']").setValue("1");
        $("[name=email]").setValue("1");
        $(by("name", "email" )).setValue("1");
        $(byName("email")).setValue("1");





    }

