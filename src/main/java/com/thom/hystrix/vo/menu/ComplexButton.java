package com.thom.hystrix.vo.menu;

/**
 * Created by ThinkPad on 2016/11/6.
 */
public class ComplexButton extends Button {
    private Button[] sub_button;

    public Button[] getSub_button() {
        return sub_button;
    }

    public void setSub_button(Button[] sub_button) {
        this.sub_button = sub_button;
    }
}