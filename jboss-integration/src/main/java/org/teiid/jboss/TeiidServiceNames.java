/*
 * JBoss, Home of Professional Open Source.
 * See the COPYRIGHT.txt file distributed with this work for information
 * regarding copyright ownership.  Some portions may be licensed
 * to Red Hat, Inc. under one or more contributor license agreements.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301 USA.
 */
package org.teiid.jboss;

import org.jboss.msc.service.ServiceName;

public class TeiidServiceNames {
	public static ServiceName ENGINE = ServiceName.JBOSS.append("teiid", "query-engine");
	public static ServiceName TRANSLATOR_REPO = ServiceName.JBOSS.append("teiid", "translator-repository");
	static ServiceName TRANSLATOR_BASE = ServiceName.JBOSS.append("teiid", "translator");
	public static ServiceName BUFFER_DIR = ServiceName.JBOSS.append("teiid", "buffer.dir");
	public static ServiceName BUFFER_MGR = ServiceName.JBOSS.append("teiid", "buffer-mgr");
	
	public static ServiceName translatorServiceName(String name) {
		return TRANSLATOR_BASE.append(name);
	}
}
