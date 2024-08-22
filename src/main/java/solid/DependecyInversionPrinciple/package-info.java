/**
 * This module is about the Dependecy Inversion Principle.
 * <p>
 * This module explores the Dependecy Inversion Principle, which is one of the SOLID principles.
 * The Dependency Inversion Principle states that high-level modules should not depend on low-level modules. Both should depend on abstractions/interfaces.
 * This module contains the following classes:
 * <ul>
 *   <li>The Keyboard interface, which contains methods for pressing and releasing a key.</li>
 *   <li>The WiredKeyBoard class, which implements the Keyboard interface and contains a method for connecting the keyboard via USB.</li>
 *   <li>The WireLessKeyBoard class, which implements the Keyboard interface and contains a method for connecting the keyboard via Bluetooth.</li>
 *   <li>The Mouse interface, which contains methods for clicking, double clicking, and scrolling.</li>
 *   <li>The WiredMouse class, which implements the Mouse interface and contains a method for connecting the mouse via USB.</li>
 *   <li>The WireLessMouse class, which implements the Mouse interface and contains a method for connecting the mouse via Bluetooth.</li>
 *   <li> The Macbook class, which contains methods for connecting a keyboard and a mouse to a Macbook.</li>
 * </p>
 *
 * @since 1.0
 * @author IshiMolu
 * @version 1.1
 */

package solid.DependecyInversionPrinciple;