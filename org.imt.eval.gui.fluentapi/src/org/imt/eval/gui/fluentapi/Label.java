package org.imt.eval.gui.fluentapi;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Label implements FrameContent{
	
	private String content;

    public Label(String content) {
        this.content = content;
    }

	@Override
	public void execute(JFrame jframe) {
		JLabel l = new JLabel();
		jframe.add(l);
		l.setText(content);		
	}

}
