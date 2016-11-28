/**
 */
package rmm.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import rmm.AlternateKey;
import rmm.Attribute;
import rmm.RmmPackage;
import rmm.Table;
import rmm.Trigger;
import rmm.UniqueKey;

/**
 * This is the item provider adapter for a {@link rmm.AlternateKey} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AlternateKeyItemProvider extends ConstraintItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternateKeyItemProvider(AdapterFactory adapterFactory) {
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

			addAttributesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Attributes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	protected void addAttributesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
		(new ItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AlternateKey_attributes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AlternateKey_attributes_feature", "_UI_AlternateKey_type"),
				 RmmPackage.Literals.ALTERNATE_KEY__ATTRIBUTES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null) { 
			@Override
			public Collection<?> getChoiceOfValues(Object object) {
				AlternateKey uniqueKey = (AlternateKey) object;												
				Table table = (Table) uniqueKey.eContainer(); // Retrieve the classroom students					
				List<Attribute> attributes = new ArrayList<Attribute>(); // Copy the students to a temporary list
				attributes.addAll(table.getAttributes());
				attributes.remove(object); // Removes the student himself from the available friends
				// Sorts the result
				Collections.sort(attributes, new Comparator<Attribute>() {
					@Override
					public int compare(Attribute s1, Attribute s2) {
						String s1Name = s1.getName();
						String s2Name = s2.getName();
						if (s1Name == null && s2Name == null) {
							return 0;
						}
						else if (s1Name == null) {
							return 1;
						}
						else if (s2Name == null) {
							return -1;
						}
						else {
							return s1Name.compareTo(s2Name);
						}
					}
				});
				return attributes;
			}
		} );

	}

	/**
	 * This returns AlternateKey.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AlternateKey"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AlternateKey)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AlternateKey_type") :
			getString("_UI_AlternateKey_type") + " " + label;
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
	}

}
