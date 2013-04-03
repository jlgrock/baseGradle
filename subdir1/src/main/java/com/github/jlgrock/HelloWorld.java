package com.github.jlgrock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*************************************************************************
 * Prints "Hello, World". By tradition, this is everyone's first program.
 * 
 * Compilation: javac HelloWorld.java Execution: java HelloWorld
 * 
 * % java HelloWorld Hello, World
 * 
 * These 17 lines of text are comments. They are not part of the program; they
 * serve to remind us about its properties. The first two lines tell us what to
 * type to compile and test the program. The next line describes the purpose of
 * the program. The next few lines give a sample execution of the program and
 * the resulting output. We will always include such lines in our programs and
 * encourage you to do the same.
 * 
 *************************************************************************/
public final class HelloWorld {
	/**
	 * Default logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorld.class);

	/**
	 * Default constructor.
	 */
	private HelloWorld() {
	}

	/**
	 * Execute this via command line.
	 * 
	 * @param args
	 *            takes args, but they are ignored
	 */
	public static void main(final String[] args) {
		LOGGER.info("Hello, World");
	}

}
