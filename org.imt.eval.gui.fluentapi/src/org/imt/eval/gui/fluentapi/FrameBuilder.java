package org.imt.eval.gui.fluentapi;

import java.util.ArrayList;
import java.util.List;

public class FrameBuilder {
    private String name;
    private String title;
    private Integer width;
    private Integer height;
    private List<FrameContent>  frameContents;
    
    public FrameBuilder(){
    	this.frameContents = new ArrayList<FrameContent>();
    }

    public Frame getContent() {
        return new Frame(name, title, width, height, frameContents);
    }
    
    public FrameBuilder name(String name) {
        this.name = name;
        return this;
    }

    public FrameBuilder title(String title) {
        this.title = title;
        return this;
    }

    public FrameBuilder width(Integer width) {
        this.width = width;
        return this;
    }

    public FrameBuilder height(Integer height) {
        this.height = height;
        return this;
    }

    public FrameBuilder button(String content) {
        this.frameContents.add(new Button(content));
        return this;
    }

    public FrameBuilder label(String content) {
        this.frameContents.add(new Label(content));
        return this;
    }
}