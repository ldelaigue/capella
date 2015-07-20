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
package org.polarsys.capella.core.business.queries.capellacommon;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.polarsys.capella.common.data.modellingcore.ModellingcorePackage;
import org.polarsys.capella.common.queries.interpretor.QueryInterpretor;
import org.polarsys.capella.common.queries.queryContext.QueryContext;
import org.polarsys.capella.core.business.queries.IBusinessQuery;
import org.polarsys.capella.core.business.queries.QueryConstants;
import org.polarsys.capella.core.data.capellacommon.CapellacommonPackage;
import org.polarsys.capella.core.data.capellacore.CapellaElement;

/**
 */
public class Mode_ReferencedStates extends AbstractState_ReferencedStates implements IBusinessQuery {

	/**
	 * @see org.polarsys.capella.core.business.queries.IBusinessQuery#getEStructuralFeature()
	 */
	@Override
	public List<EReference> getEStructuralFeatures() {
		return Collections.singletonList(ModellingcorePackage.Literals.ISTATE__REFERENCED_STATES);
	}

	/**
	 * @see org.polarsys.capella.core.business.queries.IBusinessQuery#getEClass()
	 */
	@Override
	public EClass getEClass() {
		return CapellacommonPackage.Literals.MODE;
	}

	@Override
	public List<CapellaElement> getAvailableElements(CapellaElement element) {
		QueryContext context = new QueryContext();
		context.putValue(QueryConstants.ECLASS_PARAMETER, getEClass());
		return QueryInterpretor.executeQuery(QueryConstants.GET_AVAILABLE__MODE__REFERENCED_STATES, element, context);
	}

	@Override
	public List<CapellaElement> getCurrentElements(CapellaElement element, boolean onlyGenerated) {
		QueryContext context = new QueryContext();
		context.putValue(QueryConstants.ECLASS_PARAMETER, getEClass());
		return QueryInterpretor.executeQuery(QueryConstants.GET_CURRENT__MODE__REFERENCED_STATES, element, context);
	}
}
