/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.openzen.zencode.runtime;

/**
 *
 * @author Stan
 */
public class ImmutableException extends RuntimeException {
	public ImmutableException(String type) {
		super(type + " is immutable");
	}
}