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

package org.polarsys.capella.common.re.commands;

import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;
import org.polarsys.capella.common.re.launcher.CreateReplicaLauncher;
import org.polarsys.capella.common.re.launcher.ReLauncher;
import org.polarsys.capella.core.transition.common.commands.LauncherCommand;

/**
 *
 */
public class CreateReplicaCommand extends LauncherCommand {

  /**
   * @param selection
   * @param progressMonitor
   */
  public CreateReplicaCommand(Collection<?> selection, IProgressMonitor progressMonitor) {
    super(selection, progressMonitor);
  }

  @Override
  protected ReLauncher createLauncher() {
    return new CreateReplicaLauncher();
  }
}
