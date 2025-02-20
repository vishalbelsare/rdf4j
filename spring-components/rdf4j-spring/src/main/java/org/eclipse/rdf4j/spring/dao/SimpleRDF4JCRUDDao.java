/*******************************************************************************
 * Copyright (c) 2021 Eclipse RDF4J contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Distribution License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *******************************************************************************/

package org.eclipse.rdf4j.spring.dao;

import org.eclipse.rdf4j.spring.support.RDF4JTemplate;

public abstract class SimpleRDF4JCRUDDao<ENTITY, ID> extends RDF4JCRUDDao<ENTITY, ENTITY, ID> {
	public SimpleRDF4JCRUDDao(RDF4JTemplate rdf4JTemplate, Class<ID> idClass) {
		super(rdf4JTemplate, idClass);
	}

	public SimpleRDF4JCRUDDao(RDF4JTemplate rdf4JTemplate) {
		super(rdf4JTemplate);
	}
}
