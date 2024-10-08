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
package org.polarsys.capella.test.diagram.tools.ju.xab;

import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.description.tool.DirectEditLabel;
import org.eclipse.sirius.viewpoint.description.tool.AbstractToolDescription;
import org.polarsys.capella.core.data.capellacore.Constraint;
import org.polarsys.capella.test.diagram.common.ju.context.CDBDiagram;
import org.polarsys.capella.test.diagram.common.ju.context.XABDiagram;
import org.polarsys.capella.test.diagram.common.ju.step.tools.RenameTool;
import org.polarsys.capella.test.diagram.common.ju.wrapper.utils.ToolHelper;
import org.polarsys.capella.test.framework.context.SessionContext;
import org.polarsys.capella.test.framework.model.GenericModel;

public class ConstraintRename extends XABDiagramsProject {
  public static String RENAME_CONSTRAINT_TOOL = "Constraint Content";
  public static String NEW_NAME = "New Constraint";

  @Override
  public void test() throws Exception {
    Session session = getSession(getRequiredTestModel());
    SessionContext context = new SessionContext(session);

    testOnCDB(session, context);
    testOnXAB(session, context, EPBS__EAB_COTSC1);
    testOnXAB(session, context, OA__OAB_ENTITY1);
    testOnXAB(session, context, SA__SAB_SYSTEM);
    testOnXAB(session, context, LA__LAB_LOGICAL_SYSTEM);
    testOnXAB(session, context, PA__PAB_PHYSICAL_SYSTEM);
  }

  private void testOnCDB(Session session, SessionContext context) {
    final CDBDiagram cdbDiagram = CDBDiagram.createDiagram(context, LA__DATA);
    ToolHelper toolhelper = new ToolHelper(session, cdbDiagram.getDiagram());
    AbstractToolDescription tool = toolhelper.getTool(RENAME_CONSTRAINT_TOOL);
    assertTrue("Rename tool has not been found", tool != null && tool instanceof DirectEditLabel);
    
    DirectEditLabel renameTool = (DirectEditLabel) tool;
    assertTrue("Constraint's name should be displayed when rename tool is applied",
        renameTool.getInputLabelExpression() != null && renameTool.getInputLabelExpression().equals("feature:name"));
  }

  public void testOnXAB(Session session, SessionContext context, String element) {
    XABDiagram xabDiagram = XABDiagram.createDiagram(context, element);
    xabDiagram.createConstraint(GenericModel.CONSTRAINT_1);
    Constraint constraint = (Constraint) xabDiagram.getSessionContext().getSemanticElement(GenericModel.CONSTRAINT_1);
    new RenameTool(xabDiagram, RENAME_CONSTRAINT_TOOL, constraint, NEW_NAME).run();
    assertTrue("The constraint has not been renamed", constraint.getName().equals(NEW_NAME));
  }
}
