package org.imt.eval.gui.fluentapi;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button implements FrameContent {
	
	private String content;

    public Button(String content) {
        this.content = content;
    }

	@Override
	public void execute(JFrame jframe) {
		JButton b = new JButton();
		jframe.add(b);
		b.setText(content);		
	}

}
