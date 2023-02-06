/*******************************************************************************
 * Copyright (c) 2023 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.core.sirius.ui.testers;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.fa.ComponentExchange;

public class ValidCECategoryMenuTargetTester extends AbstractValidCategoryMenuTargetTester {

  public ValidCECategoryMenuTargetTester() {
  }

  @Override
  protected boolean isValidContext(EObject context) {
    return context instanceof ComponentExchange;
  }

  @Override
  protected Class<? extends EObject> getTargetClass() {
    return ComponentExchange.class;
  }

  @Override
  protected String getPropertyId() {
    return "isValidCECategoryMenuTarget";
  }
}
