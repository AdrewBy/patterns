package com.chapter1_5.behavior.visitor1_0;



public class Show implements ShowElement{
    ShowElement[] showElements;

    public Show(){
        this.showElements=new ShowElement[]{
                new ShowClass(),
                new Sculpture(),
                new Picture()
        };
    }

    @Override
    public void beCreated(Artist artist) {
        for (ShowElement element : showElements){
            element.beCreated(artist);
        }
    }
}
