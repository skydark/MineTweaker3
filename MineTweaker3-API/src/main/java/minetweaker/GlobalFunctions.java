/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minetweaker;

/**
 *
 * @author Stan
 */
public class GlobalFunctions {
	private GlobalFunctions() {}
	
	public static void print(String message) {
		MineTweakerAPI.logger.logInfo(message);
	}
}