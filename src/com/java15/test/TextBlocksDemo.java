package com.java15.test;

public class TextBlocksDemo {

	public static void main(String[] args) {
		//Opening and Closing Delimiters: """
		//Line Terminator suppressed by \
		String paragraph = """
				Lorem ipsum dolor sit amet, consectetur adipiscing elit. 
						Integer nec odio. 
				Praesent libero. \
				Sed cursus ante dapibus diam. 
				Sed nisi. \
				Nulla quis sem at nibh elementum imperdiet. 
				Duis sagittis ipsum. 
				Praesent mauris. 
				Fusce nec tellus sed augue semper porta. 
				Mauris massa. 
				""";
		System.out.println(paragraph);
		

	}

}
