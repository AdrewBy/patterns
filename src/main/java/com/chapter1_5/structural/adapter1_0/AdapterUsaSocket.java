package com.chapter1_5.structural.adapter1_0;

public class AdapterUsaSocket extends ConnectUsaSocket implements Socket {
    @Override
    public void plugIn() {
        plugIntoSocket();
    }

    @Override
    public void plugOut() {
        plugOutSocket();
    }
}
