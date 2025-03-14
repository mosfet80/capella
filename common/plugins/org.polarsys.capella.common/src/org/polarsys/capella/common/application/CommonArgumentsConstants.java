/*******************************************************************************
 * Copyright (c) 2017, 2020 THALES GLOBAL SERVICES.
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
package org.polarsys.capella.common.application;

import org.eclipse.osgi.util.NLS;

public class CommonArgumentsConstants extends NLS {
  private static final String BUNDLE_NAME = "org.polarsys.capella.common.application.messages"; //$NON-NLS-1$

  public static String LOG_FILE_PATH;
  public static String LOG_FILE_PATH__DESCRIPTION;
  
  
  static {
    // initialize resource bundle
    NLS.initializeMessages(BUNDLE_NAME, CommonArgumentsConstants.class);
  }

  private CommonArgumentsConstants() {
  }
}
