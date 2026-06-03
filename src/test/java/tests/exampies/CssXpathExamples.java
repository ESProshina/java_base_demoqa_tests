package tests.exampies;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.attribute;

import static com.codeborne.selenide.Selectors.;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static jdk.internal.org.jline.utils.Colors.s;
import static org.openqa.selenium.bidi.script.LocalValue.setValue;

public class CssXpathExamples {

    void cssXpath(){
 //  <input type="email" class="inputtext login_form_input_box" name="email" id="email" data-tesid="email">
        $("[data-tesid=email]").setValue("1");
        $(by("data-tesid", "email" )).setValue("1");
        $x( "//*[@data-tesid='email']").setValue("1");

//  <input type="email" class="inputtext login_form_input_box" name="email" id="email"
        $("[id=email]").setValue("1");
        $(by("id", "email" )).setValue("1");
        $(byId("email")).setValue("1");
        $("#email").setValue("1");
        $x("//*[@id='email']").setValue("1");

//  <input type="email" class="inputtext login_form_input_box" name="email" id="email">
        $("[name=email]").setValue("1");
        $(by("name", "email" )).setValue("1");
        $(byName("email")).setValue("1");
        $("[input[name=email]").setValue("1");
        $x( "//*[@name='email']").setValue("1");

//  <input type="email" class="inputtext login_form_input_box">
        $("[class=inputtext]class=ogin_form_input_box]").setValue("1");
        $(".login_form_input_box").setValue("1");
        $(byClassName(".login_form_input_box")).setValue("1");
        $(".inputtext.login_form_input_box").setValue("1");
        $("input.inputtext.login_form_input_box").setValue("1");
        $x("//input[@class='inputtext'][class='login_form_input_box']").setValue("1");


//  <div class="inputtext">
//  <input type="email" class="inputtext login_form_input_box">
//  </div>
        $(".login_form_input_box").setValue("1");
        $(".inputtext .login_form_input_box").setValue("1");
        $(".inputtext"). $(s:"login_form_input_box").
        $("div.inputtext input.login_form_input_box").setValue("1");

        //<div>Hello, qa guru!<div>
        $x("//*[text()=Hello, qa guru!']").setValue("1"); // bad practice
        $x("//*[contains(text(), Hello, qa guru!']");
        $(byText("Hello, qa guru!" ));
        $(withText("lo, qa"));





    }

