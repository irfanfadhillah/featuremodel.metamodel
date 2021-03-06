/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.featuremodel.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.featuremodel.AttributeValueEObject;
import org.eclipse.featuremodel.FeatureModelPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.featuremodel.AttributeValueEObject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeValueEObjectItemProvider
  extends AttributeValueItemProvider
  implements	
    IEditingDomainItemProvider,	
    IStructuredItemContentProvider,	
    ITreeItemContentProvider,	
    IItemLabelProvider,	
    IItemPropertySource {
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeValueEObjectItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
    if (itemPropertyDescriptors == null) {
      super.getPropertyDescriptors(object);

    }
    return itemPropertyDescriptors;
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
    if (childrenFeatures == null) {
      super.getChildrenFeatures(object);
      childrenFeatures.add(FeatureModelPackage.Literals.ATTRIBUTE_VALUE_EOBJECT__VALUE);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child) {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns AttributeValueEObject.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object) {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/AttributeValueEObject"));
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getText(Object object) {
    return getString("_UI_AttributeValueEObject_type");
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification) {
    updateChildren(notification);

    switch (notification.getFeatureID(AttributeValueEObject.class)) {
      case FeatureModelPackage.ATTRIBUTE_VALUE_EOBJECT__VALUE:
        fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
        return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
    super.collectNewChildDescriptors(newChildDescriptors, object);

    newChildDescriptors.add
      (createChildParameter
        (FeatureModelPackage.Literals.ATTRIBUTE_VALUE_EOBJECT__VALUE,
         EcoreFactory.eINSTANCE.createEObject()));

    newChildDescriptors.add
      (createChildParameter
        (FeatureModelPackage.Literals.ATTRIBUTE_VALUE_EOBJECT__VALUE,
         EcoreFactory.eINSTANCE.createEAttribute()));

    newChildDescriptors.add
      (createChildParameter
        (FeatureModelPackage.Literals.ATTRIBUTE_VALUE_EOBJECT__VALUE,
         EcoreFactory.eINSTANCE.createEAnnotation()));

    newChildDescriptors.add
      (createChildParameter
        (FeatureModelPackage.Literals.ATTRIBUTE_VALUE_EOBJECT__VALUE,
         EcoreFactory.eINSTANCE.createEClass()));

    newChildDescriptors.add
      (createChildParameter
        (FeatureModelPackage.Literals.ATTRIBUTE_VALUE_EOBJECT__VALUE,
         EcoreFactory.eINSTANCE.createEDataType()));

    newChildDescriptors.add
      (createChildParameter
        (FeatureModelPackage.Literals.ATTRIBUTE_VALUE_EOBJECT__VALUE,
         EcoreFactory.eINSTANCE.createEEnum()));

    newChildDescriptors.add
      (createChildParameter
        (FeatureModelPackage.Literals.ATTRIBUTE_VALUE_EOBJECT__VALUE,
         EcoreFactory.eINSTANCE.createEEnumLiteral()));

    newChildDescriptors.add
      (createChildParameter
        (FeatureModelPackage.Literals.ATTRIBUTE_VALUE_EOBJECT__VALUE,
         EcoreFactory.eINSTANCE.createEFactory()));

    newChildDescriptors.add
      (createChildParameter
        (FeatureModelPackage.Literals.ATTRIBUTE_VALUE_EOBJECT__VALUE,
         EcoreFactory.eINSTANCE.createEOperation()));

    newChildDescriptors.add
      (createChildParameter
        (FeatureModelPackage.Literals.ATTRIBUTE_VALUE_EOBJECT__VALUE,
         EcoreFactory.eINSTANCE.createEPackage()));

    newChildDescriptors.add
      (createChildParameter
        (FeatureModelPackage.Literals.ATTRIBUTE_VALUE_EOBJECT__VALUE,
         EcoreFactory.eINSTANCE.createEParameter()));

    newChildDescriptors.add
      (createChildParameter
        (FeatureModelPackage.Literals.ATTRIBUTE_VALUE_EOBJECT__VALUE,
         EcoreFactory.eINSTANCE.createEReference()));

    newChildDescriptors.add
      (createChildParameter
        (FeatureModelPackage.Literals.ATTRIBUTE_VALUE_EOBJECT__VALUE,
         EcoreFactory.eINSTANCE.createEGenericType()));

    newChildDescriptors.add
      (createChildParameter
        (FeatureModelPackage.Literals.ATTRIBUTE_VALUE_EOBJECT__VALUE,
         EcoreFactory.eINSTANCE.createETypeParameter()));
  }

  /**
   * Return the resource locator for this item provider's resources.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator() {
    return FeatureModelEditPlugin.INSTANCE;
  }

}
