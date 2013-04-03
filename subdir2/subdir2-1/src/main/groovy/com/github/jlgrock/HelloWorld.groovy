package com.github.jlgrock

import org.slf4j.Logger
import org.slf4j.LoggerFactory

class HelloWorld {
	/**
	 * Default logger.
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorld)

	def salute() {
		def var = 'World'
		LOGGER.info "Hello, $var"
	}
}
