/*******************************************************************************
 * Copyright (c) 2022 THALES GLOBAL SERVICES.
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
package org.polarsys.capella.test.semantic.queries.ju.testcases;

import org.polarsys.capella.test.semantic.queries.ju.model.SemanticQueries;

public class EntityOutgoingCommunicationMeans extends SemanticQueries {
  String QUERY = "org.polarsys.capella.core.semantic.queries.OperationalEntity_OutgoingCommunicationMean";

  @Override
  protected String getQueryCategoryIdentifier() {
    return QUERY;
  }

  @Override
  public void test() throws Exception {
      testQueryIncludingItemQueries(OA__OPERATIONAL_ENTITIES__OPERATIONALACTOR_4, OA__COMM_MEANS_4, OA__OPERATIONAL_ENTITIES__ENTITY_5);
  }
}
