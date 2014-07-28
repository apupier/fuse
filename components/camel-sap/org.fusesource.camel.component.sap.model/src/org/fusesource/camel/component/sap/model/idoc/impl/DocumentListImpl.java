/**
 * Copyright 2014 Red Hat, Inc.
 * 
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 * 
 */
package org.fusesource.camel.component.sap.model.idoc.impl;

import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.fusesource.camel.component.sap.model.idoc.Document;
import org.fusesource.camel.component.sap.model.idoc.DocumentList;
import org.fusesource.camel.component.sap.model.idoc.IdocFactory;
import org.fusesource.camel.component.sap.model.idoc.IdocPackage;
import org.fusesource.camel.component.sap.model.idoc.Segment;

import static org.fusesource.camel.component.sap.model.idoc.IdocPackage.eNS_URI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.fusesource.camel.component.sap.model.idoc.impl.DocumentListImpl#getIdocType <em>Idoc Type</em>}</li>
 *   <li>{@link org.fusesource.camel.component.sap.model.idoc.impl.DocumentListImpl#getIdocTypeExtension <em>Idoc Type Extension</em>}</li>
 *   <li>{@link org.fusesource.camel.component.sap.model.idoc.impl.DocumentListImpl#getSystemRelease <em>System Release</em>}</li>
 *   <li>{@link org.fusesource.camel.component.sap.model.idoc.impl.DocumentListImpl#getApplicationRelease <em>Application Release</em>}</li>
 *   <li>{@link org.fusesource.camel.component.sap.model.idoc.impl.DocumentListImpl#getDocuments <em>Documents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentListImpl extends EObjectImpl implements DocumentList {

	private EClass rootSegmentClass;
	
	/**
	 * The default value of the '{@link #getIdocType() <em>Idoc Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdocType()
	 * @generated
	 * @ordered
	 */
	protected static final String IDOC_TYPE_EDEFAULT = "";

	/**
	 * The default value of the '{@link #getIdocTypeExtension() <em>Idoc Type Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdocTypeExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String IDOC_TYPE_EXTENSION_EDEFAULT = "";

	/**
	 * The default value of the '{@link #getSystemRelease() <em>System Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemRelease()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_RELEASE_EDEFAULT = "";

	/**
	 * The default value of the '{@link #getApplicationRelease() <em>Application Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationRelease()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_RELEASE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDocuments() <em>Documents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<Document> documents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IdocPackage.Literals.DOCUMENT_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getIdocType() {
		String idocType = null;
		EAnnotation idocAnnotation = rootSegmentClass.getEAnnotation(IdocPackage.eNS_URI);
		if (idocAnnotation != null) {
			idocType = idocAnnotation.getDetails().get("idocType");
		}
		return idocType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setIdocType(String newIdocType) {
		// NOOP
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getIdocTypeExtension() {
		String idocTypeExtension = null;
		EAnnotation idocAnnotation = rootSegmentClass.getEAnnotation(IdocPackage.eNS_URI);
		if (idocAnnotation != null) {
			idocTypeExtension = idocAnnotation.getDetails().get("idocTypeExtension");
		}
		return idocTypeExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setIdocTypeExtension(String newIdocTypeExtension) {
		// NOOP
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getSystemRelease() {
		String systemRelease = null;
		EAnnotation idocAnnotation = rootSegmentClass.getEAnnotation(IdocPackage.eNS_URI);
		if (idocAnnotation != null) {
			systemRelease = idocAnnotation.getDetails().get("systemRelease");
		}
		return systemRelease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setSystemRelease(String newSystemRelease) {
		// NOOP
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getApplicationRelease() {
		String applicationRelease = null;
		EAnnotation idocAnnotation = rootSegmentClass.getEAnnotation(IdocPackage.eNS_URI);
		if (idocAnnotation != null) {
			applicationRelease = idocAnnotation.getDetails().get("applicationRelease");
		}
		return applicationRelease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setApplicationRelease(String newApplicationRelease) {
		// NOOP
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Document> getDocuments() {
		if (documents == null) {
			documents = new EObjectContainmentEList<Document>(Document.class, this, IdocPackage.DOCUMENT_LIST__DOCUMENTS);
		}
		return documents;
	}

	public EClass getRootSegmentClass() {
		return rootSegmentClass;
	}

	public void setRootSegmentClass(EClass rootSegmentClass) {
		this.rootSegmentClass = rootSegmentClass;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Document add() {
		Document document = createIDoc();
		add(document);
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document add(int index) {
		Document document = createIDoc();
		add(index, document);
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IdocPackage.DOCUMENT_LIST__DOCUMENTS:
				return ((InternalEList<?>)getDocuments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IdocPackage.DOCUMENT_LIST__IDOC_TYPE:
				return getIdocType();
			case IdocPackage.DOCUMENT_LIST__IDOC_TYPE_EXTENSION:
				return getIdocTypeExtension();
			case IdocPackage.DOCUMENT_LIST__SYSTEM_RELEASE:
				return getSystemRelease();
			case IdocPackage.DOCUMENT_LIST__APPLICATION_RELEASE:
				return getApplicationRelease();
			case IdocPackage.DOCUMENT_LIST__DOCUMENTS:
				return getDocuments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IdocPackage.DOCUMENT_LIST__IDOC_TYPE:
				setIdocType((String)newValue);
				return;
			case IdocPackage.DOCUMENT_LIST__IDOC_TYPE_EXTENSION:
				setIdocTypeExtension((String)newValue);
				return;
			case IdocPackage.DOCUMENT_LIST__SYSTEM_RELEASE:
				setSystemRelease((String)newValue);
				return;
			case IdocPackage.DOCUMENT_LIST__APPLICATION_RELEASE:
				setApplicationRelease((String)newValue);
				return;
			case IdocPackage.DOCUMENT_LIST__DOCUMENTS:
				getDocuments().clear();
				getDocuments().addAll((Collection<? extends Document>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IdocPackage.DOCUMENT_LIST__IDOC_TYPE:
				setIdocType(IDOC_TYPE_EDEFAULT);
				return;
			case IdocPackage.DOCUMENT_LIST__IDOC_TYPE_EXTENSION:
				setIdocTypeExtension(IDOC_TYPE_EXTENSION_EDEFAULT);
				return;
			case IdocPackage.DOCUMENT_LIST__SYSTEM_RELEASE:
				setSystemRelease(SYSTEM_RELEASE_EDEFAULT);
				return;
			case IdocPackage.DOCUMENT_LIST__APPLICATION_RELEASE:
				setApplicationRelease(APPLICATION_RELEASE_EDEFAULT);
				return;
			case IdocPackage.DOCUMENT_LIST__DOCUMENTS:
				getDocuments().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IdocPackage.DOCUMENT_LIST__IDOC_TYPE:
				return IDOC_TYPE_EDEFAULT == null ? getIdocType() != null : !IDOC_TYPE_EDEFAULT.equals(getIdocType());
			case IdocPackage.DOCUMENT_LIST__IDOC_TYPE_EXTENSION:
				return IDOC_TYPE_EXTENSION_EDEFAULT == null ? getIdocTypeExtension() != null : !IDOC_TYPE_EXTENSION_EDEFAULT.equals(getIdocTypeExtension());
			case IdocPackage.DOCUMENT_LIST__SYSTEM_RELEASE:
				return SYSTEM_RELEASE_EDEFAULT == null ? getSystemRelease() != null : !SYSTEM_RELEASE_EDEFAULT.equals(getSystemRelease());
			case IdocPackage.DOCUMENT_LIST__APPLICATION_RELEASE:
				return APPLICATION_RELEASE_EDEFAULT == null ? getApplicationRelease() != null : !APPLICATION_RELEASE_EDEFAULT.equals(getApplicationRelease());
			case IdocPackage.DOCUMENT_LIST__DOCUMENTS:
				return documents != null && !documents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public void move(int newPosition, Document object) {
		getDocuments().move(newPosition, object);
	}

	public Document move(int newPosition, int oldPosition) {
		return getDocuments().move(newPosition, oldPosition);
	}

	public int size() {
		return getDocuments().size();
	}

	public boolean isEmpty() {
		return getDocuments().isEmpty();
	}

	public boolean contains(Object o) {
		return getDocuments().contains(o);
	}

	public Iterator<Document> iterator() {
		return getDocuments().iterator();
	}

	public Object[] toArray() {
		return getDocuments().toArray();
	}

	public <T> T[] toArray(T[] a) {
		return getDocuments().toArray(a);
	}

	public boolean add(Document e) {
		checkDocument(e);
		return getDocuments().add(e);
	}

	public boolean remove(Object o) {
		return getDocuments().remove(o);
	}

	public boolean containsAll(Collection<?> c) {
		return getDocuments().containsAll(c);
	}

	public boolean addAll(Collection<? extends Document> c) {
		checkDocuments(c);
		return getDocuments().addAll(c);
	}

	public boolean addAll(int index, Collection<? extends Document> c) {
		checkDocuments(c);
		return getDocuments().addAll(index, c);
	}

	public boolean removeAll(Collection<?> c) {
		return getDocuments().removeAll(c);
	}

	public boolean retainAll(Collection<?> c) {
		return getDocuments().retainAll(c);
	}

	public void clear() {
		getDocuments().clear();
	}

	public boolean equals(Object o) {
		return getDocuments().equals(o);
	}

	public int hashCode() {
		return getDocuments().hashCode();
	}

	public Document get(int index) {
		return getDocuments().get(index);
	}

	public Document set(int index, Document element) {
		checkDocument(element);
		return getDocuments().set(index, element);
	}

	public void add(int index, Document element) {
		checkDocument(element);
		getDocuments().add(index, element);
	}

	public Document remove(int index) {
		return getDocuments().remove(index);
	}

	public int indexOf(Object o) {
		return getDocuments().indexOf(o);
	}

	public int lastIndexOf(Object o) {
		return getDocuments().lastIndexOf(o);
	}

	public ListIterator<Document> listIterator() {
		return getDocuments().listIterator();
	}

	public ListIterator<Document> listIterator(int index) {
		return getDocuments().listIterator(index);
	}

	public List<Document> subList(int fromIndex, int toIndex) {
		return getDocuments().subList(fromIndex, toIndex);
	}

	private void checkDocuments(Collection<? extends Document> c) {
		for (Document doc: c) {
			checkDocument(doc);
		}
	}
	
	private void checkDocument(Document document) {
		if (document != null) {
			if (rootSegmentClass.equals(document.getRootSegment().eClass())) {
				return;
			}
		}
		throw new IllegalArgumentException("Document does not match kind of documents in this document list");
	}

	private Document createIDoc() {
		Segment segment = (Segment) rootSegmentClass.getEPackage().getEFactoryInstance().create(rootSegmentClass);
		DocumentImpl iDoc = (DocumentImpl) IdocFactory.eINSTANCE.createDocument();
		iDoc.setRootSegment(segment);
		((SegmentImpl) segment).setDocument(iDoc);
		iDoc.setIDocType(segment.getIdocType());
		iDoc.setIDocTypeExtension(segment.getIdocTypeExtension());
		Date now = new Date();
		iDoc.setCreationDate(now);
		iDoc.setCreationTime(now);
		String idocCompoundType = getAnnotation(segment.eClass(), eNS_URI, "compoundType");
		if (idocCompoundType == null) {
			iDoc.setIDocCompoundType(idocCompoundType);
		}

		return iDoc;
	}

	private String getAnnotation(EModelElement modelElement, String source, String key) {
		EAnnotation annotation = modelElement.getEAnnotation(source);
		if (annotation == null) {
			return null;
		}
		return annotation.getDetails().get(key);
	}
	
} //DocumentListImpl
