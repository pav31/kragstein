/**
 * <copyright>
 * 
 * Copyright (c) 2011, 2011 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    SAP AG - initial API, implementation and documentation
 * 
 * </copyright>
 */
package org.drakon.diagram;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;

import org.eclipse.graphiti.tb.IToolBehaviorProvider;

public class DrakonDiagramTypeProvider extends AbstractDiagramTypeProvider {

	private IToolBehaviorProvider[] toolBehaviorProviders;

	public DrakonDiagramTypeProvider() {
		super();
		setFeatureProvider(new DrakonFeatureProvider(this));
	}

	@Override
	public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
		if (toolBehaviorProviders == null) {
			toolBehaviorProviders = new IToolBehaviorProvider[] { new DrakonToolBehaviorProvider(this) };
		}
		return toolBehaviorProviders;
	}
}
