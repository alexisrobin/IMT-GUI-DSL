package org.imt.eval.gui.fluentapi;

import java.awt.FlowLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Frame {
	
    @SuppressWarnings("unused")
	private final String name;
    
	private final String title;
	private final Integer width;
	private final Integer height;
	private final List<FrameContent> frameContents;

    public Frame(String name, String title, Integer width, Integer height, List<FrameContent> frameContents) {
        this.name = name;
        this.title = title;
        this.width = width;
        this.height = height;
        this.frameContents = frameContents;
    }
    
    public void execute() {
    	SwingUtilities.invokeLater(new Runnable() {
    		 public void run() {
	    		 JFrame f = new JFrame();
	    		 f.setLayout(new FlowLayout());
	    		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    		 f.setTitle(title);
	    		 f.setSize(width, height);
	    		 for(FrameContent fContent: frameContents) {
	    			 fContent.execute(f);
	    		 }
	    		 f.setVisible(true);
    		 }
    	});
    }
    
}
