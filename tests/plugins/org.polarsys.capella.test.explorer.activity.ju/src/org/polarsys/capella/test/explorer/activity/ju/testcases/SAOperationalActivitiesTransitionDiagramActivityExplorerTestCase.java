/*******************************************************************************
 * Copyright (c) 2019, 2020 THALES GLOBAL SERVICES.
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

package org.polarsys.capella.test.explorer.activity.ju.testcases;

import java.util.Collections;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.polarsys.capella.common.data.modellingcore.ModelElement;
import org.polarsys.capella.common.helpers.TransactionHelper;
import org.polarsys.capella.core.data.capellacore.CapellaElement;
import org.polarsys.capella.core.data.fa.AbstractFunction;
import org.polarsys.capella.core.explorer.activity.ui.hyperlinkadapter.AbstractCapellaHyperlinkAdapter;
import org.polarsys.capella.core.explorer.activity.ui.hyperlinkadapter.sa.PerformAutomatedTransitionAdapter;

public class SAOperationalActivitiesTransitionDiagramActivityExplorerTestCase
    extends TransitionDiagramActivityExplorerTestCase {

  @Override
  public AbstractCapellaHyperlinkAdapter createLink() {
    return new PerformAutomatedTransitionAdapter() {
      @Override
      public void linkPressed(HyperlinkEvent event, EObject rootSemanticModel, Session session) {
        ModelElement modelElement = getModelElement(rootSemanticModel);
        if (modelElement != null) {
          TransactionHelper.getExecutionManager(modelElement)
              .execute(org.polarsys.capella.core.transition.system.topdown.commands.TransitionCommandHelper
                  .getInstance().getFunctionalTransitionCommand(Collections.singleton((Object) modelElement),
                      new NullProgressMonitor()));

        }
      }
    };
  }

  @Override
  public ModelElement getTestModelElement() {
    return ((PerformAutomatedTransitionAdapter) link).getModelElement(project);
  }

  @Override
  public CapellaElement getContainer() {
    return context.getSemanticElement(OA__OPERATIONAL_ACTIVITIES__ROOT_OA);

  }

  @Override
  public AbstractFunction getRoot() {
    return context.getSemanticElement(SA__ROOT_SF);

  }

  @Override
  public void executeTransition() {
    ((PerformAutomatedTransitionAdapter) link).linkPressed(null, project, session);
  }

}
