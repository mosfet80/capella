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
package org.polarsys.capella.viatra.core.data.oa.surrogate;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import org.polarsys.capella.core.data.oa.OperationalAnalysis;
import org.polarsys.capella.core.data.oa.OperationalCapabilityPkg;
import org.polarsys.capella.viatra.core.data.oa.surrogate.OperationalAnalysis__containedOperationalCapabilityPkgMatch;
import org.polarsys.capella.viatra.core.data.oa.surrogate.util.OperationalAnalysis__containedOperationalCapabilityPkgQuerySpecification;

/**
 * Generated pattern matcher API of the org.polarsys.capella.viatra.core.data.oa.surrogate.OperationalAnalysis__containedOperationalCapabilityPkg pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
 * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link OperationalAnalysis__containedOperationalCapabilityPkgMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * // End of user code
 * 
 * {@literal @}Surrogate(feature="containedOperationalCapabilityPkg")
 * pattern OperationalAnalysis__containedOperationalCapabilityPkg(self : OperationalAnalysis, target : OperationalCapabilityPkg) {
 * 	OperationalAnalysis.ownedAbstractCapabilityPkg(self, target);
 * }
 * </pre></code>
 * 
 * @see OperationalAnalysis__containedOperationalCapabilityPkgMatch
 * @see OperationalAnalysis__containedOperationalCapabilityPkgProcessor
 * @see OperationalAnalysis__containedOperationalCapabilityPkgQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class OperationalAnalysis__containedOperationalCapabilityPkgMatcher extends BaseMatcher<OperationalAnalysis__containedOperationalCapabilityPkgMatch> {
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static OperationalAnalysis__containedOperationalCapabilityPkgMatcher on(final ViatraQueryEngine engine) throws ViatraQueryException {
    // check if matcher already exists
    OperationalAnalysis__containedOperationalCapabilityPkgMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
        matcher = (OperationalAnalysis__containedOperationalCapabilityPkgMatcher)engine.getMatcher(querySpecification());
    }
    return matcher;
  }
  
  /**
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * @return an initialized matcher
   * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
   * 
   */
  public static OperationalAnalysis__containedOperationalCapabilityPkgMatcher create() throws ViatraQueryException {
    return new OperationalAnalysis__containedOperationalCapabilityPkgMatcher();
  }
  
  private final static int POSITION_SELF = 0;
  
  private final static int POSITION_TARGET = 1;
  
  private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(OperationalAnalysis__containedOperationalCapabilityPkgMatcher.class);
  
  /**
   * Initializes the pattern matcher within an existing VIATRA Query engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing VIATRA Query engine in which this matcher will be created.
   * @throws ViatraQueryException if an error occurs during pattern matcher creation
   * 
   */
  private OperationalAnalysis__containedOperationalCapabilityPkgMatcher() throws ViatraQueryException {
    super(querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSelf the fixed value of pattern parameter self, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return matches represented as a OperationalAnalysis__containedOperationalCapabilityPkgMatch object.
   * 
   */
  public Collection<OperationalAnalysis__containedOperationalCapabilityPkgMatch> getAllMatches(final OperationalAnalysis pSelf, final OperationalCapabilityPkg pTarget) {
    return rawGetAllMatches(new Object[]{pSelf, pTarget});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSelf the fixed value of pattern parameter self, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return a match represented as a OperationalAnalysis__containedOperationalCapabilityPkgMatch object, or null if no match is found.
   * 
   */
  public OperationalAnalysis__containedOperationalCapabilityPkgMatch getOneArbitraryMatch(final OperationalAnalysis pSelf, final OperationalCapabilityPkg pTarget) {
    return rawGetOneArbitraryMatch(new Object[]{pSelf, pTarget});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pSelf the fixed value of pattern parameter self, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final OperationalAnalysis pSelf, final OperationalCapabilityPkg pTarget) {
    return rawHasMatch(new Object[]{pSelf, pTarget});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pSelf the fixed value of pattern parameter self, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final OperationalAnalysis pSelf, final OperationalCapabilityPkg pTarget) {
    return rawCountMatches(new Object[]{pSelf, pTarget});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pSelf the fixed value of pattern parameter self, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final OperationalAnalysis pSelf, final OperationalCapabilityPkg pTarget, final IMatchProcessor<? super OperationalAnalysis__containedOperationalCapabilityPkgMatch> processor) {
    rawForEachMatch(new Object[]{pSelf, pTarget}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pSelf the fixed value of pattern parameter self, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final OperationalAnalysis pSelf, final OperationalCapabilityPkg pTarget, final IMatchProcessor<? super OperationalAnalysis__containedOperationalCapabilityPkgMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pSelf, pTarget}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pSelf the fixed value of pattern parameter self, or null if not bound.
   * @param pTarget the fixed value of pattern parameter target, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public OperationalAnalysis__containedOperationalCapabilityPkgMatch newMatch(final OperationalAnalysis pSelf, final OperationalCapabilityPkg pTarget) {
    return OperationalAnalysis__containedOperationalCapabilityPkgMatch.newMatch(pSelf, pTarget);
  }
  
  /**
   * Retrieve the set of values that occur in matches for self.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<OperationalAnalysis> rawAccumulateAllValuesOfself(final Object[] parameters) {
    Set<OperationalAnalysis> results = new HashSet<OperationalAnalysis>();
    rawAccumulateAllValues(POSITION_SELF, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for self.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<OperationalAnalysis> getAllValuesOfself() {
    return rawAccumulateAllValuesOfself(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for self.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<OperationalAnalysis> getAllValuesOfself(final OperationalAnalysis__containedOperationalCapabilityPkgMatch partialMatch) {
    return rawAccumulateAllValuesOfself(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for self.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<OperationalAnalysis> getAllValuesOfself(final OperationalCapabilityPkg pTarget) {
    return rawAccumulateAllValuesOfself(new Object[]{
    null, 
    pTarget
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  protected Set<OperationalCapabilityPkg> rawAccumulateAllValuesOftarget(final Object[] parameters) {
    Set<OperationalCapabilityPkg> results = new HashSet<OperationalCapabilityPkg>();
    rawAccumulateAllValues(POSITION_TARGET, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<OperationalCapabilityPkg> getAllValuesOftarget() {
    return rawAccumulateAllValuesOftarget(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<OperationalCapabilityPkg> getAllValuesOftarget(final OperationalAnalysis__containedOperationalCapabilityPkgMatch partialMatch) {
    return rawAccumulateAllValuesOftarget(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for target.
   * @return the Set of all values or empty set if there are no matches
   * 
   */
  public Set<OperationalCapabilityPkg> getAllValuesOftarget(final OperationalAnalysis pSelf) {
    return rawAccumulateAllValuesOftarget(new Object[]{
    pSelf, 
    null
    });
  }
  
  @Override
  protected OperationalAnalysis__containedOperationalCapabilityPkgMatch tupleToMatch(final Tuple t) {
    try {
        return OperationalAnalysis__containedOperationalCapabilityPkgMatch.newMatch((OperationalAnalysis) t.get(POSITION_SELF), (OperationalCapabilityPkg) t.get(POSITION_TARGET));
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in tuple not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected OperationalAnalysis__containedOperationalCapabilityPkgMatch arrayToMatch(final Object[] match) {
    try {
        return OperationalAnalysis__containedOperationalCapabilityPkgMatch.newMatch((OperationalAnalysis) match[POSITION_SELF], (OperationalCapabilityPkg) match[POSITION_TARGET]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  @Override
  protected OperationalAnalysis__containedOperationalCapabilityPkgMatch arrayToMatchMutable(final Object[] match) {
    try {
        return OperationalAnalysis__containedOperationalCapabilityPkgMatch.newMutableMatch((OperationalAnalysis) match[POSITION_SELF], (OperationalCapabilityPkg) match[POSITION_TARGET]);
    } catch(ClassCastException e) {
        LOGGER.error("Element(s) in array not properly typed!",e);
        return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws ViatraQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<OperationalAnalysis__containedOperationalCapabilityPkgMatcher> querySpecification() throws ViatraQueryException {
    return OperationalAnalysis__containedOperationalCapabilityPkgQuerySpecification.instance();
  }
}