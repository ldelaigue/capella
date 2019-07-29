/**
 * 
 *   Copyright (c) 2006, 2019 THALES DMS FRANCE.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *  
 *   Contributors:
 *      Thales - initial API and implementation
 *  
 */
package org.polarsys.capella.viatra.core.data.ctx.surrogate;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.polarsys.capella.viatra.core.data.ctx.surrogate.Mission__exploitedCapabilities;
import org.polarsys.capella.viatra.core.data.ctx.surrogate.Mission__involvedActors;
import org.polarsys.capella.viatra.core.data.ctx.surrogate.Mission__involvedSystem;
import org.polarsys.capella.viatra.core.data.ctx.surrogate.Mission__participatingActors;
import org.polarsys.capella.viatra.core.data.ctx.surrogate.Mission__participatingSystem;

/**
 * A pattern group formed of all public patterns defined in Mission.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file Mission.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.polarsys.capella.viatra.core.data.ctx.surrogate, the group contains the definition of the following patterns: <ul>
 * <li>Mission__participatingActors</li>
 * <li>Mission__participatingSystem</li>
 * <li>Mission__involvedActors</li>
 * <li>Mission__involvedSystem</li>
 * <li>Mission__exploitedCapabilities</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class Mission extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Mission instance() {
    if (INSTANCE == null) {
        INSTANCE = new Mission();
    }
    return INSTANCE;
  }
  
  private static Mission INSTANCE;
  
  private Mission() {
    querySpecifications.add(Mission__participatingActors.instance());
    querySpecifications.add(Mission__participatingSystem.instance());
    querySpecifications.add(Mission__involvedActors.instance());
    querySpecifications.add(Mission__involvedSystem.instance());
    querySpecifications.add(Mission__exploitedCapabilities.instance());
  }
  
  public Mission__participatingActors getMission__participatingActors() {
    return Mission__participatingActors.instance();
  }
  
  public Mission__participatingActors.Matcher getMission__participatingActors(final ViatraQueryEngine engine) {
    return Mission__participatingActors.Matcher.on(engine);
  }
  
  public Mission__participatingSystem getMission__participatingSystem() {
    return Mission__participatingSystem.instance();
  }
  
  public Mission__participatingSystem.Matcher getMission__participatingSystem(final ViatraQueryEngine engine) {
    return Mission__participatingSystem.Matcher.on(engine);
  }
  
  public Mission__involvedActors getMission__involvedActors() {
    return Mission__involvedActors.instance();
  }
  
  public Mission__involvedActors.Matcher getMission__involvedActors(final ViatraQueryEngine engine) {
    return Mission__involvedActors.Matcher.on(engine);
  }
  
  public Mission__involvedSystem getMission__involvedSystem() {
    return Mission__involvedSystem.instance();
  }
  
  public Mission__involvedSystem.Matcher getMission__involvedSystem(final ViatraQueryEngine engine) {
    return Mission__involvedSystem.Matcher.on(engine);
  }
  
  public Mission__exploitedCapabilities getMission__exploitedCapabilities() {
    return Mission__exploitedCapabilities.instance();
  }
  
  public Mission__exploitedCapabilities.Matcher getMission__exploitedCapabilities(final ViatraQueryEngine engine) {
    return Mission__exploitedCapabilities.Matcher.on(engine);
  }
}