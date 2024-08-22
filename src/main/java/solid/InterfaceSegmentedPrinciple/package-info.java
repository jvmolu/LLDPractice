/**
 * This module is about the Interface Segregation Principle.
 * <p>
 * This module explores the Interface Segregation Principle, which is one of the SOLID principles.
 * The Interface Segregation Principle states that a client should not be forced to implement methods of an interface that it does not use.
 * This module contains the following classes:
 * <ul>
 *     <li>The Vehicle interface, which contains methods for starting and stopping the engine, starting and stopping movement, and accelerating.</li>
 *     <li>The BikeInterface interface, which contains methods for kick starting and stopping kick starting, and turning on and off the headlight.</li>
 *     <li>The Bike class, which implements both the Vehicle and BikeInterface interfaces.</li>
 *     <li>The CarInterface interface, which contains methods for turning on and off the air conditioning, and opening and closing the trunk.</li>
 *     <li>The Car class, which implements both the Vehicle and CarInterface interfaces.</li>
 * </p>
 *
 * @since 1.0
 * @author IshiMolu
 * @version 1.1
 */
package solid.InterfaceSegmentedPrinciple;
