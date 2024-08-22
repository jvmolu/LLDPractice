/**
 * This module is about the Liskov Substitution Principle.
 * <p>
 * This module explores the Liskov Substitution Principle, which is one of the SOLID principles.
 * The Liskov Substitution Principle states that objects of a superclass should be replaceable with objects of its subclasses without affecting the functionality of the program.
 * This module contains the following classes:
 * <ul>
 *     <li>The Vehicle interface, which contains methods for starting and stopping the engine, starting and stopping movement, and accelerating.</li>
 *     <li>The Bike class, which implements the Vehicle interface.</li>
 *     <li>The Cycle class, which implements the Vehicle interface.</li>
 *     <li>The Car class, which implements the Vehicle interface.</li>*
 * </p>
 * The Liskov Substitution Principle is violated in the Cycle class, as it throws an exception for the startEngine() and stopEngine() methods, which are not applicable to a cycle.
 *
 * @since 1.0
 * @author IshiMolu
 * @version 1.1
 */

package solid.LiskovSubstitutionPrinciple;