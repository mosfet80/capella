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

package org.polarsys.capella.common.ui.toolkit.browser.content.provider.wrapper;

import org.polarsys.capella.common.ui.toolkit.browser.category.CategoryImpl;
import org.polarsys.capella.common.ui.toolkit.browser.category.ICategory;

/**
 * Wrapper for a ICategory element whose isTechnical attribute is set to true.
 */
public class TechnicalCategoryWrapper extends BrowserElementWrapper {
  /**
   * Constructor.
   * 
   * @param element
   */
  public TechnicalCategoryWrapper(ICategory element) {
    super(element);
  }

  @Override
  public CategoryImpl getElement() {
    return (CategoryImpl) super.getElement();
  }
  
  @Override
  public String toString() {
    return getElement().getName();
  }
}
