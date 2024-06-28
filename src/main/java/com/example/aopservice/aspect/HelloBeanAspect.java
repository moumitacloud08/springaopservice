package com.example.aopservice.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class HelloBeanAspect {

	/**
	 * execution – matches method execution General Form:execution([visibility
	 * modifiers] [return type] [package].[class].[method]([arguments]) [throws
	 * exceptions]
	 */

	@Before("execution(public !int com..HelloBean.say*(String, *))")
	public void executionExample() {
		System.out.println("Before - execution example");
	}

	@After("execution(void com..HelloChildBean.validateName(..) throws java.io.IOException)")
	public void executionWithExceptionExample() {
		System.out.println("After - execution with exception example");
	}

	// ------------------END execution----------------------//

	/**
	 * within – matches execution within specified class/classes, optionally you can
	 * specify class package General Form:within([package].[class])  
	 *  [package] – package where class is located, may be used with .. wildcard (includes all
	 * sub-packages) or with * wildcard, may be omitted [class] – class against
	 * which match should happen, may be used with * wildcard
	 */

	@Before("within(com..HelloChildBean)")
	public void withinExample1() {
		System.out.println("Before - withinExample1");
	}

	@Before("within(com..*)")
	public void withinExample2() {
		System.out.println("Before - withinExample2");
	}

	@Before("within(com..Hello*Bean)")
	public void withinExample3() {
		System.out.println("Before - withinExample3");
	}
	// ------------------END within----------------------//

	/**
	 * args – matches execution of method with matching arguments
	 * GeneralForm:args([parameter_type1, parameter_type2, ..., parameter_typeN])
	 * [parameter_typeN] – simple or object type, may be * to indicate one parameter
	 * of any type, may be .. to indicate zero or more arguments, you can specify
	 * type with the package
	 */
	@Before("args(..)")
	public void argsExample1() {
		System.out.println("Before - argsExample1");
	}

	@Before("args(String, int)")
	public void argsExample2() {
		System.out.println("Before - argsExample2");
	}

	@Before("args(String, *)")
	public void argsExample3() {
		System.out.println("Before - argsExample3");
	}

	@Before("args(java.lang.String)")
	public void argsExample4() {
		System.out.println("Before - argsExample4");
	}

	// ------------------END args----------------------//
	/**
	 * bean – matches execution of method with matching Spring Bean Name General
	 * Form:bean([beanName]) [beanName] – name of the Spring Bean (automatically
	 * generated by framework, or set manually)
	 */
	@Before("bean(hello_child_bean)")
	public void beanExample1() {
		System.out.println("before - beanExample1");
	}

	@Before("bean(hello_*_bean)")
	public void beanExample2() {
		System.out.println("before - beanExample2");
	}
	// ------------------END bean----------------------//

	/**
	 * @annotation – matches method execution annotated with specified annotation
	 *             General Form:@annotation([annotation_type]) [annotation_type] –
	 *             type of annotation used to annotated method which should match
	 *             pointcut expression
	 */
	@Before("@annotation(com.example.aopservice.annotation.CustomTransaction)")
	public void annotationExample() {
		System.out.println("Before - annotationExample");
	}
	// ------------------END @annotation----------------------//

	/**
	 * @args – matches method execution with argument, which types (classes) are
	 *       annotated with specified annotation type, note that class should be
	 *       annotated, not the argument of method itself General
	 *       Form: @args([annotation_type]) [annotation_type] – type of annotation
	 *       used on top of class, which represents type of argument
	 */
	@Before("@args(com.example.aopservice.annotation.CustomValidation)")
	public void argsAnnotationExample() {
		System.out.println("Before - @argsExample");
	}
	// ------------------END @args----------------------//
}
