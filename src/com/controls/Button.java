package com.controls;


public class Button {
    public String content = "";
    public IEventHandler handler = null;
    public Button(){}
    public Button(String content)
    {
        this.content = content;
    }

    public void Click()
    {
        if(handler != null)
            handler.execute();
    }
}

interface IEventHandler
{
    void execute();
}

class ButtonClickHandler implements IEventHandler
{

    @Override
    public void execute() {
        System.out.println("Button click");
    }
}
