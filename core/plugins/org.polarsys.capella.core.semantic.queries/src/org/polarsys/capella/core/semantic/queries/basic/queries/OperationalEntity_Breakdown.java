/*******************************************************************************
 * Copyright (c) 2006, 2020 THALES GLOBAL SERVICES.
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

package org.polarsys.capella.core.semantic.queries.basic.queries;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.oa.Entity;
import org.polarsys.capella.common.helpers.query.IQuery;

/**
 * This query allows to get the sub entities of an Entity for the semantic browser.
 * 
 *
 */
public class OperationalEntity_Breakdown implements IQuery {

  public OperationalEntity_Breakdown() {
    // does nothing
  }

  /**
   * @see org.polarsys.capella.common.helpers.query.IQuery#compute(java.lang.Object)
   */
  public List<Object> compute(Object object) {
    List<Object> result = new ArrayList<Object>();
    if (object instanceof Entity) {
      Entity e = (Entity) object;
      EList<Entity> subEntities = e.getSubEntities();
      if(!subEntities.isEmpty())
    	  result.addAll(subEntities);
    }
    return result;
  }
}
