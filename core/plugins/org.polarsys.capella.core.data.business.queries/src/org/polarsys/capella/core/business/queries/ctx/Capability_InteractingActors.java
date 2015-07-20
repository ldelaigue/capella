/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.business.queries.ctx;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.polarsys.capella.common.queries.interpretor.QueryInterpretor;
import org.polarsys.capella.common.queries.queryContext.QueryContext;
import org.polarsys.capella.core.business.queries.IBusinessQuery;
import org.polarsys.capella.core.business.queries.QueryConstants;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.ctx.CtxPackage;

/**
 */
public class Capability_InteractingActors implements IBusinessQuery {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EClass getEClass() {
		return CtxPackage.Literals.CAPABILITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<EReference> getEStructuralFeatures() {
		List<EReference> returnedList = new ArrayList<EReference>();
		returnedList.add(CtxPackage.Literals.CAPABILITY__PARTICIPATING_ACTORS);
		returnedList.add(CtxPackage.Literals.CAPABILITY__OWNED_ACTOR_CAPABILITY_INVOLVEMENTS);
		return returnedList;
	}

	@Override
	public List<CapellaElement> getAvailableElements(CapellaElement element) {
		QueryContext context = new QueryContext();
		context.putValue(QueryConstants.ECLASS_PARAMETER, getEClass());
		return QueryInterpretor.executeQuery(QueryConstants.GET_AVAILABLE__CAPABILITY__INTERACTING_ACTORS, element, context);
	}

	@Override
	public List<CapellaElement> getCurrentElements(CapellaElement element, boolean onlyGenerated) {
		QueryContext context = new QueryContext();
		context.putValue(QueryConstants.ECLASS_PARAMETER, getEClass());
		return QueryInterpretor.executeQuery(QueryConstants.GET_CURRENT__CAPABILITY__INTERACTING_ACTORS, element, context);
	}
}
