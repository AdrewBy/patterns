package com.chapter1_5.behavior.observer;

import java.util.List;

public interface Observer {

    public void handleEvent(List<String> vacancies);
}
