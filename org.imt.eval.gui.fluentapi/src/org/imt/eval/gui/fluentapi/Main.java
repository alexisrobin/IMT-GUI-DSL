package org.imt.eval.gui.fluentapi;

public class Main {
	public static void main(String[] args) {
		new FrameBuilder()
			.name("A")
			.title("Frame A")
			.width(200)
			.height(100)
			.label("Hello")
			.button("World!")
			.getContent()
				.execute();
	}
}
