/*
 * generated by Xtext
 */
package org.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.ui.internal.MiniGobstonesActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MiniGobstonesExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return MiniGobstonesActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return MiniGobstonesActivator.getInstance().getInjector(MiniGobstonesActivator.ORG_MINIGOBSTONES);
	}
	
}
