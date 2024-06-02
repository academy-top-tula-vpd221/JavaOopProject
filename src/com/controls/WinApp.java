package com.controls;

public class WinApp
{
    public void Run(){
        Button btn = new Button("Click me");
        btn.handler = new ButtonClickHandler();
        btn.Click();
    }
}
