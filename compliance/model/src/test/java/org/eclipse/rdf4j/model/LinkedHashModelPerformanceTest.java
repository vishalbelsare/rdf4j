/*******************************************************************************
 * Copyright (c) 2015 Eclipse RDF4J contributors, Aduna, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Distribution License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *******************************************************************************/
package org.eclipse.rdf4j.model;

import org.eclipse.rdf4j.model.impl.LinkedHashModel;
import org.eclipse.rdf4j.testsuite.model.AbstractModelPerformanceTest;

/**
 * @author Peter Ansell
 */
public class LinkedHashModelPerformanceTest extends AbstractModelPerformanceTest {

	@Override
	protected Model getNewModel() {
		return new LinkedHashModel();
	}

}
